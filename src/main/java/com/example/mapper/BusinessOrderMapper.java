package com.example.mapper;

import com.example.model.BusinessOrder;
import com.example.model.BusinessOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BusinessOrderMapper {
    long countByExample(BusinessOrderExample example);

    int deleteByExample(BusinessOrderExample example);

    int deleteByPrimaryKey(String id);

    int insert(BusinessOrder record);

    int insertSelective(BusinessOrder record);

    List<BusinessOrder> selectByExample(BusinessOrderExample example);

    BusinessOrder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BusinessOrder record, @Param("example") BusinessOrderExample example);

    int updateByExample(@Param("record") BusinessOrder record, @Param("example") BusinessOrderExample example);

    int updateByPrimaryKeySelective(BusinessOrder record);

    int updateByPrimaryKey(BusinessOrder record);
    /*查找已存在的未完成订单*/
	BusinessOrder selectUnpaidOrder(String serviceId, String memberId);
	/*按用户名查找订单*/
	List<BusinessOrder> selectOrderByMemberId(String memberId);
	/*按id模糊查询订单*/
	List<BusinessOrder> selectLikeByOrderId(String orderId, String memberId,String beginDate,String endDate);
}