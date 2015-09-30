package com.fanli.metadata.dao.base;

import com.fanli.metadata.entity.base.EtlMetaHiveTable;
import com.fanli.metadata.entity.base.EtlMetaHiveTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtlMetaHiveTableMapper {
    int countByExample(EtlMetaHiveTableExample example);

    int deleteByExample(EtlMetaHiveTableExample example);

    int deleteByPrimaryKey(Integer tableId);

    int insert(EtlMetaHiveTable record);

    int insertSelective(EtlMetaHiveTable record);

    List<EtlMetaHiveTable> selectByExampleWithBLOBs(EtlMetaHiveTableExample example);

    List<EtlMetaHiveTable> selectByExample(EtlMetaHiveTableExample example);

    EtlMetaHiveTable selectByPrimaryKey(Integer tableId);

    int updateByExampleSelective(@Param("record") EtlMetaHiveTable record, @Param("example") EtlMetaHiveTableExample example);

    int updateByExampleWithBLOBs(@Param("record") EtlMetaHiveTable record, @Param("example") EtlMetaHiveTableExample example);

    int updateByExample(@Param("record") EtlMetaHiveTable record, @Param("example") EtlMetaHiveTableExample example);

    int updateByPrimaryKeySelective(EtlMetaHiveTable record);

    int updateByPrimaryKeyWithBLOBs(EtlMetaHiveTable record);

    int updateByPrimaryKey(EtlMetaHiveTable record);
}