package com.fanli.metadata.dao.base;

import com.fanli.metadata.entity.base.EtlMetaColumn;
import com.fanli.metadata.entity.base.EtlMetaColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtlMetaColumnMapper {

    List<EtlMetaColumn> findColumnsByTableId(@Param("table_id")Integer table_id,@Param("isPartition") Integer is_partition);

}