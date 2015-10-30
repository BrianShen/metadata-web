package com.fanli.metadata.dao.base;

import com.fanli.metadata.entity.base.EtlMetaColumn;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtlMetaColumnMapper {

    List<EtlMetaColumn> findColumnsByTableId(@Param("table_id")Integer table_id,@Param("isPartition") Integer is_partition);
    int updateColumn(@Param("column")EtlMetaColumn column);

}