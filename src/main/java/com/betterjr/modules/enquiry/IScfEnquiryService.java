package com.betterjr.modules.enquiry;

import java.util.Map;

public interface IScfEnquiryService {
    
    /**
     * 查询询价列表
     */
    public String webQueryEnquiryList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 新增询价
     */
    public String webAddEnquiry(Map<String, Object> anMap);

    /**
     * 查询询价详情
     */
    public String webFindEnquiryDetail(Long anId);
    
    /**
     * 修改询价
     */
    public String webSaveModifyEnquiry(Map<String, Object> anMap, Long anId);
    
    /**
     * 查询报价列表
     */
    public String webQueryOfferList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 新增报价
     */
    public String webAddOffer(Map<String, Object> anMap);
    
    /**
     * 修改报价
     */
    public String webSaveModifyOffer(Map<String, Object> anMap, Long anId);

    /**
     * 查询报价详情
     */
    public String webFindOfferDetail(Long anId);
    
}
