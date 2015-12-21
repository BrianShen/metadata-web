/**
 * Created by Administrator on 2015/10/5.
 */

angular.module("constant.service",[])
    .factory("ConstantService",[function(){
        return {
            /**
             *
             * @returns {{H: string, D: string, W: string, M: string, Y: string}}
             */
            getCycleOptions:function(){
                return {
                    H: '时', D: '日', W: '周', M: '月', Y: '年'
                };
            }
        }
    }]);