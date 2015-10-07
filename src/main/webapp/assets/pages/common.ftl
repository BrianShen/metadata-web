<#macro sidebar>
<div  ng-controller="sidebarCtrl">
    <#--<script type="text/javascript">-->
        <#--try{ace.settings.check('sidebar' , 'fixed')}catch(e){}-->
    <#--</script>-->

    <ul class="nav nav-pills nav-stacked">
        <li>
            <a href="/meta/pages/data_search">
                <i class="icon-dashboard"></i>
                <span class="menu-text"> 数据检索 </span>
            </a>
        </li>


        <#--<li ng-class="{active:isActive('/transport')}">-->
            <#--<a href="#/transport">-->
                <#--<i class="icon-exchange"></i>-->
                <#--<span class="menu-text"> 新增传输 </span>-->
            <#--</a>-->
        <#--</li>-->

        <li>
            <a href="http://bidiaodu.office.51fanli.com/" target="_blank">
                <i class="icon-flag"></i>
                <span class="menu-text"> 调度平台 </span>
            </a>
        </li>
        <#--<li ng-class="{active:isActive('/feedback')}">-->
            <#--<a href="#/feedback">-->
                <#--<i class="icon-question-sign"></i>-->
                <#--<span class="menu-text"> 问题反馈 </span>-->
            <#--</a>-->
        <#--</li>-->



    </ul><!-- /.nav-list -->

    <#--<div class="sidebar-collapse" id="sidebar-collapse">-->
        <#--<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>-->
    <#--</div>-->

    <#--<script type="text/javascript">-->
        <#--try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}-->
    <#--</script>-->
</div>
</#macro>

<#macro footer>
<div class="container">
    <p>如果您有任何问题，可以通过以下方式联系我们： </p>

    <p>imo群 3808802</p>

    <p>邮件:daping.wang@fanli.com,wei.shen@fanli.com</p>
</div>
</#macro>