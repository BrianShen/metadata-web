

<#macro content>


<div class="row" ng-controller="DetailCtrl" style="margin-bottom: 120px" >
    <div class="col-sm-12" style="text-align: left;vertical-align: bottom">

        <div style="float: left;width: 600px">
            <h3><span ng-bind="model.tableName"></span>
                <small><span class="text-muted">“{{model.tableComment===''?'暂无描述':model.tableComment}}”</span></small>
            </h3>
        </div>
        <#--<div style="float: right;width: 100px;width: 60px">-->
            <#--<a class="btn btn-success">-->
                <#--<i class="icon-edit" ng-click="">编辑-->
                <#--</i>-->
            <#--</a>-->
        <#--</div>-->


    </div>
    <hr size="1" noshade="noshade"  style="border:1px #cccccc dotted;width: 98%">
    <div class="col-sm-12">

    </div>

    <div class="panel panel-primary">
        <div class="panel-heading">
            <h2 class="panel-title">模型元数据</h2>
        </div>
        <div class="panel-body">
            <div class="col-sm-12">

                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">存储类型：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span class="label label-primary">{{model.storageType}}</span></div>
                </div>

                <div class="col-sm-4 col-xs-12 form-group" >
                    <span class="col-sm-6">负责人：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.owner===''?'暂无':model.owner}}</span></div>
                </div>
            </div>
            <div class="col-sm-12">
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">域名：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.domain}}</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">所属db：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.db}}</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group" >
                    <span class="col-sm-6">schema：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.schema}}</span></div>
                </div>
            </div>

        </div>
    </div>


    <div class="panel panel-primary" id="columnDesc">
        <div class="panel-heading">列信息
        </div>
        <table class="table table-hover">
            <thead>
            <tr>
                <td class="col-sm-1">序号</td>
                <td class="col-sm-3">列名</td>
                <td class="col-sm-3">类型</td>
                <td class="col-sm-4">描述
                    <div style="float: right">
                        <button ng-show="!col_edit" ng-click="col_edit=!col_edit" class="btn-link">
                            <i class="icon-edit bigger-150"></i>
                        </button>
                        <button ng-show="col_edit" ng-click="updateColumns()" class="btn-link" data-loading-text="正在保存..." id="colUpdateBtn">
                            <i class="icon-save bigger-150"></i>
                        </button>
                    </div>
                </td>
                <td class="col-sm-1">主键</td>
            </tr>
            </thead>
            <tbody>
            <tr ng-repeat="column in columns">
                <td>{{column.columnIndex}}</td>
                <td>{{column.columnName}}</td>
                <td>{{column.columnType}}</td>
            <#--<td>{{column.columnComment}}</td>-->
                <td><div ng-show="!col_edit">{{column.columnComment}}</div>
                    <div ng-show="col_edit">
                    <#--<input  ng-model="column.columnComment" style="width: 80%;padding: 6px"/>-->
                        <textarea ng-model="column.columnComment" class="col-sm-9"></textarea>
                    </div>
                </td>
                <td><i class="icon-key" ng-show="column.isPrimary===1"></i> </td>
            </tr>
            </tbody>
        </table>
    </div>

</div>
</#macro>

<#macro lib>
<link rel="stylesheet" href="/assets/css/edit/summernote.css"/>
</#macro>

<#macro js>
<script>
    $('#modelTabs a').click(function (e) {
        e.preventDefault()
        $(this).tab('show')
    })
</script>
<script type="text/javascript" src="/assets/lib/edit/summernote.min.js"></script>
<script type="text/javascript" src="/assets/lib/edit/summernote-zh-CN.js"></script>
<script src="/assets/js/controller/detailController.js"></script>
</#macro>