/**
 * Created by wei.shen on 2015/12/7.
 */

metaApp.factory('restfulService',function($resource,$http,$q){
    return {
        model : $resource("/meta/tables/:tableId",{},{
            query:{
                method:'GET',
                params:{
                    tableId:'@tableId'
                }
            }
        }),

        column : $resource("/meta/columns",{},{
            query:{
                method:'GET',
                params:{
                    tableId:'@tableId',
                    isPartition:'@isPartition'
                }
            }
        }),

        columnsComment : $resource("/meta/columns",{tableId:'@tableId',columnIds:'@columnIds',
            columnComments:'@columnComments'}),

        indicators : $resource("/meta/indicators"),

        indicator : $resource("/meta/indicators/:id",{id:'@id'})


    }
})