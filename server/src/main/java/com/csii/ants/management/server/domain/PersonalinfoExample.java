package com.csii.ants.management.server.domain;

import java.util.ArrayList;
import java.util.List;

public class PersonalinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonalinfoExample() {
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andEthnicityIsNull() {
            addCriterion("ethnicity is null");
            return (Criteria) this;
        }

        public Criteria andEthnicityIsNotNull() {
            addCriterion("ethnicity is not null");
            return (Criteria) this;
        }

        public Criteria andEthnicityEqualTo(String value) {
            addCriterion("ethnicity =", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotEqualTo(String value) {
            addCriterion("ethnicity <>", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityGreaterThan(String value) {
            addCriterion("ethnicity >", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityGreaterThanOrEqualTo(String value) {
            addCriterion("ethnicity >=", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityLessThan(String value) {
            addCriterion("ethnicity <", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityLessThanOrEqualTo(String value) {
            addCriterion("ethnicity <=", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityLike(String value) {
            addCriterion("ethnicity like", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotLike(String value) {
            addCriterion("ethnicity not like", value, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityIn(List<String> values) {
            addCriterion("ethnicity in", values, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotIn(List<String> values) {
            addCriterion("ethnicity not in", values, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityBetween(String value1, String value2) {
            addCriterion("ethnicity between", value1, value2, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andEthnicityNotBetween(String value1, String value2) {
            addCriterion("ethnicity not between", value1, value2, "ethnicity");
            return (Criteria) this;
        }

        public Criteria andIdnumIsNull() {
            addCriterion("idnum is null");
            return (Criteria) this;
        }

        public Criteria andIdnumIsNotNull() {
            addCriterion("idnum is not null");
            return (Criteria) this;
        }

        public Criteria andIdnumEqualTo(String value) {
            addCriterion("idnum =", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotEqualTo(String value) {
            addCriterion("idnum <>", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumGreaterThan(String value) {
            addCriterion("idnum >", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumGreaterThanOrEqualTo(String value) {
            addCriterion("idnum >=", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumLessThan(String value) {
            addCriterion("idnum <", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumLessThanOrEqualTo(String value) {
            addCriterion("idnum <=", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumLike(String value) {
            addCriterion("idnum like", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotLike(String value) {
            addCriterion("idnum not like", value, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumIn(List<String> values) {
            addCriterion("idnum in", values, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotIn(List<String> values) {
            addCriterion("idnum not in", values, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumBetween(String value1, String value2) {
            addCriterion("idnum between", value1, value2, "idnum");
            return (Criteria) this;
        }

        public Criteria andIdnumNotBetween(String value1, String value2) {
            addCriterion("idnum not between", value1, value2, "idnum");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookIsNull() {
            addCriterion("politicalOutlook is null");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookIsNotNull() {
            addCriterion("politicalOutlook is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookEqualTo(String value) {
            addCriterion("politicalOutlook =", value, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookNotEqualTo(String value) {
            addCriterion("politicalOutlook <>", value, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookGreaterThan(String value) {
            addCriterion("politicalOutlook >", value, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookGreaterThanOrEqualTo(String value) {
            addCriterion("politicalOutlook >=", value, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookLessThan(String value) {
            addCriterion("politicalOutlook <", value, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookLessThanOrEqualTo(String value) {
            addCriterion("politicalOutlook <=", value, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookLike(String value) {
            addCriterion("politicalOutlook like", value, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookNotLike(String value) {
            addCriterion("politicalOutlook not like", value, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookIn(List<String> values) {
            addCriterion("politicalOutlook in", values, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookNotIn(List<String> values) {
            addCriterion("politicalOutlook not in", values, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookBetween(String value1, String value2) {
            addCriterion("politicalOutlook between", value1, value2, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andPoliticaloutlookNotBetween(String value1, String value2) {
            addCriterion("politicalOutlook not between", value1, value2, "politicaloutlook");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIsNull() {
            addCriterion("dateOfBirth is null");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIsNotNull() {
            addCriterion("dateOfBirth is not null");
            return (Criteria) this;
        }

        public Criteria andDateofbirthEqualTo(String value) {
            addCriterion("dateOfBirth =", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotEqualTo(String value) {
            addCriterion("dateOfBirth <>", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthGreaterThan(String value) {
            addCriterion("dateOfBirth >", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthGreaterThanOrEqualTo(String value) {
            addCriterion("dateOfBirth >=", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLessThan(String value) {
            addCriterion("dateOfBirth <", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLessThanOrEqualTo(String value) {
            addCriterion("dateOfBirth <=", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthLike(String value) {
            addCriterion("dateOfBirth like", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotLike(String value) {
            addCriterion("dateOfBirth not like", value, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthIn(List<String> values) {
            addCriterion("dateOfBirth in", values, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotIn(List<String> values) {
            addCriterion("dateOfBirth not in", values, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthBetween(String value1, String value2) {
            addCriterion("dateOfBirth between", value1, value2, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andDateofbirthNotBetween(String value1, String value2) {
            addCriterion("dateOfBirth not between", value1, value2, "dateofbirth");
            return (Criteria) this;
        }

        public Criteria andPersonalemailIsNull() {
            addCriterion("personalEmail is null");
            return (Criteria) this;
        }

        public Criteria andPersonalemailIsNotNull() {
            addCriterion("personalEmail is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalemailEqualTo(String value) {
            addCriterion("personalEmail =", value, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailNotEqualTo(String value) {
            addCriterion("personalEmail <>", value, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailGreaterThan(String value) {
            addCriterion("personalEmail >", value, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailGreaterThanOrEqualTo(String value) {
            addCriterion("personalEmail >=", value, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailLessThan(String value) {
            addCriterion("personalEmail <", value, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailLessThanOrEqualTo(String value) {
            addCriterion("personalEmail <=", value, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailLike(String value) {
            addCriterion("personalEmail like", value, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailNotLike(String value) {
            addCriterion("personalEmail not like", value, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailIn(List<String> values) {
            addCriterion("personalEmail in", values, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailNotIn(List<String> values) {
            addCriterion("personalEmail not in", values, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailBetween(String value1, String value2) {
            addCriterion("personalEmail between", value1, value2, "personalemail");
            return (Criteria) this;
        }

        public Criteria andPersonalemailNotBetween(String value1, String value2) {
            addCriterion("personalEmail not between", value1, value2, "personalemail");
            return (Criteria) this;
        }

        public Criteria andRegisTypeIsNull() {
            addCriterion("regis_Type is null");
            return (Criteria) this;
        }

        public Criteria andRegisTypeIsNotNull() {
            addCriterion("regis_Type is not null");
            return (Criteria) this;
        }

        public Criteria andRegisTypeEqualTo(String value) {
            addCriterion("regis_Type =", value, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeNotEqualTo(String value) {
            addCriterion("regis_Type <>", value, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeGreaterThan(String value) {
            addCriterion("regis_Type >", value, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeGreaterThanOrEqualTo(String value) {
            addCriterion("regis_Type >=", value, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeLessThan(String value) {
            addCriterion("regis_Type <", value, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeLessThanOrEqualTo(String value) {
            addCriterion("regis_Type <=", value, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeLike(String value) {
            addCriterion("regis_Type like", value, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeNotLike(String value) {
            addCriterion("regis_Type not like", value, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeIn(List<String> values) {
            addCriterion("regis_Type in", values, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeNotIn(List<String> values) {
            addCriterion("regis_Type not in", values, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeBetween(String value1, String value2) {
            addCriterion("regis_Type between", value1, value2, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisTypeNotBetween(String value1, String value2) {
            addCriterion("regis_Type not between", value1, value2, "regisType");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceIsNull() {
            addCriterion("regis_Residence is null");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceIsNotNull() {
            addCriterion("regis_Residence is not null");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceEqualTo(String value) {
            addCriterion("regis_Residence =", value, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceNotEqualTo(String value) {
            addCriterion("regis_Residence <>", value, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceGreaterThan(String value) {
            addCriterion("regis_Residence >", value, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("regis_Residence >=", value, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceLessThan(String value) {
            addCriterion("regis_Residence <", value, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceLessThanOrEqualTo(String value) {
            addCriterion("regis_Residence <=", value, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceLike(String value) {
            addCriterion("regis_Residence like", value, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceNotLike(String value) {
            addCriterion("regis_Residence not like", value, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceIn(List<String> values) {
            addCriterion("regis_Residence in", values, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceNotIn(List<String> values) {
            addCriterion("regis_Residence not in", values, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceBetween(String value1, String value2) {
            addCriterion("regis_Residence between", value1, value2, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andRegisResidenceNotBetween(String value1, String value2) {
            addCriterion("regis_Residence not between", value1, value2, "regisResidence");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalStatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(String value) {
            addCriterion("maritalStatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(String value) {
            addCriterion("maritalStatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(String value) {
            addCriterion("maritalStatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("maritalStatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(String value) {
            addCriterion("maritalStatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("maritalStatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLike(String value) {
            addCriterion("maritalStatus like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotLike(String value) {
            addCriterion("maritalStatus not like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<String> values) {
            addCriterion("maritalStatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<String> values) {
            addCriterion("maritalStatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(String value1, String value2) {
            addCriterion("maritalStatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(String value1, String value2) {
            addCriterion("maritalStatus not between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andGradUnversityIsNull() {
            addCriterion("grad_Unversity is null");
            return (Criteria) this;
        }

        public Criteria andGradUnversityIsNotNull() {
            addCriterion("grad_Unversity is not null");
            return (Criteria) this;
        }

        public Criteria andGradUnversityEqualTo(String value) {
            addCriterion("grad_Unversity =", value, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityNotEqualTo(String value) {
            addCriterion("grad_Unversity <>", value, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityGreaterThan(String value) {
            addCriterion("grad_Unversity >", value, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityGreaterThanOrEqualTo(String value) {
            addCriterion("grad_Unversity >=", value, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityLessThan(String value) {
            addCriterion("grad_Unversity <", value, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityLessThanOrEqualTo(String value) {
            addCriterion("grad_Unversity <=", value, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityLike(String value) {
            addCriterion("grad_Unversity like", value, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityNotLike(String value) {
            addCriterion("grad_Unversity not like", value, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityIn(List<String> values) {
            addCriterion("grad_Unversity in", values, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityNotIn(List<String> values) {
            addCriterion("grad_Unversity not in", values, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityBetween(String value1, String value2) {
            addCriterion("grad_Unversity between", value1, value2, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradUnversityNotBetween(String value1, String value2) {
            addCriterion("grad_Unversity not between", value1, value2, "gradUnversity");
            return (Criteria) this;
        }

        public Criteria andGradTimeIsNull() {
            addCriterion("grad_Time is null");
            return (Criteria) this;
        }

        public Criteria andGradTimeIsNotNull() {
            addCriterion("grad_Time is not null");
            return (Criteria) this;
        }

        public Criteria andGradTimeEqualTo(String value) {
            addCriterion("grad_Time =", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeNotEqualTo(String value) {
            addCriterion("grad_Time <>", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeGreaterThan(String value) {
            addCriterion("grad_Time >", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeGreaterThanOrEqualTo(String value) {
            addCriterion("grad_Time >=", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeLessThan(String value) {
            addCriterion("grad_Time <", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeLessThanOrEqualTo(String value) {
            addCriterion("grad_Time <=", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeLike(String value) {
            addCriterion("grad_Time like", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeNotLike(String value) {
            addCriterion("grad_Time not like", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeIn(List<String> values) {
            addCriterion("grad_Time in", values, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeNotIn(List<String> values) {
            addCriterion("grad_Time not in", values, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeBetween(String value1, String value2) {
            addCriterion("grad_Time between", value1, value2, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeNotBetween(String value1, String value2) {
            addCriterion("grad_Time not between", value1, value2, "gradTime");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("`degree` is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("`degree` is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("`degree` =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("`degree` <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("`degree` >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("`degree` >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("`degree` <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("`degree` <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("`degree` like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("`degree` not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("`degree` in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("`degree` not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("`degree` between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("`degree` not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNull() {
            addCriterion("nativePlace is null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIsNotNull() {
            addCriterion("nativePlace is not null");
            return (Criteria) this;
        }

        public Criteria andNativeplaceEqualTo(String value) {
            addCriterion("nativePlace =", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotEqualTo(String value) {
            addCriterion("nativePlace <>", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThan(String value) {
            addCriterion("nativePlace >", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("nativePlace >=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThan(String value) {
            addCriterion("nativePlace <", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLessThanOrEqualTo(String value) {
            addCriterion("nativePlace <=", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceLike(String value) {
            addCriterion("nativePlace like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotLike(String value) {
            addCriterion("nativePlace not like", value, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceIn(List<String> values) {
            addCriterion("nativePlace in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotIn(List<String> values) {
            addCriterion("nativePlace not in", values, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceBetween(String value1, String value2) {
            addCriterion("nativePlace between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andNativeplaceNotBetween(String value1, String value2) {
            addCriterion("nativePlace not between", value1, value2, "nativeplace");
            return (Criteria) this;
        }

        public Criteria andPresentaddressIsNull() {
            addCriterion("presentAddress is null");
            return (Criteria) this;
        }

        public Criteria andPresentaddressIsNotNull() {
            addCriterion("presentAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPresentaddressEqualTo(String value) {
            addCriterion("presentAddress =", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressNotEqualTo(String value) {
            addCriterion("presentAddress <>", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressGreaterThan(String value) {
            addCriterion("presentAddress >", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressGreaterThanOrEqualTo(String value) {
            addCriterion("presentAddress >=", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressLessThan(String value) {
            addCriterion("presentAddress <", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressLessThanOrEqualTo(String value) {
            addCriterion("presentAddress <=", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressLike(String value) {
            addCriterion("presentAddress like", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressNotLike(String value) {
            addCriterion("presentAddress not like", value, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressIn(List<String> values) {
            addCriterion("presentAddress in", values, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressNotIn(List<String> values) {
            addCriterion("presentAddress not in", values, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressBetween(String value1, String value2) {
            addCriterion("presentAddress between", value1, value2, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andPresentaddressNotBetween(String value1, String value2) {
            addCriterion("presentAddress not between", value1, value2, "presentaddress");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andQqnumIsNull() {
            addCriterion("qqNum is null");
            return (Criteria) this;
        }

        public Criteria andQqnumIsNotNull() {
            addCriterion("qqNum is not null");
            return (Criteria) this;
        }

        public Criteria andQqnumEqualTo(String value) {
            addCriterion("qqNum =", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotEqualTo(String value) {
            addCriterion("qqNum <>", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumGreaterThan(String value) {
            addCriterion("qqNum >", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumGreaterThanOrEqualTo(String value) {
            addCriterion("qqNum >=", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLessThan(String value) {
            addCriterion("qqNum <", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLessThanOrEqualTo(String value) {
            addCriterion("qqNum <=", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumLike(String value) {
            addCriterion("qqNum like", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotLike(String value) {
            addCriterion("qqNum not like", value, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumIn(List<String> values) {
            addCriterion("qqNum in", values, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotIn(List<String> values) {
            addCriterion("qqNum not in", values, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumBetween(String value1, String value2) {
            addCriterion("qqNum between", value1, value2, "qqnum");
            return (Criteria) this;
        }

        public Criteria andQqnumNotBetween(String value1, String value2) {
            addCriterion("qqNum not between", value1, value2, "qqnum");
            return (Criteria) this;
        }

        public Criteria andWechatIsNull() {
            addCriterion("wechat is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("wechat is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("wechat =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("wechat <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("wechat >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("wechat >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("wechat <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("wechat <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("wechat like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("wechat in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("wechat not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("wechat between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("wechat not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelIsNull() {
            addCriterion("emergencyContactRel is null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelIsNotNull() {
            addCriterion("emergencyContactRel is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelEqualTo(String value) {
            addCriterion("emergencyContactRel =", value, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelNotEqualTo(String value) {
            addCriterion("emergencyContactRel <>", value, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelGreaterThan(String value) {
            addCriterion("emergencyContactRel >", value, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelGreaterThanOrEqualTo(String value) {
            addCriterion("emergencyContactRel >=", value, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelLessThan(String value) {
            addCriterion("emergencyContactRel <", value, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelLessThanOrEqualTo(String value) {
            addCriterion("emergencyContactRel <=", value, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelLike(String value) {
            addCriterion("emergencyContactRel like", value, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelNotLike(String value) {
            addCriterion("emergencyContactRel not like", value, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelIn(List<String> values) {
            addCriterion("emergencyContactRel in", values, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelNotIn(List<String> values) {
            addCriterion("emergencyContactRel not in", values, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelBetween(String value1, String value2) {
            addCriterion("emergencyContactRel between", value1, value2, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactrelNotBetween(String value1, String value2) {
            addCriterion("emergencyContactRel not between", value1, value2, "emergencycontactrel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameIsNull() {
            addCriterion("emergencyContactName is null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameIsNotNull() {
            addCriterion("emergencyContactName is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameEqualTo(String value) {
            addCriterion("emergencyContactName =", value, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameNotEqualTo(String value) {
            addCriterion("emergencyContactName <>", value, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameGreaterThan(String value) {
            addCriterion("emergencyContactName >", value, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameGreaterThanOrEqualTo(String value) {
            addCriterion("emergencyContactName >=", value, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameLessThan(String value) {
            addCriterion("emergencyContactName <", value, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameLessThanOrEqualTo(String value) {
            addCriterion("emergencyContactName <=", value, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameLike(String value) {
            addCriterion("emergencyContactName like", value, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameNotLike(String value) {
            addCriterion("emergencyContactName not like", value, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameIn(List<String> values) {
            addCriterion("emergencyContactName in", values, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameNotIn(List<String> values) {
            addCriterion("emergencyContactName not in", values, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameBetween(String value1, String value2) {
            addCriterion("emergencyContactName between", value1, value2, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontactnameNotBetween(String value1, String value2) {
            addCriterion("emergencyContactName not between", value1, value2, "emergencycontactname");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelIsNull() {
            addCriterion("emergencyContactTel is null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelIsNotNull() {
            addCriterion("emergencyContactTel is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelEqualTo(String value) {
            addCriterion("emergencyContactTel =", value, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelNotEqualTo(String value) {
            addCriterion("emergencyContactTel <>", value, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelGreaterThan(String value) {
            addCriterion("emergencyContactTel >", value, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelGreaterThanOrEqualTo(String value) {
            addCriterion("emergencyContactTel >=", value, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelLessThan(String value) {
            addCriterion("emergencyContactTel <", value, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelLessThanOrEqualTo(String value) {
            addCriterion("emergencyContactTel <=", value, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelLike(String value) {
            addCriterion("emergencyContactTel like", value, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelNotLike(String value) {
            addCriterion("emergencyContactTel not like", value, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelIn(List<String> values) {
            addCriterion("emergencyContactTel in", values, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelNotIn(List<String> values) {
            addCriterion("emergencyContactTel not in", values, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelBetween(String value1, String value2) {
            addCriterion("emergencyContactTel between", value1, value2, "emergencycontacttel");
            return (Criteria) this;
        }

        public Criteria andEmergencycontacttelNotBetween(String value1, String value2) {
            addCriterion("emergencyContactTel not between", value1, value2, "emergencycontacttel");
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