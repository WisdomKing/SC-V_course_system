package com.csii.ants.management.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AskforleaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AskforleaveExample() {
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

        public Criteria andLeavetypeIsNull() {
            addCriterion("leaveType is null");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIsNotNull() {
            addCriterion("leaveType is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetypeEqualTo(String value) {
            addCriterion("leaveType =", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotEqualTo(String value) {
            addCriterion("leaveType <>", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeGreaterThan(String value) {
            addCriterion("leaveType >", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeGreaterThanOrEqualTo(String value) {
            addCriterion("leaveType >=", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeLessThan(String value) {
            addCriterion("leaveType <", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeLessThanOrEqualTo(String value) {
            addCriterion("leaveType <=", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeLike(String value) {
            addCriterion("leaveType like", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotLike(String value) {
            addCriterion("leaveType not like", value, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeIn(List<String> values) {
            addCriterion("leaveType in", values, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotIn(List<String> values) {
            addCriterion("leaveType not in", values, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeBetween(String value1, String value2) {
            addCriterion("leaveType between", value1, value2, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetypeNotBetween(String value1, String value2) {
            addCriterion("leaveType not between", value1, value2, "leavetype");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginIsNull() {
            addCriterion("leaveTimeBengin is null");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginIsNotNull() {
            addCriterion("leaveTimeBengin is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginEqualTo(Date value) {
            addCriterion("leaveTimeBengin =", value, "leavetimebengin");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginNotEqualTo(Date value) {
            addCriterion("leaveTimeBengin <>", value, "leavetimebengin");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginGreaterThan(Date value) {
            addCriterion("leaveTimeBengin >", value, "leavetimebengin");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginGreaterThanOrEqualTo(Date value) {
            addCriterion("leaveTimeBengin >=", value, "leavetimebengin");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginLessThan(Date value) {
            addCriterion("leaveTimeBengin <", value, "leavetimebengin");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginLessThanOrEqualTo(Date value) {
            addCriterion("leaveTimeBengin <=", value, "leavetimebengin");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginIn(List<Date> values) {
            addCriterion("leaveTimeBengin in", values, "leavetimebengin");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginNotIn(List<Date> values) {
            addCriterion("leaveTimeBengin not in", values, "leavetimebengin");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginBetween(Date value1, Date value2) {
            addCriterion("leaveTimeBengin between", value1, value2, "leavetimebengin");
            return (Criteria) this;
        }

        public Criteria andLeavetimebenginNotBetween(Date value1, Date value2) {
            addCriterion("leaveTimeBengin not between", value1, value2, "leavetimebengin");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingIsNull() {
            addCriterion("leaveTimeEnding is null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingIsNotNull() {
            addCriterion("leaveTimeEnding is not null");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingEqualTo(Date value) {
            addCriterion("leaveTimeEnding =", value, "leavetimeending");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingNotEqualTo(Date value) {
            addCriterion("leaveTimeEnding <>", value, "leavetimeending");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingGreaterThan(Date value) {
            addCriterion("leaveTimeEnding >", value, "leavetimeending");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingGreaterThanOrEqualTo(Date value) {
            addCriterion("leaveTimeEnding >=", value, "leavetimeending");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingLessThan(Date value) {
            addCriterion("leaveTimeEnding <", value, "leavetimeending");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingLessThanOrEqualTo(Date value) {
            addCriterion("leaveTimeEnding <=", value, "leavetimeending");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingIn(List<Date> values) {
            addCriterion("leaveTimeEnding in", values, "leavetimeending");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingNotIn(List<Date> values) {
            addCriterion("leaveTimeEnding not in", values, "leavetimeending");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingBetween(Date value1, Date value2) {
            addCriterion("leaveTimeEnding between", value1, value2, "leavetimeending");
            return (Criteria) this;
        }

        public Criteria andLeavetimeendingNotBetween(Date value1, Date value2) {
            addCriterion("leaveTimeEnding not between", value1, value2, "leavetimeending");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIsNull() {
            addCriterion("leaveStatus is null");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIsNotNull() {
            addCriterion("leaveStatus is not null");
            return (Criteria) this;
        }

        public Criteria andLeavestatusEqualTo(String value) {
            addCriterion("leaveStatus =", value, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusNotEqualTo(String value) {
            addCriterion("leaveStatus <>", value, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusGreaterThan(String value) {
            addCriterion("leaveStatus >", value, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusGreaterThanOrEqualTo(String value) {
            addCriterion("leaveStatus >=", value, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusLessThan(String value) {
            addCriterion("leaveStatus <", value, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusLessThanOrEqualTo(String value) {
            addCriterion("leaveStatus <=", value, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusLike(String value) {
            addCriterion("leaveStatus like", value, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusNotLike(String value) {
            addCriterion("leaveStatus not like", value, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusIn(List<String> values) {
            addCriterion("leaveStatus in", values, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusNotIn(List<String> values) {
            addCriterion("leaveStatus not in", values, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusBetween(String value1, String value2) {
            addCriterion("leaveStatus between", value1, value2, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andLeavestatusNotBetween(String value1, String value2) {
            addCriterion("leaveStatus not between", value1, value2, "leavestatus");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveIsNull() {
            addCriterion("cancellationLeave is null");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveIsNotNull() {
            addCriterion("cancellationLeave is not null");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveEqualTo(String value) {
            addCriterion("cancellationLeave =", value, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveNotEqualTo(String value) {
            addCriterion("cancellationLeave <>", value, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveGreaterThan(String value) {
            addCriterion("cancellationLeave >", value, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveGreaterThanOrEqualTo(String value) {
            addCriterion("cancellationLeave >=", value, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveLessThan(String value) {
            addCriterion("cancellationLeave <", value, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveLessThanOrEqualTo(String value) {
            addCriterion("cancellationLeave <=", value, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveLike(String value) {
            addCriterion("cancellationLeave like", value, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveNotLike(String value) {
            addCriterion("cancellationLeave not like", value, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveIn(List<String> values) {
            addCriterion("cancellationLeave in", values, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveNotIn(List<String> values) {
            addCriterion("cancellationLeave not in", values, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveBetween(String value1, String value2) {
            addCriterion("cancellationLeave between", value1, value2, "cancellationleave");
            return (Criteria) this;
        }

        public Criteria andCancellationleaveNotBetween(String value1, String value2) {
            addCriterion("cancellationLeave not between", value1, value2, "cancellationleave");
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