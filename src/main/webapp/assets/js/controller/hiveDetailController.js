/**
 * Created by Administrator on 2015/10/5.
 */

metaApp.controller("HiveDetailCtrl",function($scope,$resource) {
    var model = $resource("/meta/tables/:tableId",{tableId:"@tableId"});
    var columns = $resource("/meta/columns",{tableId:'@tableId',isPartition:'@isPartition'});
    var queryHive = $resource("/meta/hive_resource/query",{sql:"@sql"});

    init();

    function init() {
        $scope.tableId = parserUrl("tableId");
        getModelInfo();
        getColumns();
    }


    $scope.

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
                $me.reset();
            } else{
                $me.reset();
            }
        },function() {$me.reset();});
    }

    function getColumns() {
        columns.get({tableId:$scope.tableId,isPartition:0},function(data) {
            $scope.columns = data.results;
            console.log(data.results);
        })
    }

    function getModelInfo() {
        model.get({tableId:$scope.tableId},function(data) {
            $scope.model = data.model;
            var hdfs = $scope.model.hiveMeta.hdfsLocation;
            $scope.hueLocation = hdfs.substring(hdfs.indexOf("/user") + 1);
            console.log(data.model);
        })
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
