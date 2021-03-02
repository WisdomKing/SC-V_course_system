package com.csii.ants.management.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClockinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClockinExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("ProjectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("ProjectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("ProjectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("ProjectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("ProjectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("ProjectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("ProjectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("ProjectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("ProjectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("ProjectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("ProjectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("ProjectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("ProjectName not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andManhourTypeIsNull() {
            addCriterion("Manhour_Type is null");
            return (Criteria) this;
        }

        public Criteria andManhourTypeIsNotNull() {
            addCriterion("Manhour_Type is not null");
            return (Criteria) this;
        }

        public Criteria andManhourTypeEqualTo(String value) {
            addCriterion("Manhour_Type =", value, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeNotEqualTo(String value) {
            addCriterion("Manhour_Type <>", value, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeGreaterThan(String value) {
            addCriterion("Manhour_Type >", value, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Manhour_Type >=", value, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeLessThan(String value) {
            addCriterion("Manhour_Type <", value, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeLessThanOrEqualTo(String value) {
            addCriterion("Manhour_Type <=", value, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeLike(String value) {
            addCriterion("Manhour_Type like", value, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeNotLike(String value) {
            addCriterion("Manhour_Type not like", value, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeIn(List<String> values) {
            addCriterion("Manhour_Type in", values, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeNotIn(List<String> values) {
            addCriterion("Manhour_Type not in", values, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeBetween(String value1, String value2) {
            addCriterion("Manhour_Type between", value1, value2, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourTypeNotBetween(String value1, String value2) {
            addCriterion("Manhour_Type not between", value1, value2, "manhourType");
            return (Criteria) this;
        }

        public Criteria andManhourIsNull() {
            addCriterion("Manhour is null");
            return (Criteria) this;
        }

        public Criteria andManhourIsNotNull() {
            addCriterion("Manhour is not null");
            return (Criteria) this;
        }

        public Criteria andManhourEqualTo(String value) {
            addCriterion("Manhour =", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourNotEqualTo(String value) {
            addCriterion("Manhour <>", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourGreaterThan(String value) {
            addCriterion("Manhour >", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourGreaterThanOrEqualTo(String value) {
            addCriterion("Manhour >=", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourLessThan(String value) {
            addCriterion("Manhour <", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourLessThanOrEqualTo(String value) {
            addCriterion("Manhour <=", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourLike(String value) {
            addCriterion("Manhour like", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourNotLike(String value) {
            addCriterion("Manhour not like", value, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourIn(List<String> values) {
            addCriterion("Manhour in", values, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourNotIn(List<String> values) {
            addCriterion("Manhour not in", values, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourBetween(String value1, String value2) {
            addCriterion("Manhour between", value1, value2, "manhour");
            return (Criteria) this;
        }

        public Criteria andManhourNotBetween(String value1, String value2) {
            addCriterion("Manhour not between", value1, value2, "manhour");
            return (Criteria) this;
        }

        public Criteria andDelayedIsNull() {
            addCriterion("`Delayed` is null");
            return (Criteria) this;
        }

        public Criteria andDelayedIsNotNull() {
            addCriterion("`Delayed` is not null");
            return (Criteria) this;
        }

        public Criteria andDelayedEqualTo(String value) {
            addCriterion("`Delayed` =", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedNotEqualTo(String value) {
            addCriterion("`Delayed` <>", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedGreaterThan(String value) {
            addCriterion("`Delayed` >", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedGreaterThanOrEqualTo(String value) {
            addCriterion("`Delayed` >=", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedLessThan(String value) {
            addCriterion("`Delayed` <", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedLessThanOrEqualTo(String value) {
            addCriterion("`Delayed` <=", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedLike(String value) {
            addCriterion("`Delayed` like", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedNotLike(String value) {
            addCriterion("`Delayed` not like", value, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedIn(List<String> values) {
            addCriterion("`Delayed` in", values, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedNotIn(List<String> values) {
            addCriterion("`Delayed` not in", values, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedBetween(String value1, String value2) {
            addCriterion("`Delayed` between", value1, value2, "delayed");
            return (Criteria) this;
        }

        public Criteria andDelayedNotBetween(String value1, String value2) {
            addCriterion("`Delayed` not between", value1, value2, "delayed");
            return (Criteria) this;
        }

        public Criteria andWorklogIsNull() {
            addCriterion("WorkLog is null");
            return (Criteria) this;
        }

        public Criteria andWorklogIsNotNull() {
            addCriterion("WorkLog is not null");
            return (Criteria) this;
        }

        public Criteria andWorklogEqualTo(String value) {
            addCriterion("WorkLog =", value, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogNotEqualTo(String value) {
            addCriterion("WorkLog <>", value, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogGreaterThan(String value) {
            addCriterion("WorkLog >", value, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogGreaterThanOrEqualTo(String value) {
            addCriterion("WorkLog >=", value, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogLessThan(String value) {
            addCriterion("WorkLog <", value, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogLessThanOrEqualTo(String value) {
            addCriterion("WorkLog <=", value, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogLike(String value) {
            addCriterion("WorkLog like", value, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogNotLike(String value) {
            addCriterion("WorkLog not like", value, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogIn(List<String> values) {
            addCriterion("WorkLog in", values, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogNotIn(List<String> values) {
            addCriterion("WorkLog not in", values, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogBetween(String value1, String value2) {
            addCriterion("WorkLog between", value1, value2, "worklog");
            return (Criteria) this;
        }

        public Criteria andWorklogNotBetween(String value1, String value2) {
            addCriterion("WorkLog not between", value1, value2, "worklog");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`Status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`Status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`Status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`Status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`Status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`Status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`Status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`Status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`Status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`Status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`Status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`Status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`Status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`Status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andClockinTimeIsNull() {
            addCriterion("ClockIn_time is null");
            return (Criteria) this;
        }

        public Criteria andClockinTimeIsNotNull() {
            addCriterion("ClockIn_time is not null");
            return (Criteria) this;
        }

        public Criteria andClockinTimeEqualTo(Date value) {
            addCriterion("ClockIn_time =", value, "clockinTime");
            return (Criteria) this;
        }

        public Criteria andClockinTimeNotEqualTo(Date value) {
            addCriterion("ClockIn_time <>", value, "clockinTime");
            return (Criteria) this;
        }

        public Criteria andClockinTimeGreaterThan(Date value) {
            addCriterion("ClockIn_time >", value, "clockinTime");
            return (Criteria) this;
        }

        public Criteria andClockinTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ClockIn_time >=", value, "clockinTime");
            return (Criteria) this;
        }

        public Criteria andClockinTimeLessThan(Date value) {
            addCriterion("ClockIn_time <", value, "clockinTime");
            return (Criteria) this;
        }

        public Criteria andClockinTimeLessThanOrEqualTo(Date value) {
            addCriterion("ClockIn_time <=", value, "clockinTime");
            return (Criteria) this;
        }

        public Criteria andClockinTimeIn(List<Date> values) {
            addCriterion("ClockIn_time in", values, "clockinTime");
            return (Criteria) this;
        }

        public Criteria andClockinTimeNotIn(List<Date> values) {
            addCriterion("ClockIn_time not in", values, "clockinTime");
            return (Criteria) this;
        }

        public Criteria andClockinTimeBetween(Date value1, Date value2) {
            addCriterion("ClockIn_time between", value1, value2, "clockinTime");
            return (Criteria) this;
        }

        public Criteria andClockinTimeNotBetween(Date value1, Date value2) {
            addCriterion("ClockIn_time not between", value1, value2, "clockinTime");
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