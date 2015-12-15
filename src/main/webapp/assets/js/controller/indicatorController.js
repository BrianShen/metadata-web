/**
 * Created by wei.shen on 2015/12/15.
 */

metaApp.controller('IndicatorCtrl',function($scope,CommonService,restfulService) {
    $scope.indicatorId = CommonService.parserUrl("mid");

    //$scope.$on('$viewContentLoaded', function() {
    //    prettyPrint();
    //});

    //$scope.$watch('model',function(newContent) {
    //    $("#cal").html(prettyPrintOne($("#cal").html()))
    //},true)

    initUI();
    function initUI() {
        if($scope.indicatorId ===undefined || $scope.indicatorId === 'none') {
            alert('无法获取指定模型');
        }

        var model = restfulService.model.query({tableId:$scope.indicatorId});
        model.$promise.then(function(data) {
            $scope.model = data.model;

            $scope.organization = $scope.model.indicator;
            $scope.code = $scope.model.indicator.calLogic;
            //prettyPrint();
            //console.log($scope.model.indicator.calLogic)
            //$scope.cal_logic = data.model.cal_logic;
        },function() {})
    }
})
