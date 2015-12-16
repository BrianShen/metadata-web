<#macro content>
<div class="row">

</div>

<div class="row" ng-controller="IndicatorCtrl" style="margin-bottom: 120px">
    <div class="col-sm-12" style="text-align: left;vertical-align: bottom">

        <div class="page-header">
            <h3><span ng-bind="model.tableName"></span>
                <small><span class="text-muted">“{{model.tableComment===''?'暂无描述':model.tableComment}}”</span></small>
            </h3>
        </div>


    </div>
<#--<hr size="1" noshade="noshade" style="border:1px #cccccc dotted;width: 98%">-->
    <div class="row">
        <div class="col-xs-12">
            <!-- PAGE CONTENT BEGINS -->
            <div class="tabbable">
                <ul class="nav nav-tabs padding-18 tab-size-bigger" id="myTab">
                    <li class="active">
                        <a data-toggle="tab" href="#faq-tab-1">
                            <i class="blue ace-icon fa fa-question-circle bigger-120"></i>
                            计算逻辑
                        </a>
                    </li>

                    <li>
                        <a data-toggle="tab" href="#faq-tab-2">
                            <i class="purple ace-icon fa fa-info-circle bigger-120"></i>
                            指标详情
                        </a>
                    </li>

                    <li>
                        <a data-toggle="tab" href="#faq-tab-3">
                            <i class="green ace-icon fa fa-cloud-upload bigger-120"></i>
                            上游血缘
                        </a>
                    </li>

                    <li>
                        <a data-toggle="tab" href="#faq-tab-4">
                            <i class="orange ace-icon fa fa-cloud-download bigger-120"></i>
                            下游血缘
                        </a>
                    </li>
                </ul>
            </div>

            <div class="tab-content no-border padding-24">
                <div id="faq-tab-1" class="tab-pane fade in active">
                <#--<pre  id="cal"  ng-bind="model.indicator.calLogic">-->

                <#--</pre>-->
                    <prettify target="model.indicator.calLogic">

                        <pre class="prettyprint linenums">
                            {{target}}
                        </pre>

                    </prettify>
                </div>
                <div id="faq-tab-2" class="tab-pane fade in">
                    <div class="col-sm-10">
                        <table class="table table-bordered table-hover">
                            <tbody>
                            <tr>
                                <td class="col-sm-3"> 负责人 </td>
                                <td class="col-sm-5">{{model.indicator.owner}}</td>
                            </tr>
                            <tr>
                                <td class="col-sm-3"> 周期 </td>
                                <td class="col-sm-5">{{model.indicator.cycle}}</td>
                            </tr>
                            <tr>
                                <td class="col-sm-3"> 详细描述 </td>
                                <td class="col-sm-5">{{model.indicator.detailDesc}}</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>

                </div>
                <div id="faq-tab-3" class="tab-pane fade in">

                </div>
                <div id="faq-tab-4" class="tab-pane fade in">

                </div>
            </div>
        </div>
    </div>


</div>
</#macro>

<#macro lib>
<link rel="stylesheet" href="/assets/css/edit/summernote.css"/>
<link rel="stylesheet" href="/assets/lib/prettify/prettify.css"/>
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
<script type="text/javascript" src="/assets/lib/prettify/prettify.js"></script>
<script src="/assets/js/controller/indicatorController.js"></script>
<script src="/assets/js/directive/prettify_directive.js"></script>
</#macro>