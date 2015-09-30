package com.fanli.metadata.entity.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EtlMetaTableBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EtlMetaTableBaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("table_name =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("table_name >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("table_name <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("table_name like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("table_name not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("table_name in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andDomainIsNull() {
            addCriterion("domain is null");
            return (Criteria) this;
        }

        public Criteria andDomainIsNotNull() {
            addCriterion("domain is not null");
            return (Criteria) this;
        }

        public Criteria andDomainEqualTo(String value) {
            addCriterion("domain =", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotEqualTo(String value) {
            addCriterion("domain <>", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThan(String value) {
            addCriterion("domain >", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainGreaterThanOrEqualTo(String value) {
            addCriterion("domain >=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThan(String value) {
            addCriterion("domain <", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLessThanOrEqualTo(String value) {
            addCriterion("domain <=", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainLike(String value) {
            addCriterion("domain like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotLike(String value) {
            addCriterion("domain not like", value, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainIn(List<String> values) {
            addCriterion("domain in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotIn(List<String> values) {
            addCriterion("domain not in", values, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainBetween(String value1, String value2) {
            addCriterion("domain between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDomainNotBetween(String value1, String value2) {
            addCriterion("domain not between", value1, value2, "domain");
            return (Criteria) this;
        }

        public Criteria andDbIsNull() {
            addCriterion("db is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("db is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("db =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("db <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("db >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("db >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("db <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("db <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("db like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("db not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("db in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("db not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("db between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("db not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andSchemaIsNull() {
            addCriterion("schema is null");
            return (Criteria) this;
        }

        public Criteria andSchemaIsNotNull() {
            addCriterion("schema is not null");
            return (Criteria) this;
        }

        public Criteria andSchemaEqualTo(String value) {
            addCriterion("schema =", value, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaNotEqualTo(String value) {
            addCriterion("schema <>", value, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaGreaterThan(String value) {
            addCriterion("schema >", value, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("schema >=", value, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaLessThan(String value) {
            addCriterion("schema <", value, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaLessThanOrEqualTo(String value) {
            addCriterion("schema <=", value, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaLike(String value) {
            addCriterion("schema like", value, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaNotLike(String value) {
            addCriterion("schema not like", value, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaIn(List<String> values) {
            addCriterion("schema in", values, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaNotIn(List<String> values) {
            addCriterion("schema not in", values, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaBetween(String value1, String value2) {
            addCriterion("schema between", value1, value2, "schema");
            return (Criteria) this;
        }

        public Criteria andSchemaNotBetween(String value1, String value2) {
            addCriterion("schema not between", value1, value2, "schema");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNull() {
            addCriterion("storage_type is null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNotNull() {
            addCriterion("storage_type is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeEqualTo(String value) {
            addCriterion("storage_type =", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotEqualTo(String value) {
            addCriterion("storage_type <>", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThan(String value) {
            addCriterion("storage_type >", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("storage_type >=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThan(String value) {
            addCriterion("storage_type <", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThanOrEqualTo(String value) {
            addCriterion("storage_type <=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLike(String value) {
            addCriterion("storage_type like", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotLike(String value) {
            addCriterion("storage_type not like", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIn(List<String> values) {
            addCriterion("storage_type in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotIn(List<String> values) {
            addCriterion("storage_type not in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeBetween(String value1, String value2) {
            addCriterion("storage_type between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotBetween(String value1, String value2) {
            addCriterion("storage_type not between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNull() {
            addCriterion("developer is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIsNotNull() {
            addCriterion("developer is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperEqualTo(String value) {
            addCriterion("developer =", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotEqualTo(String value) {
            addCriterion("developer <>", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThan(String value) {
            addCriterion("developer >", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperGreaterThanOrEqualTo(String value) {
            addCriterion("developer >=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThan(String value) {
            addCriterion("developer <", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLessThanOrEqualTo(String value) {
            addCriterion("developer <=", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperLike(String value) {
            addCriterion("developer like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotLike(String value) {
            addCriterion("developer not like", value, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperIn(List<String> values) {
            addCriterion("developer in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotIn(List<String> values) {
            addCriterion("developer not in", values, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperBetween(String value1, String value2) {
            addCriterion("developer between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andDeveloperNotBetween(String value1, String value2) {
            addCriterion("developer not between", value1, value2, "developer");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNull() {
            addCriterion("task_status is null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIsNotNull() {
            addCriterion("task_status is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStatusEqualTo(Integer value) {
            addCriterion("task_status =", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotEqualTo(Integer value) {
            addCriterion("task_status <>", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThan(Integer value) {
            addCriterion("task_status >", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_status >=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThan(Integer value) {
            addCriterion("task_status <", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusLessThanOrEqualTo(Integer value) {
            addCriterion("task_status <=", value, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusIn(List<Integer> values) {
            addCriterion("task_status in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotIn(List<Integer> values) {
            addCriterion("task_status not in", values, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusBetween(Integer value1, Integer value2) {
            addCriterion("task_status between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andTaskStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("task_status not between", value1, value2, "taskStatus");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeIsNull() {
            addCriterion("refresh_type is null");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeIsNotNull() {
            addCriterion("refresh_type is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeEqualTo(String value) {
            addCriterion("refresh_type =", value, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeNotEqualTo(String value) {
            addCriterion("refresh_type <>", value, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeGreaterThan(String value) {
            addCriterion("refresh_type >", value, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeGreaterThanOrEqualTo(String value) {
            addCriterion("refresh_type >=", value, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeLessThan(String value) {
            addCriterion("refresh_type <", value, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeLessThanOrEqualTo(String value) {
            addCriterion("refresh_type <=", value, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeLike(String value) {
            addCriterion("refresh_type like", value, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeNotLike(String value) {
            addCriterion("refresh_type not like", value, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeIn(List<String> values) {
            addCriterion("refresh_type in", values, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeNotIn(List<String> values) {
            addCriterion("refresh_type not in", values, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeBetween(String value1, String value2) {
            addCriterion("refresh_type between", value1, value2, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshTypeNotBetween(String value1, String value2) {
            addCriterion("refresh_type not between", value1, value2, "refreshType");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetIsNull() {
            addCriterion("refresh_offset is null");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetIsNotNull() {
            addCriterion("refresh_offset is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetEqualTo(String value) {
            addCriterion("refresh_offset =", value, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetNotEqualTo(String value) {
            addCriterion("refresh_offset <>", value, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetGreaterThan(String value) {
            addCriterion("refresh_offset >", value, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetGreaterThanOrEqualTo(String value) {
            addCriterion("refresh_offset >=", value, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetLessThan(String value) {
            addCriterion("refresh_offset <", value, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetLessThanOrEqualTo(String value) {
            addCriterion("refresh_offset <=", value, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetLike(String value) {
            addCriterion("refresh_offset like", value, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetNotLike(String value) {
            addCriterion("refresh_offset not like", value, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetIn(List<String> values) {
            addCriterion("refresh_offset in", values, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetNotIn(List<String> values) {
            addCriterion("refresh_offset not in", values, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetBetween(String value1, String value2) {
            addCriterion("refresh_offset between", value1, value2, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshOffsetNotBetween(String value1, String value2) {
            addCriterion("refresh_offset not between", value1, value2, "refreshOffset");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleIsNull() {
            addCriterion("refresh_cycle is null");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleIsNotNull() {
            addCriterion("refresh_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleEqualTo(String value) {
            addCriterion("refresh_cycle =", value, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleNotEqualTo(String value) {
            addCriterion("refresh_cycle <>", value, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleGreaterThan(String value) {
            addCriterion("refresh_cycle >", value, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleGreaterThanOrEqualTo(String value) {
            addCriterion("refresh_cycle >=", value, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleLessThan(String value) {
            addCriterion("refresh_cycle <", value, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleLessThanOrEqualTo(String value) {
            addCriterion("refresh_cycle <=", value, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleLike(String value) {
            addCriterion("refresh_cycle like", value, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleNotLike(String value) {
            addCriterion("refresh_cycle not like", value, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleIn(List<String> values) {
            addCriterion("refresh_cycle in", values, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleNotIn(List<String> values) {
            addCriterion("refresh_cycle not in", values, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleBetween(String value1, String value2) {
            addCriterion("refresh_cycle between", value1, value2, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andRefreshCycleNotBetween(String value1, String value2) {
            addCriterion("refresh_cycle not between", value1, value2, "refreshCycle");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableIsNull() {
            addCriterion("is_partition_table is null");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableIsNotNull() {
            addCriterion("is_partition_table is not null");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableEqualTo(Byte value) {
            addCriterion("is_partition_table =", value, "isPartitionTable");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableNotEqualTo(Byte value) {
            addCriterion("is_partition_table <>", value, "isPartitionTable");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableGreaterThan(Byte value) {
            addCriterion("is_partition_table >", value, "isPartitionTable");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_partition_table >=", value, "isPartitionTable");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableLessThan(Byte value) {
            addCriterion("is_partition_table <", value, "isPartitionTable");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableLessThanOrEqualTo(Byte value) {
            addCriterion("is_partition_table <=", value, "isPartitionTable");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableIn(List<Byte> values) {
            addCriterion("is_partition_table in", values, "isPartitionTable");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableNotIn(List<Byte> values) {
            addCriterion("is_partition_table not in", values, "isPartitionTable");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableBetween(Byte value1, Byte value2) {
            addCriterion("is_partition_table between", value1, value2, "isPartitionTable");
            return (Criteria) this;
        }

        public Criteria andIsPartitionTableNotBetween(Byte value1, Byte value2) {
            addCriterion("is_partition_table not between", value1, value2, "isPartitionTable");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeIsNull() {
            addCriterion("data_last_refresh_time is null");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeIsNotNull() {
            addCriterion("data_last_refresh_time is not null");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeEqualTo(Date value) {
            addCriterion("data_last_refresh_time =", value, "dataLastRefreshTime");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeNotEqualTo(Date value) {
            addCriterion("data_last_refresh_time <>", value, "dataLastRefreshTime");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeGreaterThan(Date value) {
            addCriterion("data_last_refresh_time >", value, "dataLastRefreshTime");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("data_last_refresh_time >=", value, "dataLastRefreshTime");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeLessThan(Date value) {
            addCriterion("data_last_refresh_time <", value, "dataLastRefreshTime");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeLessThanOrEqualTo(Date value) {
            addCriterion("data_last_refresh_time <=", value, "dataLastRefreshTime");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeIn(List<Date> values) {
            addCriterion("data_last_refresh_time in", values, "dataLastRefreshTime");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeNotIn(List<Date> values) {
            addCriterion("data_last_refresh_time not in", values, "dataLastRefreshTime");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeBetween(Date value1, Date value2) {
            addCriterion("data_last_refresh_time between", value1, value2, "dataLastRefreshTime");
            return (Criteria) this;
        }

        public Criteria andDataLastRefreshTimeNotBetween(Date value1, Date value2) {
            addCriterion("data_last_refresh_time not between", value1, value2, "dataLastRefreshTime");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeIsNull() {
            addCriterion("table_access_code is null");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeIsNotNull() {
            addCriterion("table_access_code is not null");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeEqualTo(Integer value) {
            addCriterion("table_access_code =", value, "tableAccessCode");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeNotEqualTo(Integer value) {
            addCriterion("table_access_code <>", value, "tableAccessCode");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeGreaterThan(Integer value) {
            addCriterion("table_access_code >", value, "tableAccessCode");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_access_code >=", value, "tableAccessCode");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeLessThan(Integer value) {
            addCriterion("table_access_code <", value, "tableAccessCode");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeLessThanOrEqualTo(Integer value) {
            addCriterion("table_access_code <=", value, "tableAccessCode");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeIn(List<Integer> values) {
            addCriterion("table_access_code in", values, "tableAccessCode");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeNotIn(List<Integer> values) {
            addCriterion("table_access_code not in", values, "tableAccessCode");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeBetween(Integer value1, Integer value2) {
            addCriterion("table_access_code between", value1, value2, "tableAccessCode");
            return (Criteria) this;
        }

        public Criteria andTableAccessCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("table_access_code not between", value1, value2, "tableAccessCode");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}