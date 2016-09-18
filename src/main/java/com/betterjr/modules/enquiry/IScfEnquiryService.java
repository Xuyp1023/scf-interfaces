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
     * @param factorNo
     * @param enquiryNo
     * @return
     */
    public String webFindOfferDetail(Long factorNo, String enquiryNo);

    /**
     * 查询保理公司收到的询价
     * @param anMap
     * @param factorNo
     * @return
     */
    String webQueryEnquiryByfactorNo(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 新增报价回复
     * @param anMap
     * @param anId
     * @return
     */
    String webAddOfferReply(Map<String, Object> anMap);

    /**
     * 修改报价回复
     * @param anMap
     * @param anId
     * @return
     */
    String webSaveModifyOfferReply(Map<String, Object> anMap, Long anId);

    /**
     * 查询报价回复
     * @param anMap
     * @param anId
     * @return
     */
    String webQueryOfferReply(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 资金方-放弃报价
     * @param anEnquiryNo
     * @param anFactorNo
     * @return
     */
    String webFactorDropOffer(String anEnquiryNo, Long anFactorNo);
    
    /**
     * 查看有哪些公司报了价
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryOfferByFactor(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);
    
    /**
     * 票据版查询
     * @param custNo
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQuerySingleOrderEnquiryList(Long custNo, int anFlag, int anPageNum, int anPageSize);
    /**
     *  票据版查询
     * @param anId 询价id
     * @return
     */
    String webFindSingleOrderEnquiryDetail(Long anId);

    /**
     * 询价企业放弃 某个保理公司的报价
     * @param anEnquiryNo
     * @param anFactorNo
     * @return
     */
    String webCustDropOffer(String anEnquiryNo, Long anFactorNo);

    /**
     * 询价企业放询价
     * @param map
     * @return
     */
    String webCustDropEnquiry(Long enquiryId, String dropReason, String description);

}
