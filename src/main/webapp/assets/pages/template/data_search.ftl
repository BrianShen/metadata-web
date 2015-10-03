<#macro content>
<div style="margin: 20px">
    <div class="content-box">
        <!-- content shows here -->
        <div id="content-result">
            <div class='search-result'>
                <table class='table table-hover' id='search-result'>
                    <thead>
                        <tr>
                            <th style='width:35%'>名称</th>
                            <th style='width:17%'>开发者</th>
                            <th style='width:15%'>类型</th>
                            <th style='width:33%'>描述</th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
                <div class='page-bar clearfix'>
                    <div class='pagination-bav'>
                        <span id='resultNums'></span>
                    <div id='Pagination' class='pagination'>

                    </div>
                    </div>
                </div>
            </div>
        </div>
        <div id="content-top-models">
            <table class="table" id="advise-models">

            </table>
        </div>
    </div>


</div>
</#macro>

<#macro lib>

</#macro>

<#macro js>
<script type="text/javascript" src="/assets/lib/jquery.pagination.js"></script>
</#macro>

