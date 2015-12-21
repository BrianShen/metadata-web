<#macro top>
<div class="breadcrumbs" id="breadcrumbs">
    <script type="text/javascript">
        try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
    </script>

    <ul class="breadcrumb">
        <li>
            <i class="fa fa-home"></i>
            <a href="#">Home</a>
        </li>
        <li class="active">Detail</li>
    </ul><!-- .breadcrumb -->

    <div class="nav-search" id="nav-search">
        <form class="form-search">
                        <span class="input-icon">
                            <input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
                            <i class="fa fa-search nav-search-icon"></i>
                        </span>
        </form>
    </div><!-- #nav-search -->
</div>
</#macro>

<#macro content>
<div class="row">

</div>

<div class="row" ng-controller="HiveDetailCtrl" style="margin-bottom: 120px">
    <div class="col-sm-12" style="text-align: left;vertical-align: bottom">

        <div style="float: left;width: 600px">
            <h3><span ng-bind="model.tableName"></span>
            <small><span class="label label-success">hive</span></small>
            </h3>
        </div>


    </div>
    <hr size="1" noshade="noshade"  style="border:1px #cccccc dotted;width: 98%">
    <nav style="padding: 10px;margin-bottom: 18px">
        <ul id="modelTabs" class="nav nav-tabs">
            <li role="presentation" class="active"><a href="#example">数据样例</a></li>
            <li role="presentation" ><a href="#tableComment" ng-click="initModelDescEditAction()">表的描述</a></li>
            <li role="presentation"><a href="#father">表的上游血缘</a></li>
            <li role="presentation"><a href="#children">表的下游血缘</a></li>
        </ul>
        <!-- Tab panes -->
        <div class="tab-content" style="padding: 10px; min-height: 50px">
            <div id="tableComment" class="tab-pane fade in ">
                <span class="model-desc-edit-btn">
                    <a class="btn btn-default btn-operation model-edit" data-target="model-desc-wrapper"
                       style="padding: 2px 5px; float: right">
                        <i class="fa fa-pencil"></i>
                        <span style="font-size: 12px;">编辑</span>
                    </a>
                </span>
                <div class='model-desc-alert-info' style="float: left; width: 100%"></div>
                <div id="model-desc-wrapper"></div>
                <div class="panel-footer" style="display: none; text-align: center" id="modelDescBtnWrapper">
                    <a class="btn btn-default btn-concel" id="modelDescConcelBtn">
                        取消</a>
                    <a class="btn btn-sm btn-success btn-submit" id="modelDescSubmitBtn" style="margin-left: 20px;">
                        提交</a>
                </div>
            </div>
            <div role="tabpanel" class="tab-pane" id="father">
                <ul>
                    <li><a href="#">parent1</a> </li>
                    <li><a href="#">parent2</a> </li>
                    <li><a href="#">parent3</a> </li>
                </ul>
            </div>
            <div role="tabpanel" class="tab-pane" id="children">
                <ul>
                    <li><a href="#">child1</a> </li>
                    <li><a href="#">child2</a> </li>
                    <li><a href="#">child3</a> </li>
                </ul>
            </div>
            <div role="tabpanel" class="tab-pane active" id="example">
                <div style="padding: 10px;">
                    <strong>{{model.exampleSql}}</strong>
                    <button class="btn btn-success" data-loading-text="正在查询..." ng-click="reviewSampleData()" id="sampleBtn">查询</button>
                </div>


            </div>
        </div>
    </nav>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h2 class="panel-title">模型元数据</h2>
        </div>
        <div class="panel-body" style="text-align: right">
            <div class="col-sm-12">

                <div class="col-sm-6 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-4" >存储类型：</span>
                    <div style="display: inline-block;" class="col-sm-8"><span >hive</span></div>
                </div>
                <div class="col-sm-6 col-xs-12 form-group" >
                    <span class="col-sm-4">刷新类型：</span>
                    <div style="display: inline-block;" class="col-sm-8"><span >null</span></div>
                </div>

            </div>
            <div class="col-sm-12">
                <div class="col-sm-6 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-4">所属db：</span>
                    <div style="display: inline-block;" class="col-sm-8"><span >{{model.db}}</span></div>
                </div>
                <div class="col-sm-6 col-xs-12 form-group" >
                    <span class="col-sm-4">负责人：</span>
                    <div style="display: inline-block;" class="col-sm-8"><span >{{model.owner}}</span></div>
                </div>
            </div>
            <div class="col-sm-12">
                <div class="col-sm-6 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-4">输入格式：</span>
                    <div style="display: block;word-wrap:break-word" class="col-sm-8">{{model.hiveMeta.inputFormat}}</div>
                </div>

                <div class="col-sm-6 col-xs-12 form-group" >
                    <span class="col-sm-4">输出格式：</span>
                    <div style="display: block; word-wrap:break-word" class="col-sm-8">{{model.hiveMeta.outputFormat}}</div>
                </div>
            </div>
            <div class="col-sm-12">
                <div class="col-sm-6 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-4">创建时间：</span>
                    <div style="display: block;" class="col-sm-8"><span >{{model.addTime|date:'yyyy-MM-dd HH:mm:ss'}}</span></div>
                </div>
                <div class="col-sm-6 col-xs-12 form-group">
                    <span class="col-sm-4">刷新周期：</span>
                    <div style="display: inline-block;" class="col-sm-8"><span >{{model.refreshCycle}}</span></div>
                </div>
            </div>
            <div class="col-sm-12">
                <div class="col-sm-6 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-4">最后数据变更时间：</span>
                    <div style="display: inline-block;" class="col-sm-8"><span >{{model.dataLastRefreshTime|date:'yyyy-MM-dd HH:mm:ss'}}</span></div>
                </div>

                <div class="col-sm-6 col-xs-12 form-group">
                    <span class="col-sm-4">表大小：</span>
                    <div style="display: inline-block;" class="col-sm-8"><span >null</span></div>
                </div>
            </div>

            <div class="col-sm-12">


                <div class="col-sm-6 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-4">存储格式：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.hiveMeta.storeFormat}}</span></div>
                </div>
                <div class="col-sm-6 col-xs-12 form-group">
                    <span class="col-sm-4">表类型：</span>
                    <div style="display: inline-block;" class="col-sm-8"><span >{{model.hiveMeta.tableType}}</span></div>
                </div>

            </div>

            <div class="col-sm-12">

                <div class="col-sm-6 col-xs-12 form-group">
                    <span class="col-sm-4">hdfs路径：</span>
                    <div  class="col-sm-8" style="word-wrap:break-word"><a target="_blank" ng-href="http://192.168.3.172:8888/filebrowser/#/{{hueLocation}}">{{model.hiveMeta.hdfsLocation}}</a></div>
                </div>
            </div>
        </div>
    </div>


    <div class="panel panel-primary" id="columnDesc">
        <div class="panel-heading">基本列信息
        </div>
        <table class="table table-hover">
            <thead>
            <tr>
                <td class="col-sm-1">序号</td>
                <td class="col-sm-3">列名</td>
                <td class="col-sm-3">类型</td>
                <td class="col-sm-5">描述
                    <div style="float: right">
                        <button ng-show="!col_edit" ng-click="col_edit=!col_edit" class="btn-link">
                            <i class="fa fa-edit bigger-150"></i>
                        </button>
                        <button ng-show="col_edit" ng-click="updateColumns()" class="btn-link" data-loading-text="正在保存..." id="colUpdateBtn">
                            <i class="fa fa-save bigger-150"></i>
                        </button>
                    </div>
                </td>
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
            </tr>
            </tbody>
        </table>
    </div>

    <div class="panel panel-primary" id="partitionDesc" ng-show="model.isPartitionTable">

        <div class="panel-heading">

            <div class="row">
                <div class="col-sm-11">
                    分区列信息
                </div>
            </div>

        </div>

        <table class="table table-hover">
            <thead>
            <tr>
                <td class="col-sm-1">序号</td>
                <td class="col-sm-3">列名</td>
                <td class="col-sm-3">类型</td>
                <td class="col-sm-5">描述
                    <div style="float: right">
                        <button ng-show="!part_edit" ng-click="part_edit=!part_edit" class="btn-link">
                            <i class="fa fa-edit bigger-150"></i>
                        </button>
                        <button ng-show="part_edit" ng-click="updatePartitions()" class="btn-link">
                            <i class="fa fa-save bigger-150"></i>
                        </button>
                    </div>
                </td>
            </tr>
            </thead>
            <tbody>
            <tr ng-repeat="partition in model.partitions">
                <td>{{partition.columnIndex}}</td>
                <td>{{partition.columnName}}</td>
                <td>{{partition.columnType}}</td>
                <td><div ng-show="!part_edit">{{partition.columnComment}}</div>
                    <div ng-show="part_edit">
                    <#--<input  ng-model="column.columnComment" style="width: 80%;padding: 6px"/>-->
                        <textarea ng-model="partition.columnComment" class="col-sm-9"></textarea>
                    </div>
                </td>
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
<script src="/assets/lib/ace/js/bootbox.min.js"></script>
<script type="text/javascript" src="/assets/lib/edit/summernote.min.js"></script>
<script type="text/javascript" src="/assets/lib/edit/summernote-zh-CN.js"></script>
<script src="/assets/js/controller/hiveDetailController.js"></script>
</#macro>