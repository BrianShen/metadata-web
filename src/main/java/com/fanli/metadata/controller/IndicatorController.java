package com.fanli.metadata.controller;

import com.fanli.metadata.dao.base.EtlMetaIndicatorMapper;
import com.fanli.metadata.dao.base.EtlMetaTableBaseMapper;
import com.fanli.metadata.entity.IndicatorDo;
import com.fanli.metadata.entity.Result;
import com.fanli.metadata.entity.base.EtlMetaIndicator;
import com.fanli.metadata.entity.base.EtlMetaIndicatorExample;
import com.fanli.metadata.entity.base.EtlMetaTableBase;
import com.fanli.metadata.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wei.shen on 2015/12/15.
 */
@Controller
@RequestMapping("/indicators")
public class IndicatorController {
    @Autowired
    private EtlMetaIndicatorMapper etlMetaIndicatorMapper;

    @Autowired
    private EtlMetaTableBaseMapper etlMetaTableBaseMapper;

    @Autowired
    private ModelService modelService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void createIndicator(@RequestParam(value = "calLogic",defaultValue = "") String calLogic,
                                @RequestParam(value = "owner",defaultValue = "") String owner,
                                @RequestParam(value = "cycle",defaultValue = "D") String cycle,
                                @RequestParam(value = "name",defaultValue = "") String name,
                                @RequestParam(value = "storage_type",defaultValue = "indicator") String storage_type,
                                @RequestParam(value = "status",defaultValue = "1") Byte status,
                                @RequestParam(value = "comment",defaultValue = "") String comment,
                                @RequestParam(value = "detail_desc",defaultValue = "") String detailDesc) {
        modelService.addIndecator(calLogic,owner,cycle,name,storage_type,status,comment,detailDesc);
    }

    @ResponseBody
    @RequestMapping(value = "/{gid}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public IndicatorDo queryIndicatorByGid(@PathVariable("gid") Long id) {
        EtlMetaIndicator indicator =  modelService.findOneIndicatorByGlobalId(id);
        EtlMetaTableBase base = etlMetaTableBaseMapper.findTableById(id);
        IndicatorDo indicatorDo = new IndicatorDo();
        indicatorDo.setCalLogic(indicator.getCalLogic());
        indicatorDo.setCycle(indicator.getCycle());
        indicatorDo.setDetailDesc(indicator.getDetailDesc());
        indicatorDo.setOwner(indicator.getOwner());
        indicatorDo.setId(indicator.getId());
        indicatorDo.setComment(base.getTableComment());
        indicatorDo.setName(base.getTableName());
        return indicatorDo;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public EtlMetaIndicator indicator(@PathVariable("id") Integer id) {
        return etlMetaIndicatorMapper.selectByPrimaryKey(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public List<IndicatorDo> indicators() {
        return modelService.getIndicators();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateIndicator(@RequestBody IndicatorDo indicatorDo) {
        modelService.updateIndicator(indicatorDo);
    }

}
