package com.csii.ants.management.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportWorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportWorkExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobNumIsNull() {
            addCriterion("job_num is null");
            return (Criteria) this;
        }

        public Criteria andJobNumIsNotNull() {
            addCriterion("job_num is not null");
            return (Criteria) this;
        }

        public Criteria andJobNumEqualTo(String value) {
            addCriterion("job_num =", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotEqualTo(String value) {
            addCriterion("job_num <>", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumGreaterThan(String value) {
            addCriterion("job_num >", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumGreaterThanOrEqualTo(String value) {
            addCriterion("job_num >=", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLessThan(String value) {
            addCriterion("job_num <", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLessThanOrEqualTo(String value) {
            addCriterion("job_num <=", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumLike(String value) {
            addCriterion("job_num like", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotLike(String value) {
            addCriterion("job_num not like", value, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumIn(List<String> values) {
            addCriterion("job_num in", values, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotIn(List<String> values) {
            addCriterion("job_num not in", values, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumBetween(String value1, String value2) {
            addCriterion("job_num between", value1, value2, "jobNum");
            return (Criteria) this;
        }

        public Criteria andJobNumNotBetween(String value1, String value2) {
            addCriterion("job_num not between", value1, value2, "jobNum");
            return (Criteria) this;
        }

        public Criteria andClockDateIsNull() {
            addCriterion("clock_date is null");
            return (Criteria) this;
        }

        public Criteria andClockDateIsNotNull() {
            addCriterion("clock_date is not null");
            return (Criteria) this;
        }

        public Criteria andClockDateEqualTo(Date value) {
            addCriterion("clock_date =", value, "clockDate");
            return (Criteria) this;
        }

        public Criteria andClockDateNotEqualTo(Date value) {
            addCriterion("clock_date <>", value, "clockDate");
            return (Criteria) this;
        }

        public Criteria andClockDateGreaterThan(Date value) {
            addCriterion("clock_date >", value, "clockDate");
            return (Criteria) this;
        }

        public Criteria andClockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("clock_date >=", value, "clockDate");
            return (Criteria) this;
        }

        public Criteria andClockDateLessThan(Date value) {
            addCriterion("clock_date <", value, "clockDate");
            return (Criteria) this;
        }

        public Criteria andClockDateLessThanOrEqualTo(Date value) {
            addCriterion("clock_date <=", value, "clockDate");
            return (Criteria) this;
        }

        public Criteria andClockDateIn(List<Date> values) {
            addCriterion("clock_date in", values, "clockDate");
            return (Criteria) this;
        }

        public Criteria andClockDateNotIn(List<Date> values) {
            addCriterion("clock_date not in", values, "clockDate");
            return (Criteria) this;
        }

        public Criteria andClockDateBetween(Date value1, Date value2) {
            addCriterion("clock_date between", value1, value2, "clockDate");
            return (Criteria) this;
        }

        public Criteria andClockDateNotBetween(Date value1, Date value2) {
            addCriterion("clock_date not between", value1, value2, "clockDate");
            return (Criteria) this;
        }

        public Criteria andClockStateIsNull() {
            addCriterion("clock_state is null");
            return (Criteria) this;
        }

        public Criteria andClockStateIsNotNull() {
            addCriterion("clock_state is not null");
            return (Criteria) this;
        }

        public Criteria andClockStateEqualTo(String value) {
            addCriterion("clock_state =", value, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateNotEqualTo(String value) {
            addCriterion("clock_state <>", value, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateGreaterThan(String value) {
            addCriterion("clock_state >", value, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateGreaterThanOrEqualTo(String value) {
            addCriterion("clock_state >=", value, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateLessThan(String value) {
            addCriterion("clock_state <", value, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateLessThanOrEqualTo(String value) {
            addCriterion("clock_state <=", value, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateLike(String value) {
            addCriterion("clock_state like", value, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateNotLike(String value) {
            addCriterion("clock_state not like", value, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateIn(List<String> values) {
            addCriterion("clock_state in", values, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateNotIn(List<String> values) {
            addCriterion("clock_state not in", values, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateBetween(String value1, String value2) {
            addCriterion("clock_state between", value1, value2, "clockState");
            return (Criteria) this;
        }

        public Criteria andClockStateNotBetween(String value1, String value2) {
            addCriterion("clock_state not between", value1, value2, "clockState");
            return (Criteria) this;
        }

        public Criteria andPronameIsNull() {
            addCriterion("proname is null");
            return (Criteria) this;
        }

        public Criteria andPronameIsNotNull() {
            addCriterion("proname is not null");
            return (Criteria) this;
        }

        public Criteria andPronameEqualTo(String value) {
            addCriterion("proname =", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotEqualTo(String value) {
            addCriterion("proname <>", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThan(String value) {
            addCriterion("proname >", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameGreaterThanOrEqualTo(String value) {
            addCriterion("proname >=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThan(String value) {
            addCriterion("proname <", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLessThanOrEqualTo(String value) {
            addCriterion("proname <=", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameLike(String value) {
            addCriterion("proname like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotLike(String value) {
            addCriterion("proname not like", value, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameIn(List<String> values) {
            addCriterion("proname in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotIn(List<String> values) {
            addCriterion("proname not in", values, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameBetween(String value1, String value2) {
            addCriterion("proname between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andPronameNotBetween(String value1, String value2) {
            addCriterion("proname not between", value1, value2, "proname");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursIsNull() {
            addCriterion("working_hours is null");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursIsNotNull() {
            addCriterion("working_hours is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursEqualTo(String value) {
            addCriterion("working_hours =", value, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursNotEqualTo(String value) {
            addCriterion("working_hours <>", value, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursGreaterThan(String value) {
            addCriterion("working_hours >", value, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursGreaterThanOrEqualTo(String value) {
            addCriterion("working_hours >=", value, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursLessThan(String value) {
            addCriterion("working_hours <", value, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursLessThanOrEqualTo(String value) {
            addCriterion("working_hours <=", value, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursLike(String value) {
            addCriterion("working_hours like", value, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursNotLike(String value) {
            addCriterion("working_hours not like", value, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursIn(List<String> values) {
            addCriterion("working_hours in", values, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursNotIn(List<String> values) {
            addCriterion("working_hours not in", values, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursBetween(String value1, String value2) {
            addCriterion("working_hours between", value1, value2, "workingHours");
            return (Criteria) this;
        }

        public Criteria andWorkingHoursNotBetween(String value1, String value2) {
            addCriterion("working_hours not between", value1, value2, "workingHours");
            return (Criteria) this;
        }

        public Criteria andDelayedIsNull() {
            addCriterion("`delayed` is null");
            return (Criteria) this;
        }

        public Criteria andDelayedIsNotNull() {
            addCriterion("`delayed` is not null");
            return (Criteria) this;
        }

        public Criteria andDelayedEqualTo(String value) {
            addCriterion("`delayed` =", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedNotEqualTo(String value) {
            addCriterion("`delayed` <>", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedGreaterThan(String value) {
            addCriterion("`delayed` >", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedGreaterThanOrEqualTo(String value) {
            addCriterion("`delayed` >=", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedLessThan(String value) {
            addCriterion("`delayed` <", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedLessThanOrEqualTo(String value) {
            addCriterion("`delayed` <=", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedLike(String value) {
            addCriterion("`delayed` like", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedNotLike(String value) {
            addCriterion("`delayed` not like", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedIn(List<String> values) {
            addCriterion("`delayed` in", values, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedNotIn(List<String> values) {
            addCriterion("`delayed` not in", values, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedBetween(String value1, String value2) {
            addCriterion("`delayed` between", value1, value2, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedNotBetween(String value1, String value2) {
            addCriterion("`delayed` not between", value1, value2, "delayed");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNull() {
            addCriterion("details is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIsNotNull() {
            addCriterion("details is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsEqualTo(String value) {
            addCriterion("details =", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotEqualTo(String value) {
            addCriterion("details <>", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThan(String value) {
            addCriterion("details >", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("details >=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThan(String value) {
            addCriterion("details <", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLessThanOrEqualTo(String value) {
            addCriterion("details <=", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsLike(String value) {
            addCriterion("details like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotLike(String value) {
            addCriterion("details not like", value, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsIn(List<String> values) {
            addCriterion("details in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotIn(List<String> values) {
            addCriterion("details not in", values, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsBetween(String value1, String value2) {
            addCriterion("details between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andDetailsNotBetween(String value1, String value2) {
            addCriterion("details not between", value1, value2, "details");
            return (Criteria) this;
        }

        public Criteria andBenginTimeIsNull() {
            addCriterion("bengin_time is null");
            return (Criteria) this;
        }

        public Criteria andBenginTimeIsNotNull() {
            addCriterion("bengin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBenginTimeEqualTo(Date value) {
            addCriterion("bengin_time =", value, "benginTime");
            return (Criteria) this;
        }

        public Criteria andBenginTimeNotEqualTo(Date value) {
            addCriterion("bengin_time <>", value, "benginTime");
            return (Criteria) this;
        }

        public Criteria andBenginTimeGreaterThan(Date value) {
            addCriterion("bengin_time >", value, "benginTime");
            return (Criteria) this;
        }

        public Criteria andBenginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bengin_time >=", value, "benginTime");
            return (Criteria) this;
        }

        public Criteria andBenginTimeLessThan(Date value) {
            addCriterion("bengin_time <", value, "benginTime");
            return (Criteria) this;
        }

        public Criteria andBenginTimeLessThanOrEqualTo(Date value) {
            addCriterion("bengin_time <=", value, "benginTime");
            return (Criteria) this;
        }

        public Criteria andBenginTimeIn(List<Date> values) {
            addCriterion("bengin_time in", values, "benginTime");
            return (Criteria) this;
        }

        public Criteria andBenginTimeNotIn(List<Date> values) {
            addCriterion("bengin_time not in", values, "benginTime");
            return (Criteria) this;
        }

        public Criteria andBenginTimeBetween(Date value1, Date value2) {
            addCriterion("bengin_time between", value1, value2, "benginTime");
            return (Criteria) this;
        }

        public Criteria andBenginTimeNotBetween(Date value1, Date value2) {
            addCriterion("bengin_time not between", value1, value2, "benginTime");
            return (Criteria) this;
        }

        public Criteria andEndingTimeIsNull() {
            addCriterion("ending_time is null");
            return (Criteria) this;
        }

        public Criteria andEndingTimeIsNotNull() {
            addCriterion("ending_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndingTimeEqualTo(Date value) {
            addCriterion("ending_time =", value, "endingTime");
            return (Criteria) this;
        }

        public Criteria andEndingTimeNotEqualTo(Date value) {
            addCriterion("ending_time <>", value, "endingTime");
            return (Criteria) this;
        }

        public Criteria andEndingTimeGreaterThan(Date value) {
            addCriterion("ending_time >", value, "endingTime");
            return (Criteria) this;
        }

        public Criteria andEndingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ending_time >=", value, "endingTime");
            return (Criteria) this;
        }

        public Criteria andEndingTimeLessThan(Date value) {
            addCriterion("ending_time <", value, "endingTime");
            return (Criteria) this;
        }

        public Criteria andEndingTimeLessThanOrEqualTo(Date value) {
            addCriterion("ending_time <=", value, "endingTime");
            return (Criteria) this;
        }

        public Criteria andEndingTimeIn(List<Date> values) {
            addCriterion("ending_time in", values, "endingTime");
            return (Criteria) this;
        }

        public Criteria andEndingTimeNotIn(List<Date> values) {
            addCriterion("ending_time not in", values, "endingTime");
            return (Criteria) this;
        }

        public Criteria andEndingTimeBetween(Date value1, Date value2) {
            addCriterion("ending_time between", value1, value2, "endingTime");
            return (Criteria) this;
        }

        public Criteria andEndingTimeNotBetween(Date value1, Date value2) {
            addCriterion("ending_time not between", value1, value2, "endingTime");
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