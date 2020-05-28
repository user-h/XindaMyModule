package com.example.mapper;

import com.example.model.ProviderProduct;
import com.example.model.ProviderProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProviderProductMapper {
    long countByExample(ProviderProductExample example);

    int deleteByExample(ProviderProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProviderProduct record);

    int insertSelective(ProviderProduct record);

    List<ProviderProduct> selectByExample(ProviderProductExample example);

    int updateByExampleSelective(@Param("record") ProviderProduct record, @Param("example") ProviderProductExample example);

    int updateByExample(@Param("record") ProviderProduct record, @Param("example") ProviderProductExample example);

    int updateByPrimaryKeySelective(ProviderProduct record);

    int updateByPrimaryKey(ProviderProduct record);
    /******************************start*****************************/
	List<ProviderProduct> selectAllProviderDao(ProviderProductExample providerProductExample);
	
	List<ProviderProduct> selectByProviderNameDao(@Param("example")ProviderProductExample providerProductExample,@Param("providerName")String providerName);
	
	int countByProviderNameDao(String providerName);

	List<ProviderProduct> selectByServiceNameDao(@Param("example")ProviderProductExample providerProductExample,@Param("serviceName")String serviceName);

	Object countByServiceNameDao(String serviceName);
	
	ProviderProduct selectByPrimaryKey(String id);
	/**
	 * 	通过 产品id查找单价
	 * @param productId
	 * @return
	 */
	int selectPriceByProductId(String productId);

}