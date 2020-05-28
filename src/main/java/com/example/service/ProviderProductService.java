package com.example.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.model.ProviderProduct;

@Service
public interface ProviderProductService {
	/*******************************************************
	 * 	商品相关
	 *******************************************************/
	List<ProviderProduct> selectAllProviderService(int pageStart,int pageSize);

	long countAllProviderService();
	/** 通过服务商 模糊查找服务 */
	List<ProviderProduct> selectByProviderNameService(Integer pageStart, Integer pageSize, String providerName, int OrderByClause);
	/** 通过服务商 模糊查找服务的数目  */
	int countByProviderNameService(String providerName);
	
	List<ProviderProduct> selectByServiceNameService(Integer pageStart, Integer pageSize, String serviceName, int OrderByClause);

	Object countByServiceNameService(String serviceName);
	/** 通过主键id查找 */
	ProviderProduct selectProviderProductByPrimaryKey(String id);
	/** 通过 产品id查找单价 */
	int selectPriceByProductId(String productId);
	
}
