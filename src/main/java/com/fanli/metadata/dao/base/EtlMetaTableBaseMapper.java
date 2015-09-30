package com.fanli.metadata.dao.base;

import com.fanli.metadata.entity.base.EtlMetaTableBase;
import com.fanli.metadata.entity.base.EtlMetaTableBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtlMetaTableBaseMapper {
    int countByExample(EtlMetaTableBaseExample example);

    int deleteByExample(EtlMetaTableBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EtlMetaTableBase record);

    int insertSelective(EtlMetaTableBase record);

    List<EtlMetaTableBase> selectByExampleWithBLOBs(EtlMetaTableBaseExample example);

    List<EtlMetaTableBase> selectByExample(EtlMetaTableBaseExample example);

    EtlMetaTableBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EtlMetaTableBase record, @Param("example") EtlMetaTableBaseExample example);

    int updateByExampleWithBLOBs(@Param("record") EtlMetaTableBase record, @Param("example") EtlMetaTableBaseExample example);

    int updateByExample(@Param("record") EtlMetaTableBase record, @Param("example") EtlMetaTableBaseExample example);

    int updateByPrimaryKeySelective(EtlMetaTableBase record);

    int updateByPrimaryKeyWithBLOBs(EtlMetaTableBase record);

    int updateByPrimaryKey(EtlMetaTableBase record);
}