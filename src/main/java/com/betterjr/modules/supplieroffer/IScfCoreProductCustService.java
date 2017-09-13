package com.betterjr.modules.supplieroffer;

public interface IScfCoreProductCustService {
    
    /**
     * 核心企业查询可用分配给供应商的保理产品
     * @param anCoreCustNo
     * @return
     */
    public String webQueryProductConfigByCore(Long anCustNo,Long anCoreCustNo);
    
    
    /**
     * 更新融资产品列表
     * @param anCustNo
     * @param anCoreCustNo
     * @param anProductCodes
     * @return
     */
    public String webSaveAddAndUpdateProduct(Long anCustNo,Long anCoreCustNo,String anProductCodes);

}
