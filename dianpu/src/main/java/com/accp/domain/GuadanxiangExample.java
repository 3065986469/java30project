package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class GuadanxiangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuadanxiangExample() {
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

        public Criteria andGdxidIsNull() {
            addCriterion("gdxid is null");
            return (Criteria) this;
        }

        public Criteria andGdxidIsNotNull() {
            addCriterion("gdxid is not null");
            return (Criteria) this;
        }

        public Criteria andGdxidEqualTo(Integer value) {
            addCriterion("gdxid =", value, "gdxid");
            return (Criteria) this;
        }

        public Criteria andGdxidNotEqualTo(Integer value) {
            addCriterion("gdxid <>", value, "gdxid");
            return (Criteria) this;
        }

        public Criteria andGdxidGreaterThan(Integer value) {
            addCriterion("gdxid >", value, "gdxid");
            return (Criteria) this;
        }

        public Criteria andGdxidGreaterThanOrEqualTo(Integer value) {
            addCriterion("gdxid >=", value, "gdxid");
            return (Criteria) this;
        }

        public Criteria andGdxidLessThan(Integer value) {
            addCriterion("gdxid <", value, "gdxid");
            return (Criteria) this;
        }

        public Criteria andGdxidLessThanOrEqualTo(Integer value) {
            addCriterion("gdxid <=", value, "gdxid");
            return (Criteria) this;
        }

        public Criteria andGdxidIn(List<Integer> values) {
            addCriterion("gdxid in", values, "gdxid");
            return (Criteria) this;
        }

        public Criteria andGdxidNotIn(List<Integer> values) {
            addCriterion("gdxid not in", values, "gdxid");
            return (Criteria) this;
        }

        public Criteria andGdxidBetween(Integer value1, Integer value2) {
            addCriterion("gdxid between", value1, value2, "gdxid");
            return (Criteria) this;
        }

        public Criteria andGdxidNotBetween(Integer value1, Integer value2) {
            addCriterion("gdxid not between", value1, value2, "gdxid");
            return (Criteria) this;
        }

        public Criteria andCjnoIsNull() {
            addCriterion("cjno is null");
            return (Criteria) this;
        }

        public Criteria andCjnoIsNotNull() {
            addCriterion("cjno is not null");
            return (Criteria) this;
        }

        public Criteria andCjnoEqualTo(String value) {
            addCriterion("cjno =", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoNotEqualTo(String value) {
            addCriterion("cjno <>", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoGreaterThan(String value) {
            addCriterion("cjno >", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoGreaterThanOrEqualTo(String value) {
            addCriterion("cjno >=", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoLessThan(String value) {
            addCriterion("cjno <", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoLessThanOrEqualTo(String value) {
            addCriterion("cjno <=", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoLike(String value) {
            addCriterion("cjno like", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoNotLike(String value) {
            addCriterion("cjno not like", value, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoIn(List<String> values) {
            addCriterion("cjno in", values, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoNotIn(List<String> values) {
            addCriterion("cjno not in", values, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoBetween(String value1, String value2) {
            addCriterion("cjno between", value1, value2, "cjno");
            return (Criteria) this;
        }

        public Criteria andCjnoNotBetween(String value1, String value2) {
            addCriterion("cjno not between", value1, value2, "cjno");
            return (Criteria) this;
        }

        public Criteria andSpidIsNull() {
            addCriterion("spid is null");
            return (Criteria) this;
        }

        public Criteria andSpidIsNotNull() {
            addCriterion("spid is not null");
            return (Criteria) this;
        }

        public Criteria andSpidEqualTo(Integer value) {
            addCriterion("spid =", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotEqualTo(Integer value) {
            addCriterion("spid <>", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThan(Integer value) {
            addCriterion("spid >", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidGreaterThanOrEqualTo(Integer value) {
            addCriterion("spid >=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThan(Integer value) {
            addCriterion("spid <", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidLessThanOrEqualTo(Integer value) {
            addCriterion("spid <=", value, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidIn(List<Integer> values) {
            addCriterion("spid in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotIn(List<Integer> values) {
            addCriterion("spid not in", values, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidBetween(Integer value1, Integer value2) {
            addCriterion("spid between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andSpidNotBetween(Integer value1, Integer value2) {
            addCriterion("spid not between", value1, value2, "spid");
            return (Criteria) this;
        }

        public Criteria andSpnumIsNull() {
            addCriterion("spnum is null");
            return (Criteria) this;
        }

        public Criteria andSpnumIsNotNull() {
            addCriterion("spnum is not null");
            return (Criteria) this;
        }

        public Criteria andSpnumEqualTo(Integer value) {
            addCriterion("spnum =", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumNotEqualTo(Integer value) {
            addCriterion("spnum <>", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumGreaterThan(Integer value) {
            addCriterion("spnum >", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("spnum >=", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumLessThan(Integer value) {
            addCriterion("spnum <", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumLessThanOrEqualTo(Integer value) {
            addCriterion("spnum <=", value, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumIn(List<Integer> values) {
            addCriterion("spnum in", values, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumNotIn(List<Integer> values) {
            addCriterion("spnum not in", values, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumBetween(Integer value1, Integer value2) {
            addCriterion("spnum between", value1, value2, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpnumNotBetween(Integer value1, Integer value2) {
            addCriterion("spnum not between", value1, value2, "spnum");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaIsNull() {
            addCriterion("spdanjia is null");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaIsNotNull() {
            addCriterion("spdanjia is not null");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaEqualTo(Float value) {
            addCriterion("spdanjia =", value, "spdanjia");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaNotEqualTo(Float value) {
            addCriterion("spdanjia <>", value, "spdanjia");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaGreaterThan(Float value) {
            addCriterion("spdanjia >", value, "spdanjia");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaGreaterThanOrEqualTo(Float value) {
            addCriterion("spdanjia >=", value, "spdanjia");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaLessThan(Float value) {
            addCriterion("spdanjia <", value, "spdanjia");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaLessThanOrEqualTo(Float value) {
            addCriterion("spdanjia <=", value, "spdanjia");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaIn(List<Float> values) {
            addCriterion("spdanjia in", values, "spdanjia");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaNotIn(List<Float> values) {
            addCriterion("spdanjia not in", values, "spdanjia");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaBetween(Float value1, Float value2) {
            addCriterion("spdanjia between", value1, value2, "spdanjia");
            return (Criteria) this;
        }

        public Criteria andSpdanjiaNotBetween(Float value1, Float value2) {
            addCriterion("spdanjia not between", value1, value2, "spdanjia");
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