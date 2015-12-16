package com.fanli.metadata.entity;

/**
 * Created by wei.shen on 2015/12/16.
 */
public class IndicatorDo {

    private Integer id;

    private Long globalId;

    private String calLogic;

    private String owner;

    private String cycle;

    private String detailDesc;

    private String name;

    private String comment;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getGlobalId() {
        return globalId;
    }

    public void setGlobalId(Long globalId) {
        this.globalId = globalId;
    }

    public String getCalLogic() {
        return calLogic;
    }

    public void setCalLogic(String calLogic) {
        this.calLogic = calLogic;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
