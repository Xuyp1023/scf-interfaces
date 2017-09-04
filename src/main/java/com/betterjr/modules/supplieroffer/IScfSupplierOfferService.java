package com.betterjr.modules.supplieroffer;

import java.util.Map;

public interface IScfSupplierOfferService {
    
    /**
     * 新增新增供应商利率
     */
    public String webSaveAddOffer(Map<String, Object> anMap);
    
    
    /**
     * 供应商利率信息编辑
     */
    public String webSaveUpdateOffer(Long anCustNo,Long anCoreCustNo,double anCoreCustRate);
    
    
    /**
     * 供应商利率信息查询
     */
    public String webFindOffer(Long anCustNo,Long anCoreCustNo);
    
    
    /**
     * 查询所有已经设置了利率的供应商id集合
     */
    public String webQueryAllCust(Long anCoreCustNo);
    
    /**
     * 供应商利率信息查询
     */
    public String webFindOffer(Long anId);
    
    
    /**
     * 供应商利率分页查询
     */
    public String webQueryOfferPage (Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

    /**
     * 查询结算中心
     * @param anId
     * @return
     */
    public String webQueryAllFactoryByCustNo(Long anId);
}
