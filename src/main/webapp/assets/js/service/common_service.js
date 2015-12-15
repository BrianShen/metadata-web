/**
 * Created by wei.shen on 2015/12/15.
 */

metaApp.factory('CommonService',function() {
    return {
        /**
         * 解析url获得指定参数parm信息
         * */
        parserUrl : function (parm) {
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
    }
})
