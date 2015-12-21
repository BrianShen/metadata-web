/**
 * Created by wei.shen on 2015/12/16.
 */

metaApp.controller('atomNewCtrl',function($scope,$modalInstance,$http,$timeout,restfulService,msg,ConstantService) {
    $scope.msg = msg;

    initView();

    $scope.submitIndicator = function() {
        var payload = $scope.atom;
        for(var k in payload) {
            if(payload[k] === '') {
                setAlert('text-danger','表单不能为空');
                return;
            }
        }
        $http.post("/meta/indicators",payload)
            .success(function(){
                setAlert('text-success','新增成功！')
                $scope.closeModal()
                //$timeout($scope.closeModal(),1000)
            }).error(function(){
                setAlert('text-danger','提交失败，请联系管理员！')
            })
    }

    function initView() {
        $scope.cycleOption = ConstantService.getCycleOptions();
        $scope.atom = {
            name:'',
            calLogic:'',
            owner:'',
            cycle:'',
            detailDesc:''
        }
    }
    function closeAlert() {
        setAlert('hide','')
    }
    function setAlert(alertClass,alertText) {
        $scope.alertClass = alertClass;
        $scope.alerttext = alertText;
    }

    $scope.closeModal = function() {
        location.reload()
        $modalInstance.close()
    }
})

/**
 * 指标修改dialog
 * @param $scope
 * @param $modalInstance
 * @param $http
 * @param $timeout
 * @param restfulService
 * @param msg
 * @param ConstantService
 */
var atomModifyDialog = function($scope,$modalInstance,$http,$timeout,restfulService,msg,ConstantService) {
    $scope.msg = msg;
    $scope.atom = msg.atom;
    initView();

    $scope.cancelModal = function() {
        location.reload();
        $modalInstance.dismiss()
    }
    $scope.submitIndicator = function() {
        closeAlert()
        var payload = $scope.atom;
        for(var k in payload) {
            if(payload[k] === '') {
                setAlert('text-danger','表单不能为空');
                return;
            }
        }

        $http.put("/meta/indicators/" + $scope.atom.globalId,payload)
            .success(function(){
                setAlert('text-success','修改成功！')
                $scope.closeModal()
                //$timeout($scope.closeModal(),1000)
            }).error(function(){
                setAlert('text-danger','提交失败，请联系管理员！')
            })
    }

    function initView() {
        $scope.cycleOption = ConstantService.getCycleOptions();
    }
    function closeAlert() {
        setAlert('hide','')
    }
    function setAlert(alertClass,alertText) {
        $scope.alertClass = alertClass;
        $scope.alerttext = alertText;
    }

    $scope.closeModal = function() {
        location.reload();
        $modalInstance.close()
    }
}