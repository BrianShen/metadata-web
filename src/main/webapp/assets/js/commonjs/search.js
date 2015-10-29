/**
 * Created by wei.shen on 2015/10/2.
 */

$(function () {
    /**
     * 监控用户点击enter事件
     * */
    document.onkeydown = function () {
        if (event.keyCode == 13) {
            event.preventDefault();
            $("#search-btn").click();
        }
    }

    initTypeaHead();
    $("#search-input").focus();
});

/**
 * search btn点击事件
 * */
$("#search-btn").click(function () {
    var keyword = $("#search-input").val().trim();
    if(keyword == ''||keyword ==undefined) {
        return;
    }
    searchModelByKeyWord(keyword);
});

/***
 * 搜索模型
 */
function searchModelByKeyWord(keyWord) {
    if ($.trim($('#search-input').val()) === "") {
        $('#search-input').val(keyWord);
    }
    var requestData = {}, requestUrl = "/meta/tables";
    requestData.keyword = $.trim(keyWord);
    generateSearchEntrance(requestUrl, requestData);

}

function searchByTag(tagId) {
    var requestData = {}, requestUrl = "/rest/search/tag";
    requestData.tagId = tagId;
    generateSearchEntrance(requestUrl, requestData);
}

function searchByType(type) {
    var requestData = {}, requestUrl = "/rest/search/type";
    requestData.type = type;
    generateSearchEntrance(requestUrl, requestData);
}

function generateSearchEntrance(requestUrl, requestData) {
    $('div#content-result').html("<div style='width: 50px; margin-left: auto; margin-right: auto; margin-top: 60px; text-align: center'><img src='/assets/img/loading.gif'></div>");
    var $me = $("#search-btn");
    $me.button('loading');
    $.ajax({
        type: 'GET',
        dataType: "json",
        contentType: 'application/json',
        url: requestUrl,
        data: requestData,
        success: function (data) {
            if (data.count == 0) {
                var $info_content = "<p class='search-no-result-info'><span style='color: red'>抱歉,没有找到相关的模型信息!</span></p>"
                $('div#content-result').html($info_content);
            }
            else {
                var $resultInfo = "<div class='search-result'><table class='table table-hover' id='search-result'>"
                    + "<thead><tr><th style='width:35%'>名称</th><th style='width:17%'>开发者</th><th style='width:15%'>类型</th><th style='width:33%'>描述</th></tr></thead><tbody></tbody></table>"
                    + "<div class='page-bar clearfix'><div class='pagination-bav'><span id='resultNums'></span>"
                    + "<div id='Pagination' class='pagination'></div></div>"
                    + "</div></div>";
                $('div#content-result').html($resultInfo);

                insertResult(data.results);
                //分页显示
                paginationInit();
                $('#resultNums').html("共搜索到 " + data.count + " 条结果");
                //获得热门访问模型
//                getVisitTopModels();
                $me.button('reset');
            }
        },
        error: function (errorData) {
            $('div#content-result').html("<div class='alert fade in alert-danger'>error code: " + errorData.status + " 搜索请求发送失败，请重试!</div>");
            $('div.alert').css("text-align", "center");
            $('div.alert').show();
            $me.button('reset');
        }
    });
}

/**
 * 将搜索后端返回的json数据插入hidden-result的一个tr中
 * */
function insertResult(data) {
    $("#hidden-result table").empty();
    for (var i = 0; i < data.length; i++) {
        var $result_content = "<tr class='result'>"
            + "<td><a href='/meta/pages/model_detail?tableId=" + data[i].globalTableId + "' target='_blank'>" + data[i].tableName + "</a></td>"
            + "<td>" + data[i].owner + "</td>"
            + "<td>" + data[i].storageType + "</td>"
            + "<td>" + cutStr(data[i].tableComment) + "</td></tr>";
        $("#hidden-result table").append($result_content);
    }
}

/**
 * 分页显示功能
 * */
