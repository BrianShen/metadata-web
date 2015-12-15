/**
 * Created by wei.shen on 2015/10/5.
 */

metaApp.controller("HiveDetailCtrl",function($scope,$resource) {
    /**
     * 定义http资源
     */
    var model = $resource("/meta/tables/:tableId",{tableId:"@tableId"});
    var columns = $resource("/meta/columns",{tableId:'@tableId',isPartition:'@isPartition'});
    var columnsComment = $resource("/meta/columns",{tableId:'@tableId',columnIds:'@columnIds',columnComments:'@columnComments'});
    var queryHive = $resource("/meta/hive_resource/query",{sql:"@sql"});
    var updateTableComment = $resource("/meta/tables/:tableId/comment",{tableId:'@tableId',tableComment:'@tableComment'});

    //加载页面时初始化模型信息和列信息
    init();

    /**
     * 初始化页面
     */
    function init() {
        $scope.tableId = parserUrl("mid");
        getModelInfo();
        getColumns();
    }

    /**
     * 提交基础列更新
     */
    $scope.updateColumns = function() {
        $bt = $('#colUpdateBtn');
        $bt.button('loading');
        var cols = $scope.columns;
        columnsComment.save(
            {
                tableId:$scope.tableId,
                columnIds:getColIds(cols),
                columnComments:getComs(cols)
            },
            function(data) {
                if(data.isSuccess) {
                    $scope.col_edit=!$scope.col_edit;
                    $bt.button('reset');
                }
            },
            function() {
                alert("列信息更新失败");
                $bt.button('reset');
            }
        )
    }

    /**
     * 提交分区列更新
     */
    $scope.updatePartitions = function() {
        var parts = $scope.model.partitions;
        columnsComment.save(
            {
                tableId:$scope.tableId,
                columnIds:getColIds(parts),
                columnComments:getComs(parts)
            },
            function(data) {
                if(data.isSuccess){
                    $scope.part_edit=!$scope.part_edit;
                }
            },
            function() {
                alert("分区信息更新失败");
            }
        )
    }

    /**
     * 按顺序获取列注释数组
     * @param cols
     * @returns {Array}
     */
    var getComs = function(cols) {
        var coms = [];
        for(var i = 0;i < cols.length;i ++) {
            if(cols[i].columnComment === null) {
                coms.push("");
            } else {
                coms.push(cols[i].columnComment);
            }
        }
        return coms;
    }

    /**
     * 按顺序获取列id数组
     * @param cols
     * @returns {Array}
     */
    var getColIds = function(cols) {
        var ids = [];
        for(var i = 0;i < cols.length;i ++) {
            ids.push(cols[i].columnId);
        }
        return ids;
    }

    //var getComs = function(cols) {
    //    var coms = [];
    //    for(var i = 0;i < cols.length;i ++) {
    //        coms.push(cols[i].columnComment);
    //    }
    //    return coms.join("<*>");
    //}
    //
    //var getColIds = function(cols) {
    //    var ids = [];
    //    for(var i = 0;i < cols.length;i ++) {
    //        ids.push(cols[i].columnId);
    //    }
    //    return ids.join("<*>");
    //}


    /**
     * 点击列注释tab初始化
     */
    $scope.initModelDescEditAction = function () {
        var $contentView = $("#model-desc-wrapper");
        var $html = $contentView.html();
        console.log($html);

        $("a[data-target=model-desc-wrapper]").click(function() {
            $(this).hide();
            $contentView.summernote({
                height: 300,
                focus: true,
                lang: 'zh-CN',
                toolbar: [
                    ["style", ["style"]],
                    ['style', ['bold', 'italic', 'underline', 'clear']],
                    ['fontsize', ['fontsize']],
                    ['color', ['color']],
                    ['table', ['table']]
                ]
            });
            $contentView.code(getActualContent($scope.model.tableComment));
            $("#modelDescBtnWrapper").show();
        });

        $("#modelDescConcelBtn").click(function () {
            $contentView.destroy();
            $("#modelDescBtnWrapper").hide();
            $contentView.html($scope.model.tableComment);
            $("a[data-target=model-desc-wrapper]").show();
        });
        $("#modelDescSubmitBtn").click(function () {
            var $me = $(this);
            $me.button("loading");
            var $editable = $("div.note-editable");
            var $newContent = $editable.html();
            console.log($newContent);
            updateTableComment.save({tableId:$scope.tableId,tableComment:$newContent},function(data) {
                if(data.isSuccess) {
                    $me.button("reset");
                    $contentView.destroy();
                    $("#modelDescBtnWrapper").hide();
                    $scope.model.tableComment = $newContent;
                    $contentView.html($newContent);
                    $("a[data-target=model-desc-wrapper]").show();
                    getAlertMessage($("div.model-desc-alert-info"), "alert-success", "内容更新成功!");
                }
            },function() {
                $me.button("reset");
                getAlertMessage($("div.model-desc-alert-info"), "alert-danger", "内容更新失败,请重试!");
            });
        });
    }

    /**
     * 警示条
     * @param $des
     * @param cssClass
     * @param message
     */
    function getAlertMessage($des, cssClass, message) {
        var alert = '<div class="alert fade in common-alert">' + message + '<a class="close" onclick="$(this).parent().hide()">×</a></div>';
        var $alert = $(alert);
        $alert.addClass(cssClass);
        $des.html($alert);
        $alert.show();
        //更新提示提示在5s后消失
        setTimeout(function () {
            $alert.hide();
        }, 5000);
    }

    /**
     * 还原表描述数据
     * @param htmlContent
     * @returns {*}
     */
    function getActualContent(htmlContent) {
        if (htmlContent === '暂无数据')
            return '';
        else
            return htmlContent;
    }

    /**
     * 预览样例数据Action
     * */
    $scope.reviewSampleData = function() {
        var $me = $('#sampleBtn');
        $me.button('loading');

        queryHive.save({sql:$scope.model.exampleSql},function(data) {
            if (data.isSuccess == true) {
                var $result = getSampleDataHTML(data);
                bootbox.dialog({
                    title: "预览样例数据",
                    message: $result,
                    buttons: {
                        "click": {
                            "label": "关闭",
                            "className": "btn-sm btn-primary"
                        }
                    }
                });
                $me.button('reset');
            } else{
                $me.button('reset');
            }
        },function() { $me.button('reset');});
    }

    /**
     * 组装样例数据html代码
     * @param data
     * @returns {string}
     */
    var getSampleDataHTML = function (data) {
        var $tableResult = "<table class='table table-bordered table-hover'><thead><tr>";
        if (data.results.length > 0) {
            $.each(data.results[0], function (key, value) {
                $tableResult += "<th class='GKCAEGKBCE'>" + key + "</th>";
            });
            $tableResult += "</tr></thead><tbody>";
            for (var i = 0; i < data.results.length; i++) {
                $tableResult += "<tr>";
                $.each(data.results[i], function (key, value) {
                    $tableResult += "<td class='GKCAEGKBLD'>" + value + "</td>";
                });
                $tableResult += "</tr>";
            }
            $tableResult += "</tbody></table>";
        }
        return $tableResult;
    }

    function getColumns() {
        columns.get({tableId:$scope.tableId,isPartition:0},function(data) {
            $scope.columns = data.results;
            console.log(data.results);
        })
    }

    function getModelInfo() {
        model.get({tableId:$scope.tableId},function(data) {
            processResult(data);
            console.log(data.model);
        })
    }

    function processResult(data) {
        $scope.model = data.model;
        processHdfsLocation();
        var tableDescription = processModelComment($scope.model.tableComment,'暂无数据');
        $('#model-desc-wrapper').html(tableDescription);
    }


    var processModelComment = function(com,msg) {
        if(com == null || com == '' || com == undefined) {
            return msg;
        }
        return com;
    }

    var processHdfsLocation = function() {
        var hdfs = $scope.model.hiveMeta.hdfsLocation;
        $scope.hueLocation = hdfs.substring(hdfs.indexOf("/user") + 1);
    }


    /**
     * 解析url获得指定参数parm信息
     * */
    function parserUrl(parm) {
        var url = decodeURI(window.location.search);  //获得请求的url
        if (url.indexOf('?') == -1) {
            return 'none';
        } else {
            var args = url.split("?");
            var params = args[1];
            var paramsArray = params.split("&");
            for (var i = 0; i < paramsArray.length; i++) {
                params = paramsArray[i];
                var arg = params.split("=");
                if (arg.length <= 1) {

                } else if (arg[0] == parm) {
                    var param = arg[1];
                    return param;
                }
            }
        }
        return 'none';
    }
})
