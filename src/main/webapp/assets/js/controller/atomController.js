/**
 * Created by wei.shen on 2015/12/16.
 */

metaApp.controller('AtomCtrl',function($scope,$rootScope,$modal,restfulService,$translate,dialogs) {

    initData();

    function initData() {
        var result = restfulService.indicators.query();
        result.$promise.then(
            function(data) {
                $scope.atoms = data;
            }
        )
    }

    $scope.editAtom = function(index) {
        var atom = findAtomByIndex(index);
        $scope.msg = {
            headerText:'修改指标',
            atom : atom
        }
        var modalInstance = $modal.open(
            {
                templateUrl: '/assets/pages/template/dialog/atomModifyDialog.html',
                controller: atomModifyDialog,
                backdrop : 'static',
                resolve: {
                    msg: function () {
                        return $scope.msg;
                    }
                }
            }
        );

        modalInstance.result.then(
            function(data) {
                console.log("modal close at " + new Date().toLocaleDateString())
                location.reload();
            }
        )

    };

    $scope.deleteAtom = function(index) {
        var atom = findAtomByIndex(index);
        var dialog = dialogs.confirm('提示','确定删除指标' + atom.name + '?');
        dialog.result.then(
            function(data) {
                removeIndicator(atom.globalId);
            },function(reason) {}
        )
    }

    function removeIndicator(id) {
        var result = restfulService.indicator.delete({id:id});
        result.$promise.then(
            function(data) {
                location.reload()
            }
        )
    }

    function findAtomByIndex(index) {
        return $scope.atoms[index]
    }

    $scope.open = function() {

        $scope.msg = {
            headerText:"添加指标"
        }
        var modalInstance = $modal.open(
            {
                templateUrl: '/assets/pages/template/dialog/atomNewDialog.html',
                controller: 'atomNewCtrl',
                resolve: {
                    msg: function () {
                        return $scope.msg;
                    }
                }
            }
        );
        modalInstance.result.then(
            function(data) {
                location.reload();
                console.log("modal close at " + new Date().toLocaleDateString())
            },
            function(reason) {
                console.log("modal close at " + new Date().toLocaleDateString())
                location.reload();
            }
        )
    }

})

