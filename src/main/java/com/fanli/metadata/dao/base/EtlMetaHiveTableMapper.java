package com.fanli.metadata.dao.base;

import com.fanli.metadata.entity.base.EtlMetaHiveTable;
import com.fanli.metadata.entity.base.EtlMetaHiveTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtlMetaHiveTableMapper {
    EtlMetaHiveTable findHiveMetaByTableId(Integer table_id);
}