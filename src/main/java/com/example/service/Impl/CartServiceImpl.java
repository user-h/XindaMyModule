package com.example.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.CartMapper;
import com.example.model.Cart;
import com.example.service.CartService;
@Service
public class CartServiceImpl implements CartService{
	
	@Resource
	CartMapper cartMapper;
	
	/******************************************
	 * 	购物车相关
	 ******************************************/
	@Override
	public List<Cart> selectByMemberIdService(String memberId) {
		return cartMapper.selectByMemberId(memberId);
	}
	/**
	 * 	通过id查找的商品条数
	 * @param memberId
	 * @return
	 */
	@Override
	public int countByMemberIdService(String memberId) {
		return cartMapper.countByMemberId(memberId);
	}
	/**
	 * 	插入不为空 的数据
	 * @param cart
	 * @return
	 */
	@Override
	public int insertSelectiveService(Cart cart) {
		return cartMapper.insertSelective(cart);
	}
	/**
     * 	通过主键删除 购物车数据
     * @param id
     * @return
     */
	@Override
	public int deleteByPrimaryKeyService(String cartId) {
		return cartMapper.deleteByPrimaryKey(cartId);
	}
	/**
     * 	按用户id查找 cart表中 总价格
     * @param memberId
     * @return
     */
	@Override
    public Integer allPriceService(String memberId) {
		return cartMapper.allPrice(memberId);
	}
	/**
     *	 通过用户id和产品id 修改 
     * @param memberId
     * @param productId
     * @param totalPrice
     * @return
     */
	@Override
	public int updateNumAndPriceByProductId(String memberId, String productId, Integer buynum, int totalPrice) {
		return cartMapper.updateNumAndPriceByProductId(memberId,productId,buynum,totalPrice);
	}
	/**
	 * 通过用户id和产品id查找totalPrice
	 * @param productId
	 * @param memberId
	 * @return
	 */
	@Override
	public int selectTotalPriceByProductId(String productId, String memberId) {
		return cartMapper.selectTotalPriceByProductId(productId,memberId);
	}

	@Override
	public Cart selectByMemeberAndProviderId(String memberId, String providerId) {
		return cartMapper.selectByMemeberAndProviderId(memberId,providerId);
	}
	/*通过主键查找*/
	@Override
	public Cart selectCartByPrimaryKey(String cartId) {
		return cartMapper.selectByPrimaryKey(cartId);
	}

}
