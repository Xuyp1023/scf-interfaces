package com.betterjr.modules.product;

import java.util.Map;

public interface IScfProductService {

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

}
