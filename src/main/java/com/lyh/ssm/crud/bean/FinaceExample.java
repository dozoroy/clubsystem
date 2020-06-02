package com.lyh.ssm.crud.bean;

import java.util.ArrayList;
import java.util.List;

public class FinaceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinaceExample() {
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

        public Criteria andFinaidIsNull() {
            addCriterion("finaid is null");
            return (Criteria) this;
        }

        public Criteria andFinaidIsNotNull() {
            addCriterion("finaid is not null");
            return (Criteria) this;
        }

        public Criteria andFinaidEqualTo(Integer value) {
            addCriterion("finaid =", value, "finaid");
            return (Criteria) this;
        }

        public Criteria andFinaidNotEqualTo(Integer value) {
            addCriterion("finaid <>", value, "finaid");
            return (Criteria) this;
        }

        public Criteria andFinaidGreaterThan(Integer value) {
            addCriterion("finaid >", value, "finaid");
            return (Criteria) this;
        }

        public Criteria andFinaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("finaid >=", value, "finaid");
            return (Criteria) this;
        }

        public Criteria andFinaidLessThan(Integer value) {
            addCriterion("finaid <", value, "finaid");
            return (Criteria) this;
        }

        public Criteria andFinaidLessThanOrEqualTo(Integer value) {
            addCriterion("finaid <=", value, "finaid");
            return (Criteria) this;
        }

        public Criteria andFinaidIn(List<Integer> values) {
            addCriterion("finaid in", values, "finaid");
            return (Criteria) this;
        }

        public Criteria andFinaidNotIn(List<Integer> values) {
            addCriterion("finaid not in", values, "finaid");
            return (Criteria) this;
        }

        public Criteria andFinaidBetween(Integer value1, Integer value2) {
            addCriterion("finaid between", value1, value2, "finaid");
            return (Criteria) this;
        }

        public Criteria andFinaidNotBetween(Integer value1, Integer value2) {
            addCriterion("finaid not between", value1, value2, "finaid");
            return (Criteria) this;
        }

        public Criteria andFinanameIsNull() {
            addCriterion("finaname is null");
            return (Criteria) this;
        }

        public Criteria andFinanameIsNotNull() {
            addCriterion("finaname is not null");
            return (Criteria) this;
        }

        public Criteria andFinanameEqualTo(String value) {
            addCriterion("finaname =", value, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameNotEqualTo(String value) {
            addCriterion("finaname <>", value, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameGreaterThan(String value) {
            addCriterion("finaname >", value, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameGreaterThanOrEqualTo(String value) {
            addCriterion("finaname >=", value, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameLessThan(String value) {
            addCriterion("finaname <", value, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameLessThanOrEqualTo(String value) {
            addCriterion("finaname <=", value, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameLike(String value) {
            addCriterion("finaname like", value, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameNotLike(String value) {
            addCriterion("finaname not like", value, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameIn(List<String> values) {
            addCriterion("finaname in", values, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameNotIn(List<String> values) {
            addCriterion("finaname not in", values, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameBetween(String value1, String value2) {
            addCriterion("finaname between", value1, value2, "finaname");
            return (Criteria) this;
        }

        public Criteria andFinanameNotBetween(String value1, String value2) {
            addCriterion("finaname not between", value1, value2, "finaname");
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Float value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Float value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Float value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Float value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Float value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Float> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Float> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Float value1, Float value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Float value1, Float value2) {
            addCriterion("money not between", value1, value2, "money");
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