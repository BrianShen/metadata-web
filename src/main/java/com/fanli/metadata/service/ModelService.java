package com.fanli.metadata.service;

import com.fanli.metadata.dao.base.EtlMetaIndicatorMapper;
import com.fanli.metadata.entity.base.EtlMetaIndicator;
import com.fanli.metadata.entity.base.EtlMetaIndicatorExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wei.shen on 2015/12/15.
 */
@Service
public class ModelService {
    @Autowired
    private EtlMetaIndicatorMapper etlMetaIndicatorMapper;

    public EtlMetaIndicator getIndicatorByGlobalId(Long globalId) {
        EtlMetaIndicatorExample example = new EtlMetaIndicatorExample();
        example.or().andGlobalIdEqualTo(globalId);
        List<EtlMetaIndicator> list = etlMetaIndicatorMapper.selectByExample(example);
        if (list.size() > 1) return null;
        if (list.size()<= 0) return null;
        return list.get(0);
    }
}
