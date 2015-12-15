/**
 * Created by wei.shen on 2015/12/15.
 */

function replaceText(str)
{
    var str1 = String(str);
    return str1.replace(/\n/g,"<br/>");
}
metaApp.directive('prettify', ['$compile', '$timeout', function ($compile, $timeout) {
    return {
        restrict: 'E',
        scope: {
            target: '='
        },
        link: function (scope, element, attrs) {
            var template = element.html();
            var templateFn = $compile(template);

            var update = function(){
                $timeout(function () {
                    var compiled = templateFn(scope).html();
                    var prettified = prettyPrintOne(replaceText(compiled));
                    element.html(prettified);
                }, 0);
            }
            scope.$watch('target', function () {
                update();
            }, true);
            update();
        }
    };
}]);