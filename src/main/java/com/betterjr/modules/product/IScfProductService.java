package com.betterjr.modules.product;

public interface IScfProductService {

    /**
     * 融资产品下拉列表查询
     * 
     * @param anCoreCustNo
     * @param anFactorNo
     * @return
     */
    public String webQueryProductKeyAndValue(Long anCoreCustNo, Long anFactorNo);

}
