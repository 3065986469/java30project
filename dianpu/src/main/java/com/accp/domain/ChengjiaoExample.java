package com.accp.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ChengjiaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChengjiaoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCjidIsNull() {
            addCriterion("cjid is null");
            return (Criteria) this;
        }

        public Criteria andCjidIsNotNull() {
            addCriterion("cjid is not null");
            return (Criteria) this;
        }

        public Criteria andCjidEqualTo(Integer value) {
            addCriterion("cjid =", value, "cjid");
            return (Criteria) this;
        }

        public Criteria andCjidNotEqualTo(Integer value) {
            addCriterion("cjid <>", value, "cjid");
            return (Criteria) this;
        }

        public Criteria andCjidGreaterThan(Integer value) {
            addCriterion("cjid >", value, "cjid");
            return (Criteria) this;
        }

        public Criteria andCjidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cjid >=", value, "cjid");
            return (Criteria) this;
        }

        public Criteria andCjidLessThan(Integer value) {
            addCriterion("cjid <", value, "cjid");
            return (Criteria) this;
        }

        public Criteria andCjidLessThanOrEqualTo(Integer value) {
            addCriterion("cjid <=", value, "cjid");
            return (Criteria) this;
        }

        public Criteria andCjidIn(List<Integer> values) {
            addCriterion("cjid in", values, "cjid");
            return (Criteria) this;
        }

        public Criteria andCjidNotIn(List<Integer> values) {
            addCriterion("cjid not in", values, "cjid");
            return (Criteria) this;
        }

        public Criteria andCjidBetween(Integer value1, Integer value2) {
            addCriterion("cjid between", value1, value2, "cjid");
            return (Criteria) this;
        }

        public Criteria andCjidNotBetween(Integer value1, Integer value2) {
            addCriterion("cjid not between", value1, value2, "cjid");
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

        public Criteria andHyidIsNull() {
            addCriterion("hyid is null");
            return (Criteria) this;
        }

        public Criteria andHyidIsNotNull() {
            addCriterion("hyid is not null");
            return (Criteria) this;
        }

        public Criteria andHyidEqualTo(Integer value) {
            addCriterion("hyid =", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidNotEqualTo(Integer value) {
            addCriterion("hyid <>", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidGreaterThan(Integer value) {
            addCriterion("hyid >", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("hyid >=", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidLessThan(Integer value) {
            addCriterion("hyid <", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidLessThanOrEqualTo(Integer value) {
            addCriterion("hyid <=", value, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidIn(List<Integer> values) {
            addCriterion("hyid in", values, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidNotIn(List<Integer> values) {
            addCriterion("hyid not in", values, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidBetween(Integer value1, Integer value2) {
            addCriterion("hyid between", value1, value2, "hyid");
            return (Criteria) this;
        }

        public Criteria andHyidNotBetween(Integer value1, Integer value2) {
            addCriterion("hyid not between", value1, value2, "hyid");
            return (Criteria) this;
        }

        public Criteria andCjnumIsNull() {
            addCriterion("cjnum is null");
            return (Criteria) this;
        }

        public Criteria andCjnumIsNotNull() {
            addCriterion("cjnum is not null");
            return (Criteria) this;
        }

        public Criteria andCjnumEqualTo(Integer value) {
            addCriterion("cjnum =", value, "cjnum");
            return (Criteria) this;
        }

        public Criteria andCjnumNotEqualTo(Integer value) {
            addCriterion("cjnum <>", value, "cjnum");
            return (Criteria) this;
        }

        public Criteria andCjnumGreaterThan(Integer value) {
            addCriterion("cjnum >", value, "cjnum");
            return (Criteria) this;
        }

        public Criteria andCjnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cjnum >=", value, "cjnum");
            return (Criteria) this;
        }

        public Criteria andCjnumLessThan(Integer value) {
            addCriterion("cjnum <", value, "cjnum");
            return (Criteria) this;
        }

        public Criteria andCjnumLessThanOrEqualTo(Integer value) {
            addCriterion("cjnum <=", value, "cjnum");
            return (Criteria) this;
        }

        public Criteria andCjnumIn(List<Integer> values) {
            addCriterion("cjnum in", values, "cjnum");
            return (Criteria) this;
        }

        public Criteria andCjnumNotIn(List<Integer> values) {
            addCriterion("cjnum not in", values, "cjnum");
            return (Criteria) this;
        }

        public Criteria andCjnumBetween(Integer value1, Integer value2) {
            addCriterion("cjnum between", value1, value2, "cjnum");
            return (Criteria) this;
        }

        public Criteria andCjnumNotBetween(Integer value1, Integer value2) {
            addCriterion("cjnum not between", value1, value2, "cjnum");
            return (Criteria) this;
        }

        public Criteria andCjpriceIsNull() {
            addCriterion("cjprice is null");
            return (Criteria) this;
        }

        public Criteria andCjpriceIsNotNull() {
            addCriterion("cjprice is not null");
            return (Criteria) this;
        }

        public Criteria andCjpriceEqualTo(Float value) {
            addCriterion("cjprice =", value, "cjprice");
            return (Criteria) this;
        }

        public Criteria andCjpriceNotEqualTo(Float value) {
            addCriterion("cjprice <>", value, "cjprice");
            return (Criteria) this;
        }

        public Criteria andCjpriceGreaterThan(Float value) {
            addCriterion("cjprice >", value, "cjprice");
            return (Criteria) this;
        }

        public Criteria andCjpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cjprice >=", value, "cjprice");
            return (Criteria) this;
        }

        public Criteria andCjpriceLessThan(Float value) {
            addCriterion("cjprice <", value, "cjprice");
            return (Criteria) this;
        }

        public Criteria andCjpriceLessThanOrEqualTo(Float value) {
            addCriterion("cjprice <=", value, "cjprice");
            return (Criteria) this;
        }

        public Criteria andCjpriceIn(List<Float> values) {
            addCriterion("cjprice in", values, "cjprice");
            return (Criteria) this;
        }

        public Criteria andCjpriceNotIn(List<Float> values) {
            addCriterion("cjprice not in", values, "cjprice");
            return (Criteria) this;
        }

        public Criteria andCjpriceBetween(Float value1, Float value2) {
            addCriterion("cjprice between", value1, value2, "cjprice");
            return (Criteria) this;
        }

        public Criteria andCjpriceNotBetween(Float value1, Float value2) {
            addCriterion("cjprice not between", value1, value2, "cjprice");
            return (Criteria) this;
        }

        public Criteria andCjfangshiIsNull() {
            addCriterion("cjfangshi is null");
            return (Criteria) this;
        }

        public Criteria andCjfangshiIsNotNull() {
            addCriterion("cjfangshi is not null");
            return (Criteria) this;
        }

        public Criteria andCjfangshiEqualTo(String value) {
            addCriterion("cjfangshi =", value, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiNotEqualTo(String value) {
            addCriterion("cjfangshi <>", value, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiGreaterThan(String value) {
            addCriterion("cjfangshi >", value, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiGreaterThanOrEqualTo(String value) {
            addCriterion("cjfangshi >=", value, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiLessThan(String value) {
            addCriterion("cjfangshi <", value, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiLessThanOrEqualTo(String value) {
            addCriterion("cjfangshi <=", value, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiLike(String value) {
            addCriterion("cjfangshi like", value, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiNotLike(String value) {
            addCriterion("cjfangshi not like", value, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiIn(List<String> values) {
            addCriterion("cjfangshi in", values, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiNotIn(List<String> values) {
            addCriterion("cjfangshi not in", values, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiBetween(String value1, String value2) {
            addCriterion("cjfangshi between", value1, value2, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjfangshiNotBetween(String value1, String value2) {
            addCriterion("cjfangshi not between", value1, value2, "cjfangshi");
            return (Criteria) this;
        }

        public Criteria andCjdateIsNull() {
            addCriterion("cjdate is null");
            return (Criteria) this;
        }

        public Criteria andCjdateIsNotNull() {
            addCriterion("cjdate is not null");
            return (Criteria) this;
        }

        public Criteria andCjdateEqualTo(Date value) {
            addCriterionForJDBCDate("cjdate =", value, "cjdate");
            return (Criteria) this;
        }

        public Criteria andCjdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cjdate <>", value, "cjdate");
            return (Criteria) this;
        }

        public Criteria andCjdateGreaterThan(Date value) {
            addCriterionForJDBCDate("cjdate >", value, "cjdate");
            return (Criteria) this;
        }

        public Criteria andCjdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cjdate >=", value, "cjdate");
            return (Criteria) this;
        }

        public Criteria andCjdateLessThan(Date value) {
            addCriterionForJDBCDate("cjdate <", value, "cjdate");
            return (Criteria) this;
        }

        public Criteria andCjdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cjdate <=", value, "cjdate");
            return (Criteria) this;
        }

        public Criteria andCjdateIn(List<Date> values) {
            addCriterionForJDBCDate("cjdate in", values, "cjdate");
            return (Criteria) this;
        }

        public Criteria andCjdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cjdate not in", values, "cjdate");
            return (Criteria) this;
        }

        public Criteria andCjdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cjdate between", value1, value2, "cjdate");
            return (Criteria) this;
        }

        public Criteria andCjdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cjdate not between", value1, value2, "cjdate");
            return (Criteria) this;
        }

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
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