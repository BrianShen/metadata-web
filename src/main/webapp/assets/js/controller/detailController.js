/**
 * Created by wei.shen on 2015/12/6.
 */

metaApp.controller('DetailCtrl',function($scope,$resource,restfulService) {

    $scope.tableId = parserUrl("mid");
    var model = restfulService.model.query({tableId:$scope.tableId});
    model.$promise.then(function(data) {
        $scope.model = data.model;
    },function(error) {
        alert('error!')
    });

    var columns = restfulService.column.query({tableId:$scope.tableId});
    columns.$promise.then(function(data) {
        if(data.isSuccess) {
            $scope.columns = data.results;
        }
    });

    /**
     * 提交基础列更新
     */
    $scope.updateColumns = function() {
        $bt = $('#colUpdateBtn');
        $bt.button('loading');
        var cols = $scope.columns;
        restfulService.columnsComment.save(
            {
                tableId:$scope.tableId,
                columnIds:getColIds(cols),
                columnComments:getComs(cols)
            },
            function(data) {
                if(data.isSuccess) {
                    $scope.col_edit=!$scope.col_edit;
                    $bt.button('reset');
                }
            },
            function() {
                alert("列信息更新失败");
                $bt.button('reset');
            }
        )
    }

    /**
     * 按顺序获取列注释数组
     * @param cols
     * @returns {Array}
     */
    var getComs = function(cols) {
        var coms = [];
        for(var i = 0;i < cols.length;i ++) {
            if(cols[i].columnComment === null) {
                coms.push("");
            } else {
                coms.push(cols[i].columnComment);
            }
        }
        return coms;
    }

    /**
     * 按顺序获取列id数组
     * @param cols
     * @returns {Array}
     */
    var getColIds = function(cols) {
        var ids = [];
        for(var i = 0;i < cols.length;i ++) {
            ids.push(cols[i].columnId);
        }
        return ids;
    }

    /**
     * 解析url获得指定参数parm信息
     * */
    function parserUrl(parm) {
        var url = decodeURI(window.location.search);  //获得请求的url
        if (url.indexOf('?') == -1) {
            return 'none';
        } else {
            var args = url.split("?");
            var params = args[1];
            var paramsArray = params.split("&");
            for (var i = 0; i < paramsArray.length; i++) {
                params = paramsArray[i];
                var arg = params.split("=");
                if (arg.length <= 1) {

                } else if (arg[0] == parm) {
                    var param = arg[1];
                    return param;
                }
            }
        }
        return 'none';
    }

})
