<#macro content>
<div style="margin: 20px" class="main">
    <form  role="search" >
        <div style="vertical-align: middle">
                <input type="text"  id="search-input" required class="typeahead form-control" placeholder="search models" style="width: 600px;vertical-align: middle">


                <button type="submit" id="search-btn" class="btn btn-success" style="vertical-align: middle;margin-left: 20px">
                    查询
                </button>


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

