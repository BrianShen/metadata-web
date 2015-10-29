/**
 * Created by wei.shen on 2015/10/28.
 */




/**
 * Ԥ����������Action
 * */
function reviewSampleData() {
    var $me = $(this);
    $me.button('loading');
    $.ajax({
        type: 'POST',
        dataType: "json",
        contentType: 'application/json',
        url: "/meta/hive_resource/query",
        data: {
            sql: ModelBaseGlobal.baseModel.sampleSql
        },
        success: function (data) {
            $me.button('reset');
            if (data.code == 200) {
                var $result = getSampleDataHTML(data);
                bootbox.dialog({
                    title: "Ԥ����������",
                    message: $result,
                    buttons: {
                        "click": {
                            "label": "�ر�",
                            "className": "btn-sm btn-primary"
                        }
                    }
                });
            } else {
                bootbox.dialog({
                    title: "Ԥ����������",
                    message: "��������",
                    buttons: {
                        "click": {
                            "label": "�ر�",
                            "className": "btn-sm btn-primary"
                        }
                    }
                });
            }
        },
        error: function () {
            $me.button('reset');
            $('#appSql').append("<div class='alert fade in alert-danger common-alert' style='margin-top: 10px;'>�������ݻ�ȡʧ��, ������!</div>");
            $('#appSql div.alert').show();
        }
    });
}

/**
 * ������������չʾ��table
 * @param data
 * @returns {string}
 */
var getSampleDataHTML = function (data) {
    var $tableResult = "<table class='table table-bordered table-hover'><thead><tr>";
    if (data.msg.length > 0) {
        $.each(data.msg[0], function (key, value) {
            $tableResult += "<th class='GKCAEGKBCE'>" + key + "</th>";
        });
        $tableResult += "</tr></thead><tbody>";
        for (var i = 0; i < data.msg.length; i++) {
            $tableResult += "<tr>";
            $.each(data.msg[i], function (key, value) {
                $tableResult += "<td class='GKCAEGKBLD'>" + value + "</td>";
            });
            $tableResult += "</tr>";
        }
        $tableResult += "</tbody></table>";
    }
    return $tableResult;
}