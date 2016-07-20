package com.betterjr.modules.product;

import java.util.Map;

public interface IScfProductService {

    /**
     * 融资产品信息分页查询
     * 
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryProduct(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

    /**
     * 融资产品下拉列表查询
     * 
     * @param anCoreCustNo
     * @param anFactorNo
     * @return
     */
    public String webQueryProductKeyAndValue(Long anCoreCustNo, Long anFactorNo);

    /**
     * 融资产品录入
     * 
     * @param anMap
     * @return
     */
    public String webAddProduct(Map<String, Object> anMap);

    /**
     * 融资产品修改
     * 
     * @param anMap
     * @param anId
     * @return
     */
    public String webSaveModifyProduct(Map<String, Object> anMap);

}
