package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.BusinessOrder;
@Service	
public interface BusinessOrderService {

	int insertSelective(BusinessOrder businessOrder);
	//查询是否存在未支付订单
	BusinessOrder selectUnpaidOrder(String serviceId, String memberId);
	//按主键查找
	BusinessOrder selectByPrimaryKey(String orderId);
	/*修改订单状态*/
	int updateByExample(BusinessOrder businessOrder,String orderId);
	/*查找订单 通过用户id*/
	List<BusinessOrder> selectOrderByMemberId(String memberId);
	/*通过主键删除*/
	int deleteByPrimaryKey(String orderId);
	/*按id模糊查询订单*/
	List<BusinessOrder> selectLikeByOrderId(String orderId, String memberId,String beginDate,String endDate);
}
