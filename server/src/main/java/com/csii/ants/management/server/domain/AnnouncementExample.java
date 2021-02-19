package com.csii.ants.management.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnnouncementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnnouncementExample() {
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

        public Criteria andAnnouncementtitleIsNull() {
            addCriterion("AnnouncementTitle is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleIsNotNull() {
            addCriterion("AnnouncementTitle is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleEqualTo(String value) {
            addCriterion("AnnouncementTitle =", value, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleNotEqualTo(String value) {
            addCriterion("AnnouncementTitle <>", value, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleGreaterThan(String value) {
            addCriterion("AnnouncementTitle >", value, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleGreaterThanOrEqualTo(String value) {
            addCriterion("AnnouncementTitle >=", value, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleLessThan(String value) {
            addCriterion("AnnouncementTitle <", value, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleLessThanOrEqualTo(String value) {
            addCriterion("AnnouncementTitle <=", value, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleLike(String value) {
            addCriterion("AnnouncementTitle like", value, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleNotLike(String value) {
            addCriterion("AnnouncementTitle not like", value, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleIn(List<String> values) {
            addCriterion("AnnouncementTitle in", values, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleNotIn(List<String> values) {
            addCriterion("AnnouncementTitle not in", values, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleBetween(String value1, String value2) {
            addCriterion("AnnouncementTitle between", value1, value2, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtitleNotBetween(String value1, String value2) {
            addCriterion("AnnouncementTitle not between", value1, value2, "announcementtitle");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeIsNull() {
            addCriterion("AnnouncementType is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeIsNotNull() {
            addCriterion("AnnouncementType is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeEqualTo(String value) {
            addCriterion("AnnouncementType =", value, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeNotEqualTo(String value) {
            addCriterion("AnnouncementType <>", value, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeGreaterThan(String value) {
            addCriterion("AnnouncementType >", value, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeGreaterThanOrEqualTo(String value) {
            addCriterion("AnnouncementType >=", value, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeLessThan(String value) {
            addCriterion("AnnouncementType <", value, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeLessThanOrEqualTo(String value) {
            addCriterion("AnnouncementType <=", value, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeLike(String value) {
            addCriterion("AnnouncementType like", value, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeNotLike(String value) {
            addCriterion("AnnouncementType not like", value, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeIn(List<String> values) {
            addCriterion("AnnouncementType in", values, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeNotIn(List<String> values) {
            addCriterion("AnnouncementType not in", values, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeBetween(String value1, String value2) {
            addCriterion("AnnouncementType between", value1, value2, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andAnnouncementtypeNotBetween(String value1, String value2) {
            addCriterion("AnnouncementType not between", value1, value2, "announcementtype");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("BeginTime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("BeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("BeginTime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("BeginTime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("BeginTime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BeginTime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("BeginTime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("BeginTime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("BeginTime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("BeginTime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("BeginTime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("BeginTime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeIsNull() {
            addCriterion("EndingTime is null");
            return (Criteria) this;
        }

        public Criteria andEndingtimeIsNotNull() {
            addCriterion("EndingTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndingtimeEqualTo(Date value) {
            addCriterion("EndingTime =", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeNotEqualTo(Date value) {
            addCriterion("EndingTime <>", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeGreaterThan(Date value) {
            addCriterion("EndingTime >", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndingTime >=", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeLessThan(Date value) {
            addCriterion("EndingTime <", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeLessThanOrEqualTo(Date value) {
            addCriterion("EndingTime <=", value, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeIn(List<Date> values) {
            addCriterion("EndingTime in", values, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeNotIn(List<Date> values) {
            addCriterion("EndingTime not in", values, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeBetween(Date value1, Date value2) {
            addCriterion("EndingTime between", value1, value2, "endingtime");
            return (Criteria) this;
        }

        public Criteria andEndingtimeNotBetween(Date value1, Date value2) {
            addCriterion("EndingTime not between", value1, value2, "endingtime");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNull() {
            addCriterion("Details is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNotNull() {
            addCriterion("Details is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsEqualTo(String value) {
            addCriterion("Details =", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("Details <>", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("Details >", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("Details >=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThan(String value) {
            addCriterion("Details <", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("Details <=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLike(String value) {
            addCriterion("Details like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotLike(String value) {
            addCriterion("Details not like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsIn(List<String> values) {
            addCriterion("Details in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("Details not in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("Details between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("Details not between", value1, value2, "details");
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