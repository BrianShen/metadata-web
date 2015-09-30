package com.fanli.metadata.entity.base;

import java.util.Date;

public class EtlMetaTableBase {
    private Integer id;

    private Integer jobId;

    private String tableName;

    private String domain;

    private String db;

    private String schema;

    private String storageType;

    private String developer;

    private String owner;

    private Integer taskStatus;

    private String refreshType;

    private String refreshOffset;

    private String refreshCycle;

    private Byte status;

    private Byte isPartitionTable;

    private Date dataLastRefreshTime;

    private Integer tableAccessCode;

    private Date addTime;

    private Date updateTime;

    private String tableComment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema == null ? null : schema.trim();
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType == null ? null : storageType.trim();
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer == null ? null : developer.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getRefreshType() {
        return refreshType;
    }

    public void setRefreshType(String refreshType) {
        this.refreshType = refreshType == null ? null : refreshType.trim();
    }

    public String getRefreshOffset() {
        return refreshOffset;
    }

    public void setRefreshOffset(String refreshOffset) {
        this.refreshOffset = refreshOffset == null ? null : refreshOffset.trim();
    }

    public String getRefreshCycle() {
        return refreshCycle;
    }

    public void setRefreshCycle(String refreshCycle) {
        this.refreshCycle = refreshCycle == null ? null : refreshCycle.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getIsPartitionTable() {
        return isPartitionTable;
    }

    public void setIsPartitionTable(Byte isPartitionTable) {
        this.isPartitionTable = isPartitionTable;
    }

    public Date getDataLastRefreshTime() {
        return dataLastRefreshTime;
    }

    public void setDataLastRefreshTime(Date dataLastRefreshTime) {
        this.dataLastRefreshTime = dataLastRefreshTime;
    }

    public Integer getTableAccessCode() {
        return tableAccessCode;
    }

    public void setTableAccessCode(Integer tableAccessCode) {
        this.tableAccessCode = tableAccessCode;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment == null ? null : tableComment.trim();
    }
}