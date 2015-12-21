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
        <li class="active">数据指标</li>
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
<div ng-controller="AtomCtrl" class="page-content">
    <div class="page-header">
        <h3>指标列表</h3>
    </div>
    <div class="col-sm-1 pull-right">
        <button class="btn btn-link" ng-click="open()"><i class="fa fa-plus-circle"></i> 添加指标</button>
    </div>
    <div class="row">
        <div class="col-sm-12">
            <div class="row">
                <div class="col-sm-12">
                    <div class="table-responsive">
                        <table id="sample-table-1" class="table table-striped table-bordered table-hover">
                            <thead>
                            <tr>
                                <#--<th class="center">-->
                                    <#--<label>-->
                                        <#--<input type="checkbox" class="ace" />-->
                                        <#--<span class="lbl"></span>-->
                                    <#--</label>-->
                                <#--</th>-->
                                <th class="col-sm-3"> 指标名 </th>
                                <th class="col-sm-2"> 负责人 </th>
                                <th class="col-sm-1"> 周期 </th>
                                <th class="col-sm-5"> 备注 </th>
                                <th class="col-sm-1"> 操作 </th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr ng-repeat="atom in atoms">
                                <td> {{atom.name}} </td>
                                <td> {{atom.owner}} </td>
                                <td> {{atom.cycle}} </td>
                                <td> {{atom.detailDesc}} </td>
                                <td>
                                    <div class="visible-md visible-lg hidden-sm hidden-xs btn-group">


                                        <button class="btn btn-xs btn-info" ng-click="editAtom($index)">
                                            <i class="fa fa-edit bigger-120"></i>
                                        </button>

                                        <button class="btn btn-xs btn-danger" ng-click="deleteAtom($index)">
                                            <i class="fa fa-trash-o bigger-120"></i>
                                        </button>


                                    </div>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                </div>
            </div>
        </div>
    </div>
    <#--<button ng-click="open()">点我</button>-->
</div>

</#macro>

<#macro js>
    <script src="/assets/js/controller/atomController.js"></script>
    <script src="/assets/js/controller/dialogController.js"></script>
</#macro>
<#macro lib>

</#macro>
