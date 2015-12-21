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
    <link rel="stylesheet" href="/assets/css/dialogs.css">
    <#--<link href="/assets/css/ace.min.css" rel="stylesheet"/>-->


<@content.lib></@content.lib>

    <!-- page specific plugin styles -->

    <!-- fonts -->

    <link rel="stylesheet" href="/assets/lib/ace/css/ace-fonts.css"/>
    <#--<link rel="stylesheet" href="/assets/lib/ace/fonts/fonts.googleapis.com.css" />-->

    <!-- ace styles -->

    <#--<link rel="stylesheet" href="/assets/lib/ace/css/ace.min.css"/>-->
    <link rel="stylesheet" href="/assets/lib/ace/css/ace-rtl.min.css"/>
    <link rel="stylesheet" href="/assets/lib/ace/css/ace-skins.min.css"/>

    <link rel="stylesheet" href="/assets/css/common.css"/>
    <script src="/assets/lib/ace/js/ace-extra.min.js"></script>
</head>
<body ng-app="metaApp">
<div class="navbar navbar-default" id="navbar">
    <div class="navbar-container" id="navbar-container">
        <div class="navbar-header pull-left">
            <a href="#" class="navbar-brand">
                <small>
                    <i class="icon-leaf"></i>
                    主数据
                </small>
            </a><!-- /.brand -->
        </div><!-- /.navbar-header -->

    </div><!-- /.container -->
</div>

<div class="main-container" id="main-container">

    <div class="main-container-inner">
        <a class="menu-toggler" id="menu-toggler" href="#">
            <span class="menu-text"></span>
        </a>

        <div class="sidebar" id="sidebar">
            <ul class="nav nav-list">
                <li class="">
                    <a href="/meta/pages/data_search">
                        <i class="glyphicon glyphicon-search"></i>
                        <span class="menu-text"> 数据检索 </span>
                    </a>
                </li>

                <li>
                    <a href="/meta/pages/atom">
                        <i class="glyphicon glyphicon-export"></i>
                        <span class="menu-text"> 指标管理 </span>
                    </a>
                </li>
            </ul><!-- /.nav-list -->

        </div>

        <div class="main-content">
            <@content.top></@content.top>

            <div class="page-content">
                <div class="row">
                    <div class="col-xs-12">
                        <!-- PAGE CONTENT BEGINS -->
                    <@content.content></@content.content>
                        <!-- PAGE CONTENT ENDS -->
                    </div><!-- /.col -->
                </div><!-- /.row -->
            </div><!-- /.page-content -->
        </div><!-- /.main-content -->

    </div><!-- /.main-container-inner -->

    <a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
        <i class="icon-double-angle-up icon-only bigger-110"></i>
    </a>
</div><!-- /.main-container -->
    <#--<div id="main">-->
        <#--<div class="container-fluid" style="max-width: 90%">-->
            <#--<@content.content></@content.content>-->
        <#--</div>-->
    <#--</div>-->
    <script type="text/javascript" src="/assets/lib/ace/js/jquery-2.0.3.min.js"></script>

    <!-- ace scripts -->
    <script src="/assets/lib/ace/js/ace-elements.min.js"></script>
    <script src="/assets/lib/ace/js/ace.min.js"></script>

<script src="/assets/lib/bootstrap/bootstrap.min.js"></script>
<script src="/assets/lib/typeahead/typeahead.bundle.min.js"></script>


<script src="/assets/lib/angular.min.js"></script>
<script src="/assets/lib/angular-resource.min.js"></script>
<script src="/assets/lib/angular-sanitize/angular-sanitize.min.js"></script>
<script src="/assets/lib/angular-translate/angular-translate.min.js"></script>
<script src="/assets/lib/ui-bootstrap-tpls.js"></script>
<script src="/assets/lib/dialogs.js"></script>
<script src="/assets/js/app.js"></script>
<script src="/assets/lib/d3.v3.min.js"></script>
<script type="text/javascript" src="/assets/lib/jquery.pagination.js"></script>



<script src="/assets/js/controller/sidebarCtrl.js"></script>
<script src="/assets/js/service/restful_service.js"></script>
<script src="/assets/js/service/common_service.js"></script>
<script src="/assets/js/service/constant_service.js"></script>



<script src="/assets/js/commonjs/search.js"></script>
<@content.js/>

</body>
</html>