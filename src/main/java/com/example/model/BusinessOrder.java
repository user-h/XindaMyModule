package com.example.model;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class BusinessOrder {
    private String id;

    private String businessNo;

    private String serverId;

    private Integer buynum;

    private String orderInfo;

    private Integer status;

    private Integer totalPrice;

    private Integer payType;

    private String memberId;

    private Date createTime;

    private ServiceJudge serviceJudge;
    public String getId() {
        return id;
    }

    public ServiceJudge getServiceJudge() {
		return serviceJudge;
	}

	public void setServiceJudge(ServiceJudge serviceJudge) {
		this.serviceJudge = serviceJudge;
	}

	public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo == null ? null : businessNo.trim();
    }

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId == null ? null : serverId.trim();
    }

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

    public String getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(String orderInfo) {
        this.orderInfo = orderInfo == null ? null : orderInfo.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "BusinessOrder:" + id + "-" +createTime + "serviceJudge:" + serviceJudge.getId() + "-" + serviceJudge.getContent();
	}
    
    
}