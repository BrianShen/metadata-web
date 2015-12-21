package com.fanli.metadata.controller;

import com.fanli.metadata.dao.base.EtlMetaIndicatorMapper;
import com.fanli.metadata.dao.base.EtlMetaTableBaseMapper;
import com.fanli.metadata.entity.ErrorMsg;
import com.fanli.metadata.entity.IndicatorDo;
import com.fanli.metadata.entity.Result;
import com.fanli.metadata.entity.Storage;
import com.fanli.metadata.entity.base.EtlMetaIndicator;
import com.fanli.metadata.entity.base.EtlMetaIndicatorExample;
import com.fanli.metadata.entity.base.EtlMetaTableBase;
import com.fanli.metadata.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
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

    /**
     *
     * @param indicatorDo
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public void createIndicator(@RequestBody IndicatorDo indicatorDo) {
        modelService.addIndecator(indicatorDo.getCalLogic(), indicatorDo.getOwner(),
                indicatorDo.getCycle(), indicatorDo.getName(), Storage.INDICATOR.toString().toLowerCase(), (byte) 1, indicatorDo.getDetailDesc());
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

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeIndicator(@PathVariable("id") Long id) {
        int ret = modelService.deleteIndicatorById(id);
//        if (ret == 0) {
//            ErrorMsg errorMsg = new ErrorMsg(111,"delete indicator failed!");
//            ResponseEntity<ErrorMsg> error = new ResponseEntity<ErrorMsg>(errorMsg,HttpStatus.NOT_FOUND);
//            return error;
//        }
//        return new ResponseEntity<Object>(new Object(),HttpStatus.OK);

    }

}
