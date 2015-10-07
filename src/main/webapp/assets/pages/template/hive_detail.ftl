

<#macro content>
<div class="row">

</div>

<div class="row" ng-controller="HiveDetailCtrl">
    <div class="col-sm-12" style="text-align: left;vertical-align: bottom">

        <div style="float: left;width: 600px">
            <h3><span ng-bind="model.tableName"></span>
            <small><span class="label label-success">hive</span></small>
            </h3>
        </div>
        <div style="float: right;width: 100px;width: 60px">
            <a class="btn btn-success">
                <i class="icon-edit">编辑
                </i>

            </a>
        </div>


    </div>
    <hr size="1" noshade="noshade"  style="border:1px #cccccc dotted;width: 98%">
    <nav style="padding: 10px;margin-bottom: 18px">
        <ul id="modelTabs" class="nav nav-tabs">
            <li role="presentation" class="active"><a href="#tableComment">表的描述</a></li>
            <li role="presentation"><a href="#father">表的上游血缘</a></li>
            <li role="presentation"><a href="#children">表的下游血缘</a></li>
            <li role="presentation"><a href="#example">数据样例</a></li>
        </ul>
        <!-- Tab panes -->
        <div class="tab-content" style="padding: 10px;">
            <div role="tabpanel" class="tab-pane active" id="tableComment">
                <span style="padding: 10px" ng-bind="model.tableComment"></span>
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
            <div role="tabpanel" class="tab-pane" id="example">
                <div style="padding: 10px;">
                    <strong>{{model.exampleSql}}</strong>
                    <button class="btn btn-success" data-loading-text="正在查询...">查询</button>
                </div>


            </div>
        </div>
    </nav>
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h2 class="panel-title">模型元数据</h2>
        </div>
        <div class="panel-body">
            <div class="col-sm-12">

                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">存储类型：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >hive</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">刷新类型：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >增量</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group" >
                    <span class="col-sm-6">负责人：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >沈伟</span></div>
                </div>
            </div>
            <div class="col-sm-12">
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">所属db：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.db}}</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">输入格式：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.hiveMeta.inputFormat}}</span></div>
                </div>

                <div class="col-sm-4 col-xs-12 form-group" >
                    <span class="col-sm-6">输出格式：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.hiveMeta.outputFormat}}</span></div>
                </div>
            </div>
            <div class="col-sm-12">
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">创建时间：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.addTime|date:'yyyy-MM-dd HH:mm:ss'}}</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">刷新周期：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.refreshCycle}}</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group">
                    <span class="col-sm-6">表大小：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >100G</span></div>
                </div>
            </div>

            <div class="col-sm-12">

                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">最后数据变更时间：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.dataLastRefreshTime|date:'yyyy-MM-dd HH:mm:ss'}}</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">存储格式：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.hiveMeta.storeFormat}}</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group">
                    <span class="col-sm-6">表类型：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.hiveMeta.tableType}}</span></div>
                </div>

            </div>

            <div class="col-sm-12">

                <div class="col-sm-8 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">hdfs路径：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >{{model.hiveMeta.hdfsLocation}}</span></div>
                </div>


            </div>
        </div>
    </div>


    <div class="panel panel-default" id="columnDesc">
        <div class="panel-heading">基本列信息
        </div>
        <table class="table table-hover">
            <thead>
            <tr>
                <td>序号</td>
                <td>列名</td>
                <td>类型</td>
                <td>描述</td>
            </tr>
            </thead>
            <tbody>
            <tr ng-repeat="column in columns">
                <td>{{column.columnIndex}}</td>
                <td>{{column.columnName}}</td>
                <td>{{column.columnType}}</td>
                <td>{{column.columnComment}}</td>
            </tr>
            </tbody>
        </table>
    </div>

    <div class="panel panel-default" id="columnDesc">
        <div class="panel-heading">分区列信息</div>
        <table class="table table-hover">
            <thead>
            <tr>
                <td>序号</td>
                <td>列名</td>
                <td>类型</td>
                <td>描述</td>
            </tr>
            </thead>
            <tbody>
            <tr ng-repeat="partition in model.partitions">
                <td>{{partition.columnIndex}}</td>
                <td>{{partition.columnName}}</td>
                <td>{{partition.columnType}}</td>
                <td>{{partition.columnComment}}</td>
            </tr>
            </tbody>
        </table>
    </div>

</div>
</#macro>

<#macro lib>

</#macro>

<#macro js>
<script>
    $('#modelTabs a').click(function (e) {
        e.preventDefault()
        $(this).tab('show')
    })

</script>

<script src="/assets/js/controller/hiveDetailController.js"></script>
</#macro>