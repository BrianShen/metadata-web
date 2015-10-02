/**
 * Created by wei.shen on 2015/7/16.
 */

metaApp.controller("sidebarCtrl",function($scope) {
    $scope.isActive = function (route) {
        //console.log("route:" + route + "....         location:" + $location.path() + "    ...href" + location.href);
        return location.href.indexOf(route) >= 0;
    }
});
