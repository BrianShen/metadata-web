

<#macro content>
<div class="row">

</div>

<div class="row">
    <div class="col-sm-12" style="text-align: left;vertical-align: bottom">

        <div style="float: left;width: 600px">
            <h3>dim_user_group
            <small><span class="label label-success">sqlserver</span></small>
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
            <li role="presentation"><a href="#example">数据样例</a></li>
        </ul>
        <!-- Tab panes -->
        <div class="tab-content" style="padding: 10px;">
            <div role="tabpanel" class="tab-pane active" id="tableComment"><span style="color: red">用户分组维度表</span></div>
            <div role="tabpanel" class="tab-pane" id="father">2</div>
            <div role="tabpanel" class="tab-pane" id="example">3</div>
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
                    <span class="col-sm-6">域名：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >—</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">所属db：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >dim</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group" >
                    <span class="col-sm-6">schema：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >—</span></div>
                </div>
            </div>
            <div class="col-sm-12">
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">创建时间：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >2013-01-20 18:21:00</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">刷新周期：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >日</span></div>
                </div>
                <div class="col-sm-4 col-xs-12 form-group">
                    <span class="col-sm-6">表大小：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >100G</span></div>
                </div>
            </div>

            <div class="col-sm-12">

                <div class="col-sm-4 col-xs-12 form-group" style="border-right: 1px dashed #000">
                    <span class="col-sm-6">最后数据变更时间：</span>
                    <div style="display: inline-block;" class="col-sm-6"><span >2015-09-20 18:21:00</span></div>
                </div>

            </div>
        </div>
    </div>


    <div class="col-sm-12">

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
</#macro>