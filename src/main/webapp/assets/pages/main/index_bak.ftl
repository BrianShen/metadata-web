<#import "/template/${page}.ftl" as content>
<#import "common.ftl" as common>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Cache-Control" content="max-age=7200" />
    <title>主数据</title>
    <link rel="Shortcut Icon" href="/assets/img/logo.png" />

    <!-- basic styles -->
    <!--输入搜索自动补全-->
    <link rel="stylesheet" href="/assets/lib/typeahead/typeahead.css">

    <link rel="stylesheet" href="/assets/lib/ace/css/ace-rtl.min.css">

    <link href="/assets/lib/bootstrap/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="/assets/font-awesome/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="/assets/lib/ace/css/ace.min.css">
    <#--<link href="/assets/css/ace.min.css" rel="stylesheet"/>-->


<@content.lib></@content.lib>

    <!-- page specific plugin styles -->

    <!-- fonts -->

    <link rel="stylesheet" href="/assets/lib/ace/css/ace-fonts.css"/>

    <!-- ace styles -->

    <#--<link rel="stylesheet" href="/assets/lib/ace/css/ace.min.css"/>-->
    <link rel="stylesheet" href="/assets/lib/ace/css/ace-rtl.min.css"/>
    <link rel="stylesheet" href="/assets/lib/ace/css/ace-skins.min.css"/>


    <link rel="stylesheet" href="/assets/css/common.css"/>
    <style type="text/css">
        body{
            font-size:14px;
        }
    </style>
    <script src="/assets/lib/ace/js/ace-extra.min.js"></script>



</head>
<body ng-app="metaApp">
    <nav class="navbar navbar-default" id="nav">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                    <i class="icon-leaf"></i>
                    主数据</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="/meta/pages/data_search">数据检索</a></li>
                    <li>
                        <a href="http://bidiaodu.office.51fanli.com/" target="_blank">
                            <span class="menu-text">调度平台</span>
                        </a>
                    </li>
                </ul>

            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
    <div id="main">
        <div class="container-fluid" style="max-width: 90%">
            <@content.content></@content.content>
        </div>
    </div>


    <#--<div class="footer">-->
    <#--<@common.footer/>-->
    <#--</div>-->
<!-- basic scripts -->

<script type="text/javascript" src="/assets/lib/ace/js/jquery-2.0.3.min.js"></script>
<script src="/assets/lib/bootstrap/bootstrap.min.js"></script>
    <!-- ace scripts -->
    <script src="/assets/lib/ace/js/ace-elements.min.js"></script>
    <script src="/assets/lib/ace/js/ace.min.js"></script>
<script src="/assets/lib/typeahead/typeahead.bundle.min.js"></script>


<script src="/assets/lib/angular.min.js"></script>
<script src="/assets/lib/angular-resource.min.js"></script>
<script src="/assets/lib/ui-bootstrap-tpls.js"></script>
<script src="/assets/lib/d3.v3.min.js"></script>
<script type="text/javascript" src="/assets/lib/jquery.pagination.js"></script>

<script src="/assets/js/app.js"></script>

<script src="/assets/js/controller/sidebarCtrl.js"></script>
    <script src="/assets/js/service/restful_service.js"></script>
    <script src="/assets/js/service/common_service.js"></script>


<script src="/assets/js/commonjs/search.js"></script>
<@content.js/>

</body>
</html>