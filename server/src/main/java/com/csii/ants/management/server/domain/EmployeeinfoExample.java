package com.csii.ants.management.server.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeinfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
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

        public Criteria andBaseIsNull() {
            addCriterion("base is null");
            return (Criteria) this;
        }

        public Criteria andBaseIsNotNull() {
            addCriterion("base is not null");
            return (Criteria) this;
        }

        public Criteria andBaseEqualTo(String value) {
            addCriterion("base =", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotEqualTo(String value) {
            addCriterion("base <>", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseGreaterThan(String value) {
            addCriterion("base >", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseGreaterThanOrEqualTo(String value) {
            addCriterion("base >=", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseLessThan(String value) {
            addCriterion("base <", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseLessThanOrEqualTo(String value) {
            addCriterion("base <=", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseLike(String value) {
            addCriterion("base like", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotLike(String value) {
            addCriterion("base not like", value, "base");
            return (Criteria) this;
        }

        public Criteria andBaseIn(List<String> values) {
            addCriterion("base in", values, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotIn(List<String> values) {
            addCriterion("base not in", values, "base");
            return (Criteria) this;
        }

        public Criteria andBaseBetween(String value1, String value2) {
            addCriterion("base between", value1, value2, "base");
            return (Criteria) this;
        }

        public Criteria andBaseNotBetween(String value1, String value2) {
            addCriterion("base not between", value1, value2, "base");
            return (Criteria) this;
        }

        public Criteria andCompanyemailIsNull() {
            addCriterion("companyEmail is null");
            return (Criteria) this;
        }

        public Criteria andCompanyemailIsNotNull() {
            addCriterion("companyEmail is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyemailEqualTo(String value) {
            addCriterion("companyEmail =", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailNotEqualTo(String value) {
            addCriterion("companyEmail <>", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailGreaterThan(String value) {
            addCriterion("companyEmail >", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailGreaterThanOrEqualTo(String value) {
            addCriterion("companyEmail >=", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailLessThan(String value) {
            addCriterion("companyEmail <", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailLessThanOrEqualTo(String value) {
            addCriterion("companyEmail <=", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailLike(String value) {
            addCriterion("companyEmail like", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailNotLike(String value) {
            addCriterion("companyEmail not like", value, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailIn(List<String> values) {
            addCriterion("companyEmail in", values, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailNotIn(List<String> values) {
            addCriterion("companyEmail not in", values, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailBetween(String value1, String value2) {
            addCriterion("companyEmail between", value1, value2, "companyemail");
            return (Criteria) this;
        }

        public Criteria andCompanyemailNotBetween(String value1, String value2) {
            addCriterion("companyEmail not between", value1, value2, "companyemail");
            return (Criteria) this;
        }

        public Criteria andDependenceDepIsNull() {
            addCriterion("dependence_Dep is null");
            return (Criteria) this;
        }

        public Criteria andDependenceDepIsNotNull() {
            addCriterion("dependence_Dep is not null");
            return (Criteria) this;
        }

        public Criteria andDependenceDepEqualTo(String value) {
            addCriterion("dependence_Dep =", value, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepNotEqualTo(String value) {
            addCriterion("dependence_Dep <>", value, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepGreaterThan(String value) {
            addCriterion("dependence_Dep >", value, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepGreaterThanOrEqualTo(String value) {
            addCriterion("dependence_Dep >=", value, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepLessThan(String value) {
            addCriterion("dependence_Dep <", value, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepLessThanOrEqualTo(String value) {
            addCriterion("dependence_Dep <=", value, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepLike(String value) {
            addCriterion("dependence_Dep like", value, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepNotLike(String value) {
            addCriterion("dependence_Dep not like", value, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepIn(List<String> values) {
            addCriterion("dependence_Dep in", values, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepNotIn(List<String> values) {
            addCriterion("dependence_Dep not in", values, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepBetween(String value1, String value2) {
            addCriterion("dependence_Dep between", value1, value2, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andDependenceDepNotBetween(String value1, String value2) {
            addCriterion("dependence_Dep not between", value1, value2, "dependenceDep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepIsNull() {
            addCriterion("superiorDep is null");
            return (Criteria) this;
        }

        public Criteria andSuperiordepIsNotNull() {
            addCriterion("superiorDep is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiordepEqualTo(String value) {
            addCriterion("superiorDep =", value, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepNotEqualTo(String value) {
            addCriterion("superiorDep <>", value, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepGreaterThan(String value) {
            addCriterion("superiorDep >", value, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepGreaterThanOrEqualTo(String value) {
            addCriterion("superiorDep >=", value, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepLessThan(String value) {
            addCriterion("superiorDep <", value, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepLessThanOrEqualTo(String value) {
            addCriterion("superiorDep <=", value, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepLike(String value) {
            addCriterion("superiorDep like", value, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepNotLike(String value) {
            addCriterion("superiorDep not like", value, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepIn(List<String> values) {
            addCriterion("superiorDep in", values, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepNotIn(List<String> values) {
            addCriterion("superiorDep not in", values, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepBetween(String value1, String value2) {
            addCriterion("superiorDep between", value1, value2, "superiordep");
            return (Criteria) this;
        }

        public Criteria andSuperiordepNotBetween(String value1, String value2) {
            addCriterion("superiorDep not between", value1, value2, "superiordep");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("`position` is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("`position` is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("`position` =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("`position` <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("`position` >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("`position` >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("`position` <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("`position` <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("`position` like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("`position` not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("`position` in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("`position` not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("`position` between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("`position` not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andDepDirectorIsNull() {
            addCriterion("dep_Director is null");
            return (Criteria) this;
        }

        public Criteria andDepDirectorIsNotNull() {
            addCriterion("dep_Director is not null");
            return (Criteria) this;
        }

        public Criteria andDepDirectorEqualTo(String value) {
            addCriterion("dep_Director =", value, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorNotEqualTo(String value) {
            addCriterion("dep_Director <>", value, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorGreaterThan(String value) {
            addCriterion("dep_Director >", value, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("dep_Director >=", value, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorLessThan(String value) {
            addCriterion("dep_Director <", value, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorLessThanOrEqualTo(String value) {
            addCriterion("dep_Director <=", value, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorLike(String value) {
            addCriterion("dep_Director like", value, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorNotLike(String value) {
            addCriterion("dep_Director not like", value, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorIn(List<String> values) {
            addCriterion("dep_Director in", values, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorNotIn(List<String> values) {
            addCriterion("dep_Director not in", values, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorBetween(String value1, String value2) {
            addCriterion("dep_Director between", value1, value2, "depDirector");
            return (Criteria) this;
        }

        public Criteria andDepDirectorNotBetween(String value1, String value2) {
            addCriterion("dep_Director not between", value1, value2, "depDirector");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("entry_Time is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("entry_Time is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("entry_Time =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("entry_Time <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("entry_Time >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_Time >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("entry_Time <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("entry_Time <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("entry_Time in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("entry_Time not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("entry_Time between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("entry_Time not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIsNull() {
            addCriterion("entry_Type is null");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIsNotNull() {
            addCriterion("entry_Type is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTypeEqualTo(String value) {
            addCriterion("entry_Type =", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotEqualTo(String value) {
            addCriterion("entry_Type <>", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeGreaterThan(String value) {
            addCriterion("entry_Type >", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("entry_Type >=", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLessThan(String value) {
            addCriterion("entry_Type <", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLessThanOrEqualTo(String value) {
            addCriterion("entry_Type <=", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeLike(String value) {
            addCriterion("entry_Type like", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotLike(String value) {
            addCriterion("entry_Type not like", value, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeIn(List<String> values) {
            addCriterion("entry_Type in", values, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotIn(List<String> values) {
            addCriterion("entry_Type not in", values, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeBetween(String value1, String value2) {
            addCriterion("entry_Type between", value1, value2, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryTypeNotBetween(String value1, String value2) {
            addCriterion("entry_Type not between", value1, value2, "entryType");
            return (Criteria) this;
        }

        public Criteria andEntryAddressIsNull() {
            addCriterion("entry_Address is null");
            return (Criteria) this;
        }

        public Criteria andEntryAddressIsNotNull() {
            addCriterion("entry_Address is not null");
            return (Criteria) this;
        }

        public Criteria andEntryAddressEqualTo(String value) {
            addCriterion("entry_Address =", value, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressNotEqualTo(String value) {
            addCriterion("entry_Address <>", value, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressGreaterThan(String value) {
            addCriterion("entry_Address >", value, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("entry_Address >=", value, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressLessThan(String value) {
            addCriterion("entry_Address <", value, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressLessThanOrEqualTo(String value) {
            addCriterion("entry_Address <=", value, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressLike(String value) {
            addCriterion("entry_Address like", value, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressNotLike(String value) {
            addCriterion("entry_Address not like", value, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressIn(List<String> values) {
            addCriterion("entry_Address in", values, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressNotIn(List<String> values) {
            addCriterion("entry_Address not in", values, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressBetween(String value1, String value2) {
            addCriterion("entry_Address between", value1, value2, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andEntryAddressNotBetween(String value1, String value2) {
            addCriterion("entry_Address not between", value1, value2, "entryAddress");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginIsNull() {
            addCriterion("internshipBegin is null");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginIsNotNull() {
            addCriterion("internshipBegin is not null");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginEqualTo(Date value) {
            addCriterion("internshipBegin =", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginNotEqualTo(Date value) {
            addCriterion("internshipBegin <>", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginGreaterThan(Date value) {
            addCriterion("internshipBegin >", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginGreaterThanOrEqualTo(Date value) {
            addCriterion("internshipBegin >=", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginLessThan(Date value) {
            addCriterion("internshipBegin <", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginLessThanOrEqualTo(Date value) {
            addCriterion("internshipBegin <=", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginIn(List<Date> values) {
            addCriterion("internshipBegin in", values, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginNotIn(List<Date> values) {
            addCriterion("internshipBegin not in", values, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginBetween(Date value1, Date value2) {
            addCriterion("internshipBegin between", value1, value2, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginNotBetween(Date value1, Date value2) {
            addCriterion("internshipBegin not between", value1, value2, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipendingIsNull() {
            addCriterion("internshipEnding is null");
            return (Criteria) this;
        }

        public Criteria andInternshipendingIsNotNull() {
            addCriterion("internshipEnding is not null");
            return (Criteria) this;
        }

        public Criteria andInternshipendingEqualTo(Date value) {
            addCriterion("internshipEnding =", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingNotEqualTo(Date value) {
            addCriterion("internshipEnding <>", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingGreaterThan(Date value) {
            addCriterion("internshipEnding >", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingGreaterThanOrEqualTo(Date value) {
            addCriterion("internshipEnding >=", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingLessThan(Date value) {
            addCriterion("internshipEnding <", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingLessThanOrEqualTo(Date value) {
            addCriterion("internshipEnding <=", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingIn(List<Date> values) {
            addCriterion("internshipEnding in", values, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingNotIn(List<Date> values) {
            addCriterion("internshipEnding not in", values, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingBetween(Date value1, Date value2) {
            addCriterion("internshipEnding between", value1, value2, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingNotBetween(Date value1, Date value2) {
            addCriterion("internshipEnding not between", value1, value2, "internshipending");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeIsNull() {
            addCriterion("conversionReg_Time is null");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeIsNotNull() {
            addCriterion("conversionReg_Time is not null");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeEqualTo(Date value) {
            addCriterion("conversionReg_Time =", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeNotEqualTo(Date value) {
            addCriterion("conversionReg_Time <>", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeGreaterThan(Date value) {
            addCriterion("conversionReg_Time >", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("conversionReg_Time >=", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeLessThan(Date value) {
            addCriterion("conversionReg_Time <", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeLessThanOrEqualTo(Date value) {
            addCriterion("conversionReg_Time <=", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeIn(List<Date> values) {
            addCriterion("conversionReg_Time in", values, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeNotIn(List<Date> values) {
            addCriterion("conversionReg_Time not in", values, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeBetween(Date value1, Date value2) {
            addCriterion("conversionReg_Time between", value1, value2, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeNotBetween(Date value1, Date value2) {
            addCriterion("conversionReg_Time not between", value1, value2, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andContractsigningIsNull() {
            addCriterion("contractSigning is null");
            return (Criteria) this;
        }

        public Criteria andContractsigningIsNotNull() {
            addCriterion("contractSigning is not null");
            return (Criteria) this;
        }

        public Criteria andContractsigningEqualTo(Date value) {
            addCriterion("contractSigning =", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningNotEqualTo(Date value) {
            addCriterion("contractSigning <>", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningGreaterThan(Date value) {
            addCriterion("contractSigning >", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningGreaterThanOrEqualTo(Date value) {
            addCriterion("contractSigning >=", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningLessThan(Date value) {
            addCriterion("contractSigning <", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningLessThanOrEqualTo(Date value) {
            addCriterion("contractSigning <=", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningIn(List<Date> values) {
            addCriterion("contractSigning in", values, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningNotIn(List<Date> values) {
            addCriterion("contractSigning not in", values, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningBetween(Date value1, Date value2) {
            addCriterion("contractSigning between", value1, value2, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningNotBetween(Date value1, Date value2) {
            addCriterion("contractSigning not between", value1, value2, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractendingIsNull() {
            addCriterion("contractEnding is null");
            return (Criteria) this;
        }

        public Criteria andContractendingIsNotNull() {
            addCriterion("contractEnding is not null");
            return (Criteria) this;
        }

        public Criteria andContractendingEqualTo(Date value) {
            addCriterion("contractEnding =", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingNotEqualTo(Date value) {
            addCriterion("contractEnding <>", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingGreaterThan(Date value) {
            addCriterion("contractEnding >", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingGreaterThanOrEqualTo(Date value) {
            addCriterion("contractEnding >=", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingLessThan(Date value) {
            addCriterion("contractEnding <", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingLessThanOrEqualTo(Date value) {
            addCriterion("contractEnding <=", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingIn(List<Date> values) {
            addCriterion("contractEnding in", values, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingNotIn(List<Date> values) {
            addCriterion("contractEnding not in", values, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingBetween(Date value1, Date value2) {
            addCriterion("contractEnding between", value1, value2, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingNotBetween(Date value1, Date value2) {
            addCriterion("contractEnding not between", value1, value2, "contractending");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateIsNull() {
            addCriterion("probationExp_date is null");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateIsNotNull() {
            addCriterion("probationExp_date is not null");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateEqualTo(Date value) {
            addCriterion("probationExp_date =", value, "probationexpDate");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateNotEqualTo(Date value) {
            addCriterion("probationExp_date <>", value, "probationexpDate");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateGreaterThan(Date value) {
            addCriterion("probationExp_date >", value, "probationexpDate");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("probationExp_date >=", value, "probationexpDate");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateLessThan(Date value) {
            addCriterion("probationExp_date <", value, "probationexpDate");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateLessThanOrEqualTo(Date value) {
            addCriterion("probationExp_date <=", value, "probationexpDate");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateIn(List<Date> values) {
            addCriterion("probationExp_date in", values, "probationexpDate");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateNotIn(List<Date> values) {
            addCriterion("probationExp_date not in", values, "probationexpDate");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateBetween(Date value1, Date value2) {
            addCriterion("probationExp_date between", value1, value2, "probationexpDate");
            return (Criteria) this;
        }

        public Criteria andProbationexpDateNotBetween(Date value1, Date value2) {
            addCriterion("probationExp_date not between", value1, value2, "probationexpDate");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusIsNull() {
            addCriterion("employeeStatus is null");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusIsNotNull() {
            addCriterion("employeeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusEqualTo(String value) {
            addCriterion("employeeStatus =", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusNotEqualTo(String value) {
            addCriterion("employeeStatus <>", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusGreaterThan(String value) {
            addCriterion("employeeStatus >", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusGreaterThanOrEqualTo(String value) {
            addCriterion("employeeStatus >=", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusLessThan(String value) {
            addCriterion("employeeStatus <", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusLessThanOrEqualTo(String value) {
            addCriterion("employeeStatus <=", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusLike(String value) {
            addCriterion("employeeStatus like", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusNotLike(String value) {
            addCriterion("employeeStatus not like", value, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusIn(List<String> values) {
            addCriterion("employeeStatus in", values, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusNotIn(List<String> values) {
            addCriterion("employeeStatus not in", values, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusBetween(String value1, String value2) {
            addCriterion("employeeStatus between", value1, value2, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andEmployeestatusNotBetween(String value1, String value2) {
            addCriterion("employeeStatus not between", value1, value2, "employeestatus");
            return (Criteria) this;
        }

        public Criteria andContractrenewIsNull() {
            addCriterion("contractRenew is null");
            return (Criteria) this;
        }

        public Criteria andContractrenewIsNotNull() {
            addCriterion("contractRenew is not null");
            return (Criteria) this;
        }

        public Criteria andContractrenewEqualTo(String value) {
            addCriterion("contractRenew =", value, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewNotEqualTo(String value) {
            addCriterion("contractRenew <>", value, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewGreaterThan(String value) {
            addCriterion("contractRenew >", value, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewGreaterThanOrEqualTo(String value) {
            addCriterion("contractRenew >=", value, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewLessThan(String value) {
            addCriterion("contractRenew <", value, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewLessThanOrEqualTo(String value) {
            addCriterion("contractRenew <=", value, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewLike(String value) {
            addCriterion("contractRenew like", value, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewNotLike(String value) {
            addCriterion("contractRenew not like", value, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewIn(List<String> values) {
            addCriterion("contractRenew in", values, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewNotIn(List<String> values) {
            addCriterion("contractRenew not in", values, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewBetween(String value1, String value2) {
            addCriterion("contractRenew between", value1, value2, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andContractrenewNotBetween(String value1, String value2) {
            addCriterion("contractRenew not between", value1, value2, "contractrenew");
            return (Criteria) this;
        }

        public Criteria andWelfareareaIsNull() {
            addCriterion("welfareArea is null");
            return (Criteria) this;
        }

        public Criteria andWelfareareaIsNotNull() {
            addCriterion("welfareArea is not null");
            return (Criteria) this;
        }

        public Criteria andWelfareareaEqualTo(String value) {
            addCriterion("welfareArea =", value, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaNotEqualTo(String value) {
            addCriterion("welfareArea <>", value, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaGreaterThan(String value) {
            addCriterion("welfareArea >", value, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaGreaterThanOrEqualTo(String value) {
            addCriterion("welfareArea >=", value, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaLessThan(String value) {
            addCriterion("welfareArea <", value, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaLessThanOrEqualTo(String value) {
            addCriterion("welfareArea <=", value, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaLike(String value) {
            addCriterion("welfareArea like", value, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaNotLike(String value) {
            addCriterion("welfareArea not like", value, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaIn(List<String> values) {
            addCriterion("welfareArea in", values, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaNotIn(List<String> values) {
            addCriterion("welfareArea not in", values, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaBetween(String value1, String value2) {
            addCriterion("welfareArea between", value1, value2, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andWelfareareaNotBetween(String value1, String value2) {
            addCriterion("welfareArea not between", value1, value2, "welfarearea");
            return (Criteria) this;
        }

        public Criteria andMyroleIsNull() {
            addCriterion("myRole is null");
            return (Criteria) this;
        }

        public Criteria andMyroleIsNotNull() {
            addCriterion("myRole is not null");
            return (Criteria) this;
        }

        public Criteria andMyroleEqualTo(String value) {
            addCriterion("myRole =", value, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleNotEqualTo(String value) {
            addCriterion("myRole <>", value, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleGreaterThan(String value) {
            addCriterion("myRole >", value, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleGreaterThanOrEqualTo(String value) {
            addCriterion("myRole >=", value, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleLessThan(String value) {
            addCriterion("myRole <", value, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleLessThanOrEqualTo(String value) {
            addCriterion("myRole <=", value, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleLike(String value) {
            addCriterion("myRole like", value, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleNotLike(String value) {
            addCriterion("myRole not like", value, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleIn(List<String> values) {
            addCriterion("myRole in", values, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleNotIn(List<String> values) {
            addCriterion("myRole not in", values, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleBetween(String value1, String value2) {
            addCriterion("myRole between", value1, value2, "myrole");
            return (Criteria) this;
        }

        public Criteria andMyroleNotBetween(String value1, String value2) {
            addCriterion("myRole not between", value1, value2, "myrole");
            return (Criteria) this;
        }

        public Criteria andEmployeecccIsNull() {
            addCriterion("employeeCCC is null");
            return (Criteria) this;
        }

        public Criteria andEmployeecccIsNotNull() {
            addCriterion("employeeCCC is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeecccEqualTo(String value) {
            addCriterion("employeeCCC =", value, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccNotEqualTo(String value) {
            addCriterion("employeeCCC <>", value, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccGreaterThan(String value) {
            addCriterion("employeeCCC >", value, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccGreaterThanOrEqualTo(String value) {
            addCriterion("employeeCCC >=", value, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccLessThan(String value) {
            addCriterion("employeeCCC <", value, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccLessThanOrEqualTo(String value) {
            addCriterion("employeeCCC <=", value, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccLike(String value) {
            addCriterion("employeeCCC like", value, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccNotLike(String value) {
            addCriterion("employeeCCC not like", value, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccIn(List<String> values) {
            addCriterion("employeeCCC in", values, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccNotIn(List<String> values) {
            addCriterion("employeeCCC not in", values, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccBetween(String value1, String value2) {
            addCriterion("employeeCCC between", value1, value2, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andEmployeecccNotBetween(String value1, String value2) {
            addCriterion("employeeCCC not between", value1, value2, "employeeccc");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("`comment` is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("`comment` is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("`comment` =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("`comment` <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("`comment` >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("`comment` >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("`comment` <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("`comment` <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("`comment` like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("`comment` not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("`comment` in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("`comment` not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("`comment` between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("`comment` not between", value1, value2, "comment");
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