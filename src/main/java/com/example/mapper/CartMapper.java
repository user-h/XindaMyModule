package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.model.Cart;
@Mapper
public interface CartMapper {
    int insert(Cart record);

    Cart selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
    //satrt
    /**
     * 	通过会员id查找  购物车内商品
     * @param memberId
     * @return
     */
    List<Cart> selectByMemberId(String memberId);
    /**
     * 	通过id查找的商品条数 (购物车内数目)
     * @param memberId
     * @return
     */
    int countByMemberId(String memberId);
    /**
     * 	插入不为空 的数据
     * @param record
     * @return
     */
    int insertSelective(Cart record);
    /**
     * 	通过主键删除 购物车数据
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String cartId);
    /**
     * 	按用户id查找 cart表中数据 总价格
     * @param memberId
     * @return
     */
    Integer allPrice(String memberId);
    /**
     *	 通过用户id和产品id 修改 
     * @param memberId
     * @param productId
     * @param totalPrice
     * @return
     */
	int updateNumAndPriceByProductId(@Param("memberId")String memberId, @Param("productId")String productId, @Param("buynum")Integer buynum, @Param("totalPrice")int totalPrice);
	/**
	 * 通过用户id和产品id查找totalPrice
	 */
	int selectTotalPriceByProductId(String productId, String memberId);

	Cart selectByMemeberAndProviderId(@Param("memberId")String memberId, @Param("productId")String providerId);
}