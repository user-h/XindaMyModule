package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Cart;
@Service
public interface CartService {
	/************************************************************
	 * 	购物车相关
	 ************************************************************/
	/** 通过会员id查找  购物车内商品 */
	List<Cart> selectByMemberIdService(String memberId);
	/** 通过id查找的商品条数 */
	int countByMemberIdService(String memberId);
	/** 插入不为空 的数据 */
	int insertSelectiveService(Cart cart);
	/** 通过主键删除 购物车数据 */
    int deleteByPrimaryKeyService(String cartId);
    /** 按用户id查找 cart表中数据 总价格 */
    public Integer allPriceService(String memberId);
    /** 通过用户id和产品id 修改   */
	int updateNumAndPriceByProductId(String memberId, String productId, Integer buynum, int totalPrice);
	/** 通过用户id和产品id查找totalPrice */
	int selectTotalPriceByProductId(String productId, String memberId);
	/**  通过用户id和产品id查找信息 */
	Cart selectByMemeberAndProviderId(String memberId, String providerId);
	/**  通过主键查找*/
	Cart selectCartByPrimaryKey(String cartId);
}
