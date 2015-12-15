package com.fanli.metadata.dao.base;

import com.fanli.metadata.entity.base.EtlMetaIndicator;
import com.fanli.metadata.entity.base.EtlMetaIndicatorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtlMetaIndicatorMapper {
    int countByExample(EtlMetaIndicatorExample example);

    int deleteByExample(EtlMetaIndicatorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EtlMetaIndicator record);

    int insertSelective(EtlMetaIndicator record);

    List<EtlMetaIndicator> selectByExample(EtlMetaIndicatorExample example);

    EtlMetaIndicator selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EtlMetaIndicator record, @Param("example") EtlMetaIndicatorExample example);

    int updateByExample(@Param("record") EtlMetaIndicator record, @Param("example") EtlMetaIndicatorExample example);

    int updateByPrimaryKeySelective(EtlMetaIndicator record);

    int updateByPrimaryKey(EtlMetaIndicator record);
}