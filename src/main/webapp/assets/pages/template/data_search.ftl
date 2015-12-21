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
        <li class="active">Search</li>
    </ul><!-- .breadcrumb -->

    <div class="nav-search" id="nav-search">
        <form class="form-search">
                        <span class="input-icon">
                            <input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
                            <i class="icon-search nav-search-icon"></i>
                        </span>
        </form>
    </div><!-- #nav-search -->
</div>
</#macro>

<#macro content>
<div style="margin: 20px" class="main">
    <#--<form  role="search" >-->
        <#--<div class="input-group">-->
                <#--<input type="text"  id="search-input" required class="typeahead form-control" placeholder="search models" style="width: 600px;vertical-align: middle">-->
                <#--<span class="input-group-btn">-->
                    <#--<button type="submit" id="search-btn" class="btn btn-success" style="vertical-align: middle;margin-left: 20px">-->
                        <#--查询-->
                    <#--</button>-->
                <#--</span>-->




        <#--</div>-->
    <#--</form>-->
        <form role="search">
            <div class="navbar-form navbar-form-custom input-group" >
                <div class="search-group">
                    <input type="text" required id="search-input" class="form-control search-input-width typeahead"
                           placeholder="表名/指标名" >
                    <button type="submit" id="search-btn" class="btn btn-sm btn-primary btn-location" data-loading-text="正在查询...">查询
                        <i class="icon-search icon-on-right bigger-110"></i>
                    </button>
                </div>
            </div>
        </form>




    <div class="content-box">
        <!-- content shows here -->
        <div id="content-result"></div>
        <div id="content-top-models">
            <table class="table" id="advise-models">

            </table>
        </div>
    </div>


</div>


<div id="hidden-result" style="display:none;">
    <table>
    </table>
</div>
</#macro>

<#macro lib>
<script type="text/javascript" src="/assets/lib/jquery.pagination.js"></script>

<link rel="stylesheet" href="/assets/css/pagination.css">
</#macro>

<#macro js>

</#macro>

