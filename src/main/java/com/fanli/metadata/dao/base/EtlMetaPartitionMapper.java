package com.fanli.metadata.dao.base;

import com.fanli.metadata.entity.base.EtlMetaPartition;
import com.fanli.metadata.entity.base.EtlMetaPartitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtlMetaPartitionMapper {
    EtlMetaPartition selectLatestPartition(Integer tableId);
}