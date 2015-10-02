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

    <link href="/assets/lib/bootstrap/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="/assets/lib/ace/css/font-awesome.min.css"/>

    <!-- page specific plugin styles -->

    <!-- fonts -->

    <link rel="stylesheet" href="/assets/lib/ace/css/ace-fonts.css"/>

    <!-- ace styles -->

    <#--<link rel="stylesheet" href="/assets/lib/ace/css/ace.min.css"/>-->
    <#--<link rel="stylesheet" href="/assets/lib/ace/css/ace-rtl.min.css"/>-->
    <#--<link rel="stylesheet" href="/assets/lib/ace/css/ace-skins.min.css"/>-->
    <!--输入搜索自动补全-->
    <link rel="stylesheet" href="/assets/lib/typeahead/typeahead.css">

    <link rel="stylesheet" href="/assets/css/common.css"/>


</head>
<body ng-app="metaApp">
    <nav class="navbar navbar-default">
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
                    <li class="active"><a href="/meta/pages/index/data_search">数据检索</a></li>
                    <li>
                        <a href="http://bidiaodu.office.51fanli.com/" target="_blank">
                            <span class="menu-text">调度平台</span>
                        </a>
                    </li>
                </ul>
                <form class="navbar-form navbar-right" role="search">
                    <div class="form-group">
                        <input type="text" id="search-input" class="typeahead form-control" placeholder="Search" style="width: 400px">
                    </div>
                    <button type="submit" id="search-btn" class="btn btn-default">Submit</button>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>
    <div id="main">
        <div class="container-fluid" style="background-color: red">
            <h1>32324343</h1>
        </div>
    </div>


    <div class="footer">
    <@common.footer/>
    </div>
<!-- basic scripts -->

<script type="text/javascript" src="/assets/lib/ace/js/jquery-2.0.3.min.js"></script>
<script src="/assets/lib/bootstrap/bootstrap.min.js"></script>
<script src="/assets/lib/typeahead/typeahead.bundle.min.js"></script>

<script src="/assets/lib/angular.min.js"></script>
<script src="/assets/lib/angular-resource.min.js"></script>
<script src="/assets/lib/ui-bootstrap-tpls.js"></script>
<script src="/assets/lib/d3.v3.min.js"></script>
<script type="text/javascript" src="/assets/lib/jquery.pagination.js"></script>

<script src="/assets/js/app.js"></script>

<script src="/assets/js/controller/sidebarCtrl.js"></script>

<script src="/assets/js/commonjs/search.js"></script>

</body>
</html>