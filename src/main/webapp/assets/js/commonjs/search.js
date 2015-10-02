/**
 * Created by wei.shen on 2015/10/2.
 */


var SearchGlobal = {};
$(function () {
    ////��ʼ���û���¼��Ϣ
    //Global.initLogin();
    ////��ʼ����ർ����
    //initLeftNav();

    //SearchGlobal.keyword = parserUrl("keyword");
    //SearchGlobal.tagId = parserUrl("tagId");
    //SearchGlobal.type = parserUrl("type");
    //if (SearchGlobal.keyword === 'none' && SearchGlobal.tagId === 'none' && SearchGlobal.type == 'none') {
    //    window.location.href = "search-model.html";
    //}
    //
    //if (SearchGlobal.keyword != 'none') {
    //    searchModelByKeyWord(SearchGlobal.keyword);
    //} else if (SearchGlobal.tagId != 'none') {
    //    searchByTag(SearchGlobal.tagId);
    //} else {
    //    searchByType(SearchGlobal.type);
    //}

    /**
     * ����û����enter�¼�
     * */
    document.onkeydown = function () {
        if (event.keyCode == 13) {
            event.preventDefault();
            $("#search-btn").click();
        }
    }

    initTypeaHead();
});

/**
 * ��ʼ����ർ����
 */
//var initLeftNav = function () {
//    var object = {
//        isDataSearchPage: 'active'
//    };
//    var $htmlPart = getHtmlTemplate('template/left-nav.html', object);
//    $("ul.page-nav").html($htmlPart);
//}

/**
 * search btn����¼�
 * */
$("#search-btn").click(function () {
    var keyword = $("#search-input").val().trim();
    searchModelByKeyWord(keyword);
});

/***
 * ����ģ��
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
                var $info_content = "<p class='search-no-result-info'><span style='color: red'>��Ǹ,û���ҵ���ص�ģ����Ϣ!</span></p>"
                $('div#content-result').html($info_content);
            }
            else {
                var $resultInfo = "<div class='search-result'><table class='table table-hover' id='search-result'>"
                    + "<thead><tr><th style='width:35%'>����</th><th style='width:17%'>������</th><th style='width:15%'>����</th><th style='width:33%'>����</th></tr></thead><tbody></tbody></table>"
                    + "<div class='page-bar clearfix'><div class='pagination-bav'><span id='resultNums'></span>"
                    + "<div id='Pagination' class='pagination'></div></div>"
                    + "</div></div>";
                if (data.type != undefined) {
                    var $tagInfo = "<div class='tag-info' style='margin-top: 20px; margin-left: 10px;'><span style='font-weight: bolder; font-size: 16px; color: #cb6fd7'>" + transferType(data.type) + "</span><span style='margin-left: 5px; color: #999'>�����б�</span>:</div>"
                    $('div#content-result').html($tagInfo + $resultInfo);
                } else {
                    $('div#content-result').html($resultInfo);
                }
                insertResult(data.results);
                //��ҳ��ʾ
                paginationInit();
                $('#resultNums').html("�������� " + data.count + " �����");
                //������ŷ���ģ��
//                getVisitTopModels();
                $me.button('reset');
            }
        },
        error: function (errorData) {
            $('div#content-result').html("<div class='alert fade in alert-danger'>error code: " + errorData.status + " ����������ʧ�ܣ�������!</div>");
            $('div.alert').css("text-align", "center");
            $('div.alert').show();
            $me.button('reset');
        }
    });
}

/**
 * ��������˷��ص�json���ݲ���hidden-result��һ��tr��
 * */
function insertResult(data) {
    $("#hidden-result table").empty();
    for (var i = 0; i < data.length; i++) {
        var $result_content = "<tr class='result'>"
            + "<td><a href='/model-info.html?tableId=" + data[i].tableGuidHash + "' target='_blank'>" + data[i].tableName + "</a></td>"
            + "<td>" + Global.getNameByPinyin(processString(data[i].tableOwner, '').toLowerCase()) + "</td>"
            + "<td>" + transferType(data[i].storage) + "</td>"
            + "<td>" + cutStr(data[i].tableDesc) + "</td>";
        $("#hidden-result table").append($result_content);
    }
}

/**
 * ��ҳ��ʾ����
 * */
function paginationInit() {
    // ������ҳ
    var num_entries = $("#hidden-result table tr.result").length;
    $("#Pagination").pagination(num_entries, {
        num_edge_entries: 1, //��Եҳ��
        num_display_entries: 5, //����ҳ��
        callback: pageselectCallback,
        items_per_page: 20, //ÿҳ��ʾ20��
        prev_text: "ǰһҳ",
        next_text: "��һҳ"
    });
}

function pageselectCallback(page_index, jq) {
    var $new_content = $("#hidden-result tr.result:eq(" + (page_index * 20) + "),#hidden-result tr.result:gt(" + (page_index * 20) + ")").clone();
    var new_content = $new_content.filter(":lt(20)").clone();
    $("#search-result tbody").empty().append(new_content); //װ�ض�Ӧ��ҳ������
    return false;
}

var getAllTableName = function () {
    var $tableName = [], $totalName = [], $tagName = [];
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

    //$.ajax({
    //    type: 'POST',
    //    dataType: "json",
    //    contentType: 'application/json',
    //    url: "/rest/search/autoComplete?type=0",
    //    success: function (data) {
    //        if (data.count > 0) {
    //            for (var i = 0; i < data.count; i++) {
    //                $tagName.push(data.msg[i].name);
    //                $totalName.push(data.msg[i].name);
    //            }
    //            var $local = window.sessionStorage;
    //            if ($local) {
    //                $local.setItem("tagList", JSON.stringify($tagName));
    //            }
    //        }
    //    }
    //});

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
                //�����Ƽ�����ĸ���
                if (matches.length > 10) {
                    return false;
                }
            }
        });
        cb(matches);
    };
};

/**
 * �и��ַ���
 * */
var cutStr = function (str) {
    if (str === null || str === '') {
        return '';
    } else if (str.length < 200) {
        return str;
    } else {
        return "����̫�࣬���ȥ�鿴...";
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
                var topModelsHtml = "<tr><th style='width: 55%'>����ģ��</th><th style='width: 15%'>����</th><th style='width: 33%'>����ָ��</th></tr>";
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