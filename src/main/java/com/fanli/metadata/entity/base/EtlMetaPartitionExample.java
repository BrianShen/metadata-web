package com.fanli.metadata.entity.base;

import java.util.ArrayList;
import java.util.List;

public class EtlMetaPartitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EtlMetaPartitionExample() {
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

        public Criteria andPartitionIdIsNull() {
            addCriterion("partition_id is null");
            return (Criteria) this;
        }

        public Criteria andPartitionIdIsNotNull() {
            addCriterion("partition_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionIdEqualTo(Integer value) {
            addCriterion("partition_id =", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotEqualTo(Integer value) {
            addCriterion("partition_id <>", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdGreaterThan(Integer value) {
            addCriterion("partition_id >", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("partition_id >=", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdLessThan(Integer value) {
            addCriterion("partition_id <", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdLessThanOrEqualTo(Integer value) {
            addCriterion("partition_id <=", value, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdIn(List<Integer> values) {
            addCriterion("partition_id in", values, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotIn(List<Integer> values) {
            addCriterion("partition_id not in", values, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdBetween(Integer value1, Integer value2) {
            addCriterion("partition_id between", value1, value2, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("partition_id not between", value1, value2, "partitionId");
            return (Criteria) this;
        }

        public Criteria andPartitionNameIsNull() {
            addCriterion("partition_name is null");
            return (Criteria) this;
        }

        public Criteria andPartitionNameIsNotNull() {
            addCriterion("partition_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionNameEqualTo(String value) {
            addCriterion("partition_name =", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameNotEqualTo(String value) {
            addCriterion("partition_name <>", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameGreaterThan(String value) {
            addCriterion("partition_name >", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameGreaterThanOrEqualTo(String value) {
            addCriterion("partition_name >=", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameLessThan(String value) {
            addCriterion("partition_name <", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameLessThanOrEqualTo(String value) {
            addCriterion("partition_name <=", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameLike(String value) {
            addCriterion("partition_name like", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameNotLike(String value) {
            addCriterion("partition_name not like", value, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameIn(List<String> values) {
            addCriterion("partition_name in", values, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameNotIn(List<String> values) {
            addCriterion("partition_name not in", values, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameBetween(String value1, String value2) {
            addCriterion("partition_name between", value1, value2, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionNameNotBetween(String value1, String value2) {
            addCriterion("partition_name not between", value1, value2, "partitionName");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeIsNull() {
            addCriterion("partition_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeIsNotNull() {
            addCriterion("partition_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeEqualTo(String value) {
            addCriterion("partition_create_time =", value, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeNotEqualTo(String value) {
            addCriterion("partition_create_time <>", value, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeGreaterThan(String value) {
            addCriterion("partition_create_time >", value, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("partition_create_time >=", value, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeLessThan(String value) {
            addCriterion("partition_create_time <", value, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("partition_create_time <=", value, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeLike(String value) {
            addCriterion("partition_create_time like", value, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeNotLike(String value) {
            addCriterion("partition_create_time not like", value, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeIn(List<String> values) {
            addCriterion("partition_create_time in", values, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeNotIn(List<String> values) {
            addCriterion("partition_create_time not in", values, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeBetween(String value1, String value2) {
            addCriterion("partition_create_time between", value1, value2, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andPartitionCreateTimeNotBetween(String value1, String value2) {
            addCriterion("partition_create_time not between", value1, value2, "partitionCreateTime");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNull() {
            addCriterion("table_id is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("table_id is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(Integer value) {
            addCriterion("table_id =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(Integer value) {
            addCriterion("table_id <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(Integer value) {
            addCriterion("table_id >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_id >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(Integer value) {
            addCriterion("table_id <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("table_id <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<Integer> values) {
            addCriterion("table_id in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<Integer> values) {
            addCriterion("table_id not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(Integer value1, Integer value2) {
            addCriterion("table_id between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("table_id not between", value1, value2, "tableId");
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

        public Criteria andAddTimeEqualTo(String value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(String value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(String value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(String value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(String value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLike(String value) {
            addCriterion("add_time like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotLike(String value) {
            addCriterion("add_time not like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<String> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<String> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(String value1, String value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(String value1, String value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
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