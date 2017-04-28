package com.betterjr.modules.productconfig;

import java.util.Map;

public interface IScfProductConfigService {

	/**
	 * 保存产品配置
	 * @param anMap
	 * @return
	 */
	String webAddProductConfig(Map<String, Object> anMap);
	
	/**
	 * 分页查询产品列表
	 * @param anMap
	 * @param anFlag
	 * @param anPageNum
	 * @param anPageSize
	 * @return
	 */
	String webQueryProductConfig(Map<String, Object> anMap, int anPageNum, int anPageSize , int anFlag);
	
	/**
	 * 根据产品编号查询产品
	 * @param productCode
	 * @return
	 */
	String webFindProductConfig(String productCode);
	
	/**
	 * 保存产品资产类型关联的附件类型关系
	 * @param anMap
	 * @return
	 */
	String webAddAssetDictAttachRelation(Map<String, Object> anMap);
	
	/**
	 * 查询资产类型与附件关系列表
	 * @param anMap
	 * @param anFlag
	 * @param anPageNum
	 * @param anPageSize
	 * @return
	 */
	String webFindAssetDictAttachRelationList(Map<String, Object> anMap);
	
	/**
	 * 保存产品与核心企业关系
	 * @param anMap
	 * @return
	 */
	String webAddProductCoreRelation(String anProductCode, String anCustNo);
	
	/**
	 * 查询资产类型
	 * @return
	 */
	String webFindAssetDict(Long factorNo);

	String webSaveModifyProductConfig(Map<String, Object> anMap, Long anId);

	String webFindAssetDictByProduct(String anProductCode);

	String webQueryCoreByProduct(String productCode, int anPageNum, int anPageSize , int anFlag);

	/**
	 * 保存产品与资产类型关系表
	 * @param anProductCode
	 * @param anId
	 * @return
	 */
	String webAddProductAssetDictRelation(String anProductCode, String anId);

	String webQueryAssetDict(Long factorNo, int anFlag, int anPageNum, int anPageSize);

	String webDelProductConfig(Long id);

	/**
	 * 
	 * @param coreCustNo
	 * @param anFactorNo
	 * @return
	 */
	String webQueryProductKeyAndValue(Long coreCustNo, Long anFactorNo);

	/**
	 * 查询该产品关联的核心企业列表
	 * @param anProductCode
	 * @return
	 */
	String webFindCoreByProductList(String anProductCode);

}

