package com.uestc.fff.information.domain;

import java.util.ArrayList;
import java.util.List;

public class MajorInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public MajorInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
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

        public Criteria andMidIsNull() {
            addCriterion("Mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("Mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(String value) {
            addCriterion("Mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(String value) {
            addCriterion("Mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(String value) {
            addCriterion("Mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(String value) {
            addCriterion("Mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(String value) {
            addCriterion("Mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(String value) {
            addCriterion("Mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLike(String value) {
            addCriterion("Mid like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotLike(String value) {
            addCriterion("Mid not like", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<String> values) {
            addCriterion("Mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<String> values) {
            addCriterion("Mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(String value1, String value2) {
            addCriterion("Mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(String value1, String value2) {
            addCriterion("Mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andScIdIsNull() {
            addCriterion("Sc_id is null");
            return (Criteria) this;
        }

        public Criteria andScIdIsNotNull() {
            addCriterion("Sc_id is not null");
            return (Criteria) this;
        }

        public Criteria andScIdEqualTo(String value) {
            addCriterion("Sc_id =", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotEqualTo(String value) {
            addCriterion("Sc_id <>", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThan(String value) {
            addCriterion("Sc_id >", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdGreaterThanOrEqualTo(String value) {
            addCriterion("Sc_id >=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThan(String value) {
            addCriterion("Sc_id <", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLessThanOrEqualTo(String value) {
            addCriterion("Sc_id <=", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdLike(String value) {
            addCriterion("Sc_id like", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotLike(String value) {
            addCriterion("Sc_id not like", value, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdIn(List<String> values) {
            addCriterion("Sc_id in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotIn(List<String> values) {
            addCriterion("Sc_id not in", values, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdBetween(String value1, String value2) {
            addCriterion("Sc_id between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andScIdNotBetween(String value1, String value2) {
            addCriterion("Sc_id not between", value1, value2, "scId");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("Mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("Mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("Mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("Mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("Mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("Mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("Mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("Mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("Mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("Mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("Mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("Mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("Mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("Mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMinfoIsNull() {
            addCriterion("Minfo is null");
            return (Criteria) this;
        }

        public Criteria andMinfoIsNotNull() {
            addCriterion("Minfo is not null");
            return (Criteria) this;
        }

        public Criteria andMinfoEqualTo(String value) {
            addCriterion("Minfo =", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoNotEqualTo(String value) {
            addCriterion("Minfo <>", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoGreaterThan(String value) {
            addCriterion("Minfo >", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoGreaterThanOrEqualTo(String value) {
            addCriterion("Minfo >=", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoLessThan(String value) {
            addCriterion("Minfo <", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoLessThanOrEqualTo(String value) {
            addCriterion("Minfo <=", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoLike(String value) {
            addCriterion("Minfo like", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoNotLike(String value) {
            addCriterion("Minfo not like", value, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoIn(List<String> values) {
            addCriterion("Minfo in", values, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoNotIn(List<String> values) {
            addCriterion("Minfo not in", values, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoBetween(String value1, String value2) {
            addCriterion("Minfo between", value1, value2, "minfo");
            return (Criteria) this;
        }

        public Criteria andMinfoNotBetween(String value1, String value2) {
            addCriterion("Minfo not between", value1, value2, "minfo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table major
     *
     * @mbg.generated do_not_delete_during_merge Thu Jun 11 21:56:49 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table major
     *
     * @mbg.generated Thu Jun 11 21:56:49 CST 2020
     */
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