package com.example.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProviderProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    protected int pageStart;
    protected int pageSize;
    
    public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public ProviderProductExample() {
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
        pageStart = 0;
        pageSize = 2;
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andProviderIdIsNull() {
            addCriterion("PROVIDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andProviderIdIsNotNull() {
            addCriterion("PROVIDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProviderIdEqualTo(String value) {
            addCriterion("PROVIDER_ID =", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotEqualTo(String value) {
            addCriterion("PROVIDER_ID <>", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThan(String value) {
            addCriterion("PROVIDER_ID >", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_ID >=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThan(String value) {
            addCriterion("PROVIDER_ID <", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_ID <=", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdLike(String value) {
            addCriterion("PROVIDER_ID like", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotLike(String value) {
            addCriterion("PROVIDER_ID not like", value, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdIn(List<String> values) {
            addCriterion("PROVIDER_ID in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotIn(List<String> values) {
            addCriterion("PROVIDER_ID not in", values, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdBetween(String value1, String value2) {
            addCriterion("PROVIDER_ID between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderIdNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_ID not between", value1, value2, "providerId");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNull() {
            addCriterion("PROVIDER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNotNull() {
            addCriterion("PROVIDER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProviderNameEqualTo(String value) {
            addCriterion("PROVIDER_NAME =", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("PROVIDER_NAME <>", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThan(String value) {
            addCriterion("PROVIDER_NAME >", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_NAME >=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThan(String value) {
            addCriterion("PROVIDER_NAME <", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_NAME <=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLike(String value) {
            addCriterion("PROVIDER_NAME like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotLike(String value) {
            addCriterion("PROVIDER_NAME not like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameIn(List<String> values) {
            addCriterion("PROVIDER_NAME in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotIn(List<String> values) {
            addCriterion("PROVIDER_NAME not in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("PROVIDER_NAME between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_NAME not between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("SERVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("SERVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("SERVICE_NAME =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("SERVICE_NAME <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("SERVICE_NAME >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("SERVICE_NAME <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("SERVICE_NAME like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("SERVICE_NAME not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("SERVICE_NAME in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("SERVICE_NAME not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceInfoIsNull() {
            addCriterion("SERVICE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andServiceInfoIsNotNull() {
            addCriterion("SERVICE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andServiceInfoEqualTo(String value) {
            addCriterion("SERVICE_INFO =", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoNotEqualTo(String value) {
            addCriterion("SERVICE_INFO <>", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoGreaterThan(String value) {
            addCriterion("SERVICE_INFO >", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_INFO >=", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoLessThan(String value) {
            addCriterion("SERVICE_INFO <", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_INFO <=", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoLike(String value) {
            addCriterion("SERVICE_INFO like", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoNotLike(String value) {
            addCriterion("SERVICE_INFO not like", value, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoIn(List<String> values) {
            addCriterion("SERVICE_INFO in", values, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoNotIn(List<String> values) {
            addCriterion("SERVICE_INFO not in", values, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoBetween(String value1, String value2) {
            addCriterion("SERVICE_INFO between", value1, value2, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceInfoNotBetween(String value1, String value2) {
            addCriterion("SERVICE_INFO not between", value1, value2, "serviceInfo");
            return (Criteria) this;
        }

        public Criteria andServiceImgIsNull() {
            addCriterion("SERVICE_IMG is null");
            return (Criteria) this;
        }

        public Criteria andServiceImgIsNotNull() {
            addCriterion("SERVICE_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andServiceImgEqualTo(String value) {
            addCriterion("SERVICE_IMG =", value, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgNotEqualTo(String value) {
            addCriterion("SERVICE_IMG <>", value, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgGreaterThan(String value) {
            addCriterion("SERVICE_IMG >", value, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_IMG >=", value, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgLessThan(String value) {
            addCriterion("SERVICE_IMG <", value, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_IMG <=", value, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgLike(String value) {
            addCriterion("SERVICE_IMG like", value, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgNotLike(String value) {
            addCriterion("SERVICE_IMG not like", value, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgIn(List<String> values) {
            addCriterion("SERVICE_IMG in", values, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgNotIn(List<String> values) {
            addCriterion("SERVICE_IMG not in", values, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgBetween(String value1, String value2) {
            addCriterion("SERVICE_IMG between", value1, value2, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andServiceImgNotBetween(String value1, String value2) {
            addCriterion("SERVICE_IMG not between", value1, value2, "serviceImg");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Integer value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Integer value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Integer value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Integer value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Integer value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Integer> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Integer> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Integer value1, Integer value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNull() {
            addCriterion("sales_volume is null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIsNotNull() {
            addCriterion("sales_volume is not null");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeEqualTo(Integer value) {
            addCriterion("sales_volume =", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotEqualTo(Integer value) {
            addCriterion("sales_volume <>", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThan(Integer value) {
            addCriterion("sales_volume >", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_volume >=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThan(Integer value) {
            addCriterion("sales_volume <", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("sales_volume <=", value, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeIn(List<Integer> values) {
            addCriterion("sales_volume in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotIn(List<Integer> values) {
            addCriterion("sales_volume not in", values, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeBetween(Integer value1, Integer value2) {
            addCriterion("sales_volume between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andSalesVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_volume not between", value1, value2, "salesVolume");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNull() {
            addCriterion("RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andRecommendIsNotNull() {
            addCriterion("RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendEqualTo(Integer value) {
            addCriterion("RECOMMEND =", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotEqualTo(Integer value) {
            addCriterion("RECOMMEND <>", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThan(Integer value) {
            addCriterion("RECOMMEND >", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECOMMEND >=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThan(Integer value) {
            addCriterion("RECOMMEND <", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendLessThanOrEqualTo(Integer value) {
            addCriterion("RECOMMEND <=", value, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendIn(List<Integer> values) {
            addCriterion("RECOMMEND in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotIn(List<Integer> values) {
            addCriterion("RECOMMEND not in", values, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendBetween(Integer value1, Integer value2) {
            addCriterion("RECOMMEND between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andRecommendNotBetween(Integer value1, Integer value2) {
            addCriterion("RECOMMEND not between", value1, value2, "recommend");
            return (Criteria) this;
        }

        public Criteria andHighQualityIsNull() {
            addCriterion("HIGH_QUALITY is null");
            return (Criteria) this;
        }

        public Criteria andHighQualityIsNotNull() {
            addCriterion("HIGH_QUALITY is not null");
            return (Criteria) this;
        }

        public Criteria andHighQualityEqualTo(Integer value) {
            addCriterion("HIGH_QUALITY =", value, "highQuality");
            return (Criteria) this;
        }

        public Criteria andHighQualityNotEqualTo(Integer value) {
            addCriterion("HIGH_QUALITY <>", value, "highQuality");
            return (Criteria) this;
        }

        public Criteria andHighQualityGreaterThan(Integer value) {
            addCriterion("HIGH_QUALITY >", value, "highQuality");
            return (Criteria) this;
        }

        public Criteria andHighQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("HIGH_QUALITY >=", value, "highQuality");
            return (Criteria) this;
        }

        public Criteria andHighQualityLessThan(Integer value) {
            addCriterion("HIGH_QUALITY <", value, "highQuality");
            return (Criteria) this;
        }

        public Criteria andHighQualityLessThanOrEqualTo(Integer value) {
            addCriterion("HIGH_QUALITY <=", value, "highQuality");
            return (Criteria) this;
        }

        public Criteria andHighQualityIn(List<Integer> values) {
            addCriterion("HIGH_QUALITY in", values, "highQuality");
            return (Criteria) this;
        }

        public Criteria andHighQualityNotIn(List<Integer> values) {
            addCriterion("HIGH_QUALITY not in", values, "highQuality");
            return (Criteria) this;
        }

        public Criteria andHighQualityBetween(Integer value1, Integer value2) {
            addCriterion("HIGH_QUALITY between", value1, value2, "highQuality");
            return (Criteria) this;
        }

        public Criteria andHighQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("HIGH_QUALITY not between", value1, value2, "highQuality");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CREATE_TIME not between", value1, value2, "createTime");
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