package com.example.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.mapper.ProviderProductMapper;
import com.example.model.ProviderProduct;
import com.example.model.ProviderProductExample;
import com.example.service.ProviderProductService;

@Service
public class ProviderProductServiceImpl implements ProviderProductService{
	@Resource
	ProviderProductMapper providerProductMapper;

	/**
	 * 商品相关
	 */
	@Override
	public List<ProviderProduct> selectAllProviderService(int pageStart,int pageSize) {
		ProviderProductExample providerProductExample = new ProviderProductExample();
		providerProductExample.setDistinct(false);
		providerProductExample.setPageStart(pageStart);
		providerProductExample.setPageSize(pageSize);
		providerProductExample.setOrderByClause("`PRICE` DESC,`id` DESC");
		//System.out.println("pageStart=" + pageStart + "pageSize=" +pageSize);
		return providerProductMapper.selectAllProviderDao(providerProductExample);
	}

	@Override
	public long countAllProviderService() {
		ProviderProductExample providerProductExample = new ProviderProductExample();
		return providerProductMapper.countByExample(providerProductExample);
	}

	/**
	 * 	通过服务商 模糊查找服务
	 * @param pageStart
	 * @param pageSize
	 * @param providerName
	 * @return
	 */
	@Override
	public List<ProviderProduct> selectByProviderNameService(Integer pageStart, Integer pageSize, String providerName, int orderByClause) {
		ProviderProductExample providerProductExample = new ProviderProductExample();
		providerProductExample.setDistinct(false);
		providerProductExample.setPageStart(pageStart);
		providerProductExample.setPageSize(pageSize);
		if(orderByClause==1) {
			providerProductExample.setOrderByClause("`PRICE` DESC,`id` DESC");
		}else if(orderByClause==2){
			providerProductExample.setOrderByClause("`PRICE` ASC,`id` ASC");
		}else{
			
		}
		return providerProductMapper.selectByProviderNameDao(providerProductExample,providerName);
	}
	/**
	 * 	通过服务商 模糊查找服务的数目
	 * @param providerName
	 * @return
	 */
	@Override
	public int countByProviderNameService(String providerName) {
		return providerProductMapper.countByProviderNameDao(providerName);
	}

	@Override
	public List<ProviderProduct> selectByServiceNameService(Integer pageStart, Integer pageSize, String serviceName, int orderByClause) {
		ProviderProductExample providerProductExample = new ProviderProductExample();
		providerProductExample.setDistinct(false);
		providerProductExample.setPageStart(pageStart);
		providerProductExample.setPageSize(pageSize);
		if(orderByClause==1) {
			providerProductExample.setOrderByClause("`PRICE` DESC,`id` DESC");
		}else if(orderByClause==2){
			providerProductExample.setOrderByClause("`PRICE` ASC,`id` ASC");
		}else{
		}
		return providerProductMapper.selectByServiceNameDao(providerProductExample,serviceName);
	}

	@Override
	public Object countByServiceNameService(String serviceName) {
		return providerProductMapper.countByServiceNameDao(serviceName);
	}
	/**
	 * 	通过主键id查找
	 * @param id
	 * @return
	 */
	@Override
	public ProviderProduct selectProviderProductByPrimaryKey(String id) {
		return providerProductMapper.selectByPrimaryKey(id);
	}
	/**
	 * 	通过 产品id查找单价
	 * @param productId
	 * @return
	 */
	@Override
	public int selectPriceByProductId(String productId) {
		return providerProductMapper.selectPriceByProductId(productId);
	}
	
}
