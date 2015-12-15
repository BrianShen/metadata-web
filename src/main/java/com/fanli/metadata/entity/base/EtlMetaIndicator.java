package com.fanli.metadata.entity.base;

public class EtlMetaIndicator {
    private Integer id;

    private Long globalId;

    private String calLogic;

    private String owner;

    private String cycle;

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
        this.calLogic = calLogic == null ? null : calLogic.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle == null ? null : cycle.trim();
    }
}