function paginationInit() {
    // 创建分页
    var num_entries = $("#hidden-result table tr.result").length;
    console.log(num_entries)
    $("#Pagination").pagination(num_entries, {
        num_edge_entries: 1, //边缘页数
        num_display_entries: 5, //主体页数
        callback: pageselectCallback,
        items_per_page: 20, //每页显示20项
        prev_text: "前一页",
        next_text: "后一页"
    });
}

function pageselectCallback(page_index, jq) {
    var $new_content = $("#hidden-result tr.result:eq(" + (page_index * 20) + "),#hidden-result tr.result:gt(" + (page_index * 20) + ")").clone();
    var new_content = $new_content.filter(":lt(20)").clone();
    console.log(new_content)
    $("#search-result tbody").empty().append(new_content); //装载对应分页的内容
    return false;
}

var getAllTableName = function () {
    var $tableName = [], $totalName = [];
    $.ajax({
        type: 'GET',
        dataType: "json",
        url: "/meta/tableNames",
        success: function (data) {
            if (data.count > 0) {
                for (var i = 0; i < data.count; i++) {
                    $tableName.push(data.results[i]);
                    $totalName.push(data.results[i]);
                }
                var $local = window.sessionStorage;
                if ($local) {
                    $local.setItem("tableList", JSON.stringify($tableName));
                }
            }
        }
    });

    return $totalName;
}

var initTypeaHead = function () {
    var $local = window.sessionStorage;
    var $tableNameList = [];
    if ($local) {
        if ($local.getItem("tableList") == null) {
            $tableNameList = getAllTableName();
        } else {
            var $tableData = JSON.parse($local.getItem("tableList"));
            //var $tagData = JSON.parse($local.getItem("tagList"));
            for (var i = 0; i < $tableData.length; i++) {
                $tableNameList.push($tableData[i]);
            }
        }
    } else {
        $tableNameList = getAllTableName();
    }
    $("#search-input").typeahead({
            hint: true,
            highlight: true,
            minLength: 1
        },
        {
            name: 'tableSet',
            displayKey: 'value',
            source: substringMatcher($tableNameList)
        });
    $("#search-input").css("background-color", "#fff");
}

var substringMatcher = function (strs) {
    return function findMatches(q, cb) {
        var matches, substringRegex;
        matches = [];
        substringRegex = new RegExp(q, 'i');
        $.each(strs, function (i, str) {
            if (substringRegex.test(str)) {
                matches.push({ value: str });
                //设置推荐结果的个数
                if (matches.length > 10) {
                    return false;
                }
            }
        });
        cb(matches);
    };
};

/**
 * 切割字符串
 * */
var cutStr = function (str) {
    if (str === null || str === '') {
        return '';
    } else if (str.length < 200) {
        return str;
    } else {
        return "描述信息太长，点击表名查看详情。。。";
    }
}

var getVisitTopModels = function () {
    $.ajax({
        sync: false,
        type: 'GET',
        dataType: "json",
        contentType: 'application/json',
        url: "/rest/model/top",
        success: function (data) {
            if (data.code == 200) {
                var models = data.topModels;
                var topModelsHtml = "<tr><th style='width: 55%'>热门模型</th><th style='width: 15%'>类型</th><th style='width: 33%'>热门指数</th></tr>";
                if (models.length > 0) {
                    for (var i = 0; i < models.length; i++) {
                        var spanClass = "";
                        if (i < 3) {
                            spanClass = "c-index-hot-" + i;
                        } else {
                            spanClass = "";
                        }
                        topModelsHtml += "<tr><td><span class='c-index " + spanClass + " c-gap-icon-right-small'>" + (i + 1) + "</span>"
                            + "<a href='/model-info.html?tableId=" + models[i].object.tableGuidHash + "' target='_blank'>" + models[i].object.tableName + "</a></td>"
                            + "<td>" + transferType(models[i].object.storage) + "</td>"
                            + "<td>" + models[i].visitCount + "</td></tr>";
                    }
                    $("table#advise-models").html(topModelsHtml);
                }
            }
        }
    });

}