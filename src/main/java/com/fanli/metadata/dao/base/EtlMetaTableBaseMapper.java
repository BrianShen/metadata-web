package com.fanli.metadata.dao.base;

import com.fanli.metadata.entity.base.EtlMetaTableBase;
import com.fanli.metadata.entity.base.EtlMetaTableBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EtlMetaTableBaseMapper {

    /**
     * 查询所有有效的表名
     * @return 表名的列表
     */
    List<String> listAllTableNames();

    /**
     * 根据关键字模糊查询表
     * @param keyword
     * @return 模型信息列表
     */
    List<EtlMetaTableBase> findTablesByNameFuzzy(String keyword);

    /**
     * 根据参数列表查询表信息
     * @param etlMetaTableBase
     * @return 模型信息列表
     */
    List<EtlMetaTableBase> findTablesByParams(EtlMetaTableBase etlMetaTableBase);

    /**
     * 根据主键id查询表信息
     * @param id
     * @return
     */
    EtlMetaTableBase findTableById(Integer id);


}