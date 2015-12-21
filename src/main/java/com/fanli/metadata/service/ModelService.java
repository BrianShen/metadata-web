package com.fanli.metadata.service;

import com.fanli.metadata.dao.base.EtlMetaIndicatorMapper;
import com.fanli.metadata.dao.base.EtlMetaTableBaseMapper;
import com.fanli.metadata.entity.IndicatorDo;
import com.fanli.metadata.entity.base.EtlMetaIndicator;
import com.fanli.metadata.entity.base.EtlMetaIndicatorExample;
import com.fanli.metadata.entity.base.EtlMetaTableBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by wei.shen on 2015/12/15.
 */
@Service
public class ModelService {
    @Autowired
    private EtlMetaIndicatorMapper etlMetaIndicatorMapper;

    @Autowired
    private EtlMetaTableBaseMapper etlMetaTableBaseMapper;

    public EtlMetaIndicator getIndicatorByGlobalId(Long globalId) {
        EtlMetaIndicatorExample example = new EtlMetaIndicatorExample();
        example.or().andGlobalIdEqualTo(globalId);
        List<EtlMetaIndicator> list = etlMetaIndicatorMapper.selectByExample(example);
        if (list.size() > 1) return null;
        if (list.size()<= 0) return null;
        return list.get(0);
    }

    @Transactional(propagation= Propagation.REQUIRES_NEW,
            isolation= Isolation.READ_COMMITTED, timeout=3)
    public void addIndecator(String calLogic,String owner,String cycle,String name,
                             String storage_type,Byte status,String detailDesc) {
        EtlMetaTableBase base = new EtlMetaTableBase();
        base.setOwner(owner);
        base.setDeveloper(owner);
        base.setTableName(name);
        base.setRefreshCycle(cycle);
        base.setTableComment(detailDesc);
        base.setStorageType(storage_type);
        base.setStatus(status);
        Date now = new Date();
        base.setAddTime(now);
        etlMetaTableBaseMapper.saveTableBase(base);
        EtlMetaIndicator indicator = new EtlMetaIndicator();
        indicator.setGlobalId(base.getGlobalTableId());
        indicator.setCycle(cycle);
        indicator.setDetailDesc(detailDesc);
        indicator.setOwner(owner);
        indicator.setCalLogic(calLogic);
        etlMetaIndicatorMapper.insertSelective(indicator);
    }

    public EtlMetaIndicator findOneIndicatorByGlobalId(Long globalId) {
        EtlMetaIndicatorExample example = new EtlMetaIndicatorExample();
        example.or().andGlobalIdEqualTo(globalId);
        List<EtlMetaIndicator> list = etlMetaIndicatorMapper.selectByExample(example);
        if (list != null) {
            if (list.size() > 1 || list.size() <=0) return null;
            return list.get(0);
        }
        return null;

    }

    @Transactional(propagation= Propagation.REQUIRES_NEW,
            isolation= Isolation.READ_COMMITTED, timeout=3)
    public void updateIndicator(IndicatorDo indicatorDo) {
        EtlMetaIndicator etlMetaIndicator = new EtlMetaIndicator();
        etlMetaIndicator.setCalLogic(indicatorDo.getCalLogic());
        etlMetaIndicator.setCycle(indicatorDo.getCycle());
        etlMetaIndicator.setDetailDesc(indicatorDo.getDetailDesc());
        etlMetaIndicator.setId(indicatorDo.getId());
        etlMetaIndicatorMapper.updateByPrimaryKeySelective(etlMetaIndicator);
        etlMetaTableBaseMapper.updateIndicator(indicatorDo.getGlobalId(),indicatorDo.getComment(),indicatorDo.getCycle(),indicatorDo.getName());
    }

    public List<IndicatorDo> getIndicators() {
        List<IndicatorDo> ret = new ArrayList<IndicatorDo>();
        List<EtlMetaTableBase> bases = etlMetaTableBaseMapper.queryIndicatorTables();
        for (EtlMetaTableBase base : bases) {
            IndicatorDo indicatorDo = new IndicatorDo();
            indicatorDo.setComment(base.getTableComment());
            indicatorDo.setName(base.getTableName());
            EtlMetaIndicator indicator = findOneIndicatorByGlobalId(base.getGlobalTableId());
            indicatorDo.setCalLogic(indicator.getCalLogic());
            indicatorDo.setCycle(indicator.getCycle());
            indicatorDo.setId(indicator.getId());
            indicatorDo.setDetailDesc(indicator.getDetailDesc());
            indicatorDo.setGlobalId(indicator.getGlobalId());
            indicatorDo.setOwner(indicator.getOwner());
            ret.add(indicatorDo);
        }
        return ret;
    }

    @Transactional(propagation= Propagation.REQUIRES_NEW,
            isolation= Isolation.READ_COMMITTED, timeout=3)
    public int deleteIndicatorById(Long id) {
        if(id == null) return 0;
        int ret1 = etlMetaTableBaseMapper.removeRecordByGlobalId(id);
        EtlMetaIndicatorExample example = new EtlMetaIndicatorExample();
        example.or().andGlobalIdEqualTo(id);
        int ret2 = etlMetaIndicatorMapper.deleteByExample(example);
        if (ret1 == 1 && ret2 == 1) return 1;
        return 0;
    }


}
