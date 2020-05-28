package com.example.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.BusinessOrderMapper;
import com.example.model.BusinessOrder;
import com.example.model.BusinessOrderExample;
import com.example.service.BusinessOrderService;
@Service
public class BusinessOrderServiceImpl implements BusinessOrderService{
	@Resource
	BusinessOrderMapper businessOrderMapper;
	
	@Override
	public int insertSelective(BusinessOrder businessOrder) {
		return businessOrderMapper.insertSelective(businessOrder);
	}
	/*查询是否存在未支付订单*/
	@Override
	public BusinessOrder selectUnpaidOrder(String serviceId, String memberId) {
		return businessOrderMapper.selectUnpaidOrder(serviceId,memberId);
	}
	
	@Override
	public BusinessOrder selectByPrimaryKey(String orderId) {
		return businessOrderMapper.selectByPrimaryKey(orderId);
	}
	@Override
	public int updateByExample(BusinessOrder businessOrder,String orderId) {
		BusinessOrderExample businessOrderExample = new BusinessOrderExample();
		BusinessOrderExample.Criteria criteria = businessOrderExample.createCriteria();
		criteria.andIdEqualTo(orderId);
		return businessOrderMapper.updateByExample(businessOrder, businessOrderExample);
	}
	@Override
	public List<BusinessOrder> selectOrderByMemberId(String memberId) {
		return businessOrderMapper.selectOrderByMemberId(memberId);
	}
	/*通过主键删除*/
	@Override
	public int deleteByPrimaryKey(String orderId) {
		return businessOrderMapper.deleteByPrimaryKey(orderId);
	}
	/*按id模糊查询订单*/
	@Override
	public List<BusinessOrder> selectLikeByOrderId(String orderId,String memberId,String beginDate,String endDate) {
		return businessOrderMapper.selectLikeByOrderId(orderId,memberId,beginDate,endDate);
	}

}
