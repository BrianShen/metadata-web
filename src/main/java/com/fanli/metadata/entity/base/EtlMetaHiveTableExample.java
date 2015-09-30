package com.fanli.metadata.entity.base;

import java.util.ArrayList;
import java.util.List;

public class EtlMetaHiveTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EtlMetaHiveTableExample() {
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

        public Criteria andHiveDbIsNull() {
            addCriterion("hive_db is null");
            return (Criteria) this;
        }

        public Criteria andHiveDbIsNotNull() {
            addCriterion("hive_db is not null");
            return (Criteria) this;
        }

        public Criteria andHiveDbEqualTo(String value) {
            addCriterion("hive_db =", value, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbNotEqualTo(String value) {
            addCriterion("hive_db <>", value, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbGreaterThan(String value) {
            addCriterion("hive_db >", value, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbGreaterThanOrEqualTo(String value) {
            addCriterion("hive_db >=", value, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbLessThan(String value) {
            addCriterion("hive_db <", value, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbLessThanOrEqualTo(String value) {
            addCriterion("hive_db <=", value, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbLike(String value) {
            addCriterion("hive_db like", value, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbNotLike(String value) {
            addCriterion("hive_db not like", value, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbIn(List<String> values) {
            addCriterion("hive_db in", values, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbNotIn(List<String> values) {
            addCriterion("hive_db not in", values, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbBetween(String value1, String value2) {
            addCriterion("hive_db between", value1, value2, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andHiveDbNotBetween(String value1, String value2) {
            addCriterion("hive_db not between", value1, value2, "hiveDb");
            return (Criteria) this;
        }

        public Criteria andInputFormatIsNull() {
            addCriterion("input_format is null");
            return (Criteria) this;
        }

        public Criteria andInputFormatIsNotNull() {
            addCriterion("input_format is not null");
            return (Criteria) this;
        }

        public Criteria andInputFormatEqualTo(String value) {
            addCriterion("input_format =", value, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatNotEqualTo(String value) {
            addCriterion("input_format <>", value, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatGreaterThan(String value) {
            addCriterion("input_format >", value, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatGreaterThanOrEqualTo(String value) {
            addCriterion("input_format >=", value, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatLessThan(String value) {
            addCriterion("input_format <", value, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatLessThanOrEqualTo(String value) {
            addCriterion("input_format <=", value, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatLike(String value) {
            addCriterion("input_format like", value, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatNotLike(String value) {
            addCriterion("input_format not like", value, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatIn(List<String> values) {
            addCriterion("input_format in", values, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatNotIn(List<String> values) {
            addCriterion("input_format not in", values, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatBetween(String value1, String value2) {
            addCriterion("input_format between", value1, value2, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andInputFormatNotBetween(String value1, String value2) {
            addCriterion("input_format not between", value1, value2, "inputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatIsNull() {
            addCriterion("output_format is null");
            return (Criteria) this;
        }

        public Criteria andOutputFormatIsNotNull() {
            addCriterion("output_format is not null");
            return (Criteria) this;
        }

        public Criteria andOutputFormatEqualTo(String value) {
            addCriterion("output_format =", value, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatNotEqualTo(String value) {
            addCriterion("output_format <>", value, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatGreaterThan(String value) {
            addCriterion("output_format >", value, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatGreaterThanOrEqualTo(String value) {
            addCriterion("output_format >=", value, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatLessThan(String value) {
            addCriterion("output_format <", value, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatLessThanOrEqualTo(String value) {
            addCriterion("output_format <=", value, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatLike(String value) {
            addCriterion("output_format like", value, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatNotLike(String value) {
            addCriterion("output_format not like", value, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatIn(List<String> values) {
            addCriterion("output_format in", values, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatNotIn(List<String> values) {
            addCriterion("output_format not in", values, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatBetween(String value1, String value2) {
            addCriterion("output_format between", value1, value2, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andOutputFormatNotBetween(String value1, String value2) {
            addCriterion("output_format not between", value1, value2, "outputFormat");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationIsNull() {
            addCriterion("hdfs_location is null");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationIsNotNull() {
            addCriterion("hdfs_location is not null");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationEqualTo(String value) {
            addCriterion("hdfs_location =", value, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationNotEqualTo(String value) {
            addCriterion("hdfs_location <>", value, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationGreaterThan(String value) {
            addCriterion("hdfs_location >", value, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationGreaterThanOrEqualTo(String value) {
            addCriterion("hdfs_location >=", value, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationLessThan(String value) {
            addCriterion("hdfs_location <", value, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationLessThanOrEqualTo(String value) {
            addCriterion("hdfs_location <=", value, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationLike(String value) {
            addCriterion("hdfs_location like", value, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationNotLike(String value) {
            addCriterion("hdfs_location not like", value, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationIn(List<String> values) {
            addCriterion("hdfs_location in", values, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationNotIn(List<String> values) {
            addCriterion("hdfs_location not in", values, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationBetween(String value1, String value2) {
            addCriterion("hdfs_location between", value1, value2, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andHdfsLocationNotBetween(String value1, String value2) {
            addCriterion("hdfs_location not between", value1, value2, "hdfsLocation");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNull() {
            addCriterion("table_type is null");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNotNull() {
            addCriterion("table_type is not null");
            return (Criteria) this;
        }

        public Criteria andTableTypeEqualTo(String value) {
            addCriterion("table_type =", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotEqualTo(String value) {
            addCriterion("table_type <>", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThan(String value) {
            addCriterion("table_type >", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("table_type >=", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThan(String value) {
            addCriterion("table_type <", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThanOrEqualTo(String value) {
            addCriterion("table_type <=", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLike(String value) {
            addCriterion("table_type like", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotLike(String value) {
            addCriterion("table_type not like", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeIn(List<String> values) {
            addCriterion("table_type in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotIn(List<String> values) {
            addCriterion("table_type not in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeBetween(String value1, String value2) {
            addCriterion("table_type between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotBetween(String value1, String value2) {
            addCriterion("table_type not between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedIsNull() {
            addCriterion("field_terminated is null");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedIsNotNull() {
            addCriterion("field_terminated is not null");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedEqualTo(String value) {
            addCriterion("field_terminated =", value, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedNotEqualTo(String value) {
            addCriterion("field_terminated <>", value, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedGreaterThan(String value) {
            addCriterion("field_terminated >", value, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedGreaterThanOrEqualTo(String value) {
            addCriterion("field_terminated >=", value, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedLessThan(String value) {
            addCriterion("field_terminated <", value, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedLessThanOrEqualTo(String value) {
            addCriterion("field_terminated <=", value, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedLike(String value) {
            addCriterion("field_terminated like", value, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedNotLike(String value) {
            addCriterion("field_terminated not like", value, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedIn(List<String> values) {
            addCriterion("field_terminated in", values, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedNotIn(List<String> values) {
            addCriterion("field_terminated not in", values, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedBetween(String value1, String value2) {
            addCriterion("field_terminated between", value1, value2, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andFieldTerminatedNotBetween(String value1, String value2) {
            addCriterion("field_terminated not between", value1, value2, "fieldTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedIsNull() {
            addCriterion("line_terminated is null");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedIsNotNull() {
            addCriterion("line_terminated is not null");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedEqualTo(String value) {
            addCriterion("line_terminated =", value, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedNotEqualTo(String value) {
            addCriterion("line_terminated <>", value, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedGreaterThan(String value) {
            addCriterion("line_terminated >", value, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedGreaterThanOrEqualTo(String value) {
            addCriterion("line_terminated >=", value, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedLessThan(String value) {
            addCriterion("line_terminated <", value, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedLessThanOrEqualTo(String value) {
            addCriterion("line_terminated <=", value, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedLike(String value) {
            addCriterion("line_terminated like", value, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedNotLike(String value) {
            addCriterion("line_terminated not like", value, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedIn(List<String> values) {
            addCriterion("line_terminated in", values, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedNotIn(List<String> values) {
            addCriterion("line_terminated not in", values, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedBetween(String value1, String value2) {
            addCriterion("line_terminated between", value1, value2, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andLineTerminatedNotBetween(String value1, String value2) {
            addCriterion("line_terminated not between", value1, value2, "lineTerminated");
            return (Criteria) this;
        }

        public Criteria andStoreFormatIsNull() {
            addCriterion("store_format is null");
            return (Criteria) this;
        }

        public Criteria andStoreFormatIsNotNull() {
            addCriterion("store_format is not null");
            return (Criteria) this;
        }

        public Criteria andStoreFormatEqualTo(String value) {
            addCriterion("store_format =", value, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatNotEqualTo(String value) {
            addCriterion("store_format <>", value, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatGreaterThan(String value) {
            addCriterion("store_format >", value, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatGreaterThanOrEqualTo(String value) {
            addCriterion("store_format >=", value, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatLessThan(String value) {
            addCriterion("store_format <", value, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatLessThanOrEqualTo(String value) {
            addCriterion("store_format <=", value, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatLike(String value) {
            addCriterion("store_format like", value, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatNotLike(String value) {
            addCriterion("store_format not like", value, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatIn(List<String> values) {
            addCriterion("store_format in", values, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatNotIn(List<String> values) {
            addCriterion("store_format not in", values, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatBetween(String value1, String value2) {
            addCriterion("store_format between", value1, value2, "storeFormat");
            return (Criteria) this;
        }

        public Criteria andStoreFormatNotBetween(String value1, String value2) {
            addCriterion("store_format not between", value1, value2, "storeFormat");
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