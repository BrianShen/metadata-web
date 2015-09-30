package com.fanli.metadata.dao.base;

import com.fanli.metadata.entity.base.EtlMetaColumn;
import com.fanli.metadata.entity.base.EtlMetaColumnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtlMetaColumnMapper {
    int countByExample(EtlMetaColumnExample example);

    int deleteByExample(EtlMetaColumnExample example);

    int insert(EtlMetaColumn record);

    int insertSelective(EtlMetaColumn record);

    List<EtlMetaColumn> selectByExample(EtlMetaColumnExample example);

    int updateByExampleSelective(@Param("record") EtlMetaColumn record, @Param("example") EtlMetaColumnExample example);

    int updateByExample(@Param("record") EtlMetaColumn record, @Param("example") EtlMetaColumnExample example);
}