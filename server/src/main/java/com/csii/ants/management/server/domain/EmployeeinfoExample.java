package com.csii.ants.management.server.domain;

import java.util.ArrayList;
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

        public Criteria andInternshipbeginEqualTo(String value) {
            addCriterion("internshipBegin =", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginNotEqualTo(String value) {
            addCriterion("internshipBegin <>", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginGreaterThan(String value) {
            addCriterion("internshipBegin >", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginGreaterThanOrEqualTo(String value) {
            addCriterion("internshipBegin >=", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginLessThan(String value) {
            addCriterion("internshipBegin <", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginLessThanOrEqualTo(String value) {
            addCriterion("internshipBegin <=", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginLike(String value) {
            addCriterion("internshipBegin like", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginNotLike(String value) {
            addCriterion("internshipBegin not like", value, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginIn(List<String> values) {
            addCriterion("internshipBegin in", values, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginNotIn(List<String> values) {
            addCriterion("internshipBegin not in", values, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginBetween(String value1, String value2) {
            addCriterion("internshipBegin between", value1, value2, "internshipbegin");
            return (Criteria) this;
        }

        public Criteria andInternshipbeginNotBetween(String value1, String value2) {
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

        public Criteria andInternshipendingEqualTo(String value) {
            addCriterion("internshipEnding =", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingNotEqualTo(String value) {
            addCriterion("internshipEnding <>", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingGreaterThan(String value) {
            addCriterion("internshipEnding >", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingGreaterThanOrEqualTo(String value) {
            addCriterion("internshipEnding >=", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingLessThan(String value) {
            addCriterion("internshipEnding <", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingLessThanOrEqualTo(String value) {
            addCriterion("internshipEnding <=", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingLike(String value) {
            addCriterion("internshipEnding like", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingNotLike(String value) {
            addCriterion("internshipEnding not like", value, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingIn(List<String> values) {
            addCriterion("internshipEnding in", values, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingNotIn(List<String> values) {
            addCriterion("internshipEnding not in", values, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingBetween(String value1, String value2) {
            addCriterion("internshipEnding between", value1, value2, "internshipending");
            return (Criteria) this;
        }

        public Criteria andInternshipendingNotBetween(String value1, String value2) {
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

        public Criteria andConversionregTimeEqualTo(String value) {
            addCriterion("conversionReg_Time =", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeNotEqualTo(String value) {
            addCriterion("conversionReg_Time <>", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeGreaterThan(String value) {
            addCriterion("conversionReg_Time >", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeGreaterThanOrEqualTo(String value) {
            addCriterion("conversionReg_Time >=", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeLessThan(String value) {
            addCriterion("conversionReg_Time <", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeLessThanOrEqualTo(String value) {
            addCriterion("conversionReg_Time <=", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeLike(String value) {
            addCriterion("conversionReg_Time like", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeNotLike(String value) {
            addCriterion("conversionReg_Time not like", value, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeIn(List<String> values) {
            addCriterion("conversionReg_Time in", values, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeNotIn(List<String> values) {
            addCriterion("conversionReg_Time not in", values, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeBetween(String value1, String value2) {
            addCriterion("conversionReg_Time between", value1, value2, "conversionregTime");
            return (Criteria) this;
        }

        public Criteria andConversionregTimeNotBetween(String value1, String value2) {
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

        public Criteria andContractsigningEqualTo(String value) {
            addCriterion("contractSigning =", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningNotEqualTo(String value) {
            addCriterion("contractSigning <>", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningGreaterThan(String value) {
            addCriterion("contractSigning >", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningGreaterThanOrEqualTo(String value) {
            addCriterion("contractSigning >=", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningLessThan(String value) {
            addCriterion("contractSigning <", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningLessThanOrEqualTo(String value) {
            addCriterion("contractSigning <=", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningLike(String value) {
            addCriterion("contractSigning like", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningNotLike(String value) {
            addCriterion("contractSigning not like", value, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningIn(List<String> values) {
            addCriterion("contractSigning in", values, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningNotIn(List<String> values) {
            addCriterion("contractSigning not in", values, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningBetween(String value1, String value2) {
            addCriterion("contractSigning between", value1, value2, "contractsigning");
            return (Criteria) this;
        }

        public Criteria andContractsigningNotBetween(String value1, String value2) {
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

        public Criteria andContractendingEqualTo(String value) {
            addCriterion("contractEnding =", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingNotEqualTo(String value) {
            addCriterion("contractEnding <>", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingGreaterThan(String value) {
            addCriterion("contractEnding >", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingGreaterThanOrEqualTo(String value) {
            addCriterion("contractEnding >=", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingLessThan(String value) {
            addCriterion("contractEnding <", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingLessThanOrEqualTo(String value) {
            addCriterion("contractEnding <=", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingLike(String value) {
            addCriterion("contractEnding like", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingNotLike(String value) {
            addCriterion("contractEnding not like", value, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingIn(List<String> values) {
            addCriterion("contractEnding in", values, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingNotIn(List<String> values) {
            addCriterion("contractEnding not in", values, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingBetween(String value1, String value2) {
            addCriterion("contractEnding between", value1, value2, "contractending");
            return (Criteria) this;
        }

        public Criteria andContractendingNotBetween(String value1, String value2) {
            addCriterion("contractEnding not between", value1, value2, "contractending");
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