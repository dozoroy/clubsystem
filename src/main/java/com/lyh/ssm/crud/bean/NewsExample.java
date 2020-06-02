package com.lyh.ssm.crud.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsExample() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("newsid is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("newsid is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Integer value) {
            addCriterion("newsid =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Integer value) {
            addCriterion("newsid <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Integer value) {
            addCriterion("newsid >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsid >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Integer value) {
            addCriterion("newsid <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Integer value) {
            addCriterion("newsid <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Integer> values) {
            addCriterion("newsid in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Integer> values) {
            addCriterion("newsid not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Integer value1, Integer value2) {
            addCriterion("newsid between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsid not between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andClubidIsNull() {
            addCriterion("clubid is null");
            return (Criteria) this;
        }

        public Criteria andClubidIsNotNull() {
            addCriterion("clubid is not null");
            return (Criteria) this;
        }

        public Criteria andClubidEqualTo(Integer value) {
            addCriterion("clubid =", value, "clubid");
            return (Criteria) this;
        }

        public Criteria andClubidNotEqualTo(Integer value) {
            addCriterion("clubid <>", value, "clubid");
            return (Criteria) this;
        }

        public Criteria andClubidGreaterThan(Integer value) {
            addCriterion("clubid >", value, "clubid");
            return (Criteria) this;
        }

        public Criteria andClubidGreaterThanOrEqualTo(Integer value) {
            addCriterion("clubid >=", value, "clubid");
            return (Criteria) this;
        }

        public Criteria andClubidLessThan(Integer value) {
            addCriterion("clubid <", value, "clubid");
            return (Criteria) this;
        }

        public Criteria andClubidLessThanOrEqualTo(Integer value) {
            addCriterion("clubid <=", value, "clubid");
            return (Criteria) this;
        }

        public Criteria andClubidIn(List<Integer> values) {
            addCriterion("clubid in", values, "clubid");
            return (Criteria) this;
        }

        public Criteria andClubidNotIn(List<Integer> values) {
            addCriterion("clubid not in", values, "clubid");
            return (Criteria) this;
        }

        public Criteria andClubidBetween(Integer value1, Integer value2) {
            addCriterion("clubid between", value1, value2, "clubid");
            return (Criteria) this;
        }

        public Criteria andClubidNotBetween(Integer value1, Integer value2) {
            addCriterion("clubid not between", value1, value2, "clubid");
            return (Criteria) this;
        }

        public Criteria andNewsnameIsNull() {
            addCriterion("newsname is null");
            return (Criteria) this;
        }

        public Criteria andNewsnameIsNotNull() {
            addCriterion("newsname is not null");
            return (Criteria) this;
        }

        public Criteria andNewsnameEqualTo(String value) {
            addCriterion("newsname =", value, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameNotEqualTo(String value) {
            addCriterion("newsname <>", value, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameGreaterThan(String value) {
            addCriterion("newsname >", value, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameGreaterThanOrEqualTo(String value) {
            addCriterion("newsname >=", value, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameLessThan(String value) {
            addCriterion("newsname <", value, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameLessThanOrEqualTo(String value) {
            addCriterion("newsname <=", value, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameLike(String value) {
            addCriterion("newsname like", value, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameNotLike(String value) {
            addCriterion("newsname not like", value, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameIn(List<String> values) {
            addCriterion("newsname in", values, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameNotIn(List<String> values) {
            addCriterion("newsname not in", values, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameBetween(String value1, String value2) {
            addCriterion("newsname between", value1, value2, "newsname");
            return (Criteria) this;
        }

        public Criteria andNewsnameNotBetween(String value1, String value2) {
            addCriterion("newsname not between", value1, value2, "newsname");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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