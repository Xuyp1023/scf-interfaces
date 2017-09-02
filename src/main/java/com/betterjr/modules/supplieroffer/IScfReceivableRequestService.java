package com.betterjr.modules.supplieroffer;

import java.util.Map;

public interface IScfReceivableRequestService {
    
    
    /*
     * 融资资产新增
     * 
     * receivableId 存放的是应收账款id
     */
    public String webSaveAddRequest(Map<String,Object> anParamMap);
    
    /*
     * 模式四融资资产新增
     * 
     * receivableId 存放的是应收账款id
     */
    public String webSaveAddRequestFour(Map<String,Object> anParamMap);
    
    /**
     * 模式4融资申请查询
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @param isCust
     * @return
     */
    public String webQueryReceivableRequestFour(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize,boolean isCust);
    
    /**
     * 模式四融资申请核心企业确认
     * @param anRequestNo
     * @return
     */
    public String webSaveConfirmReceivableRequestFour(String anRequestNo);
    
    /**
     * 模式四融资申请核心企业拒绝
     * @param anRequestNo
     * @return
     */
    public String webSaveRejectReceivableRequestFour(String anRequestNo);
    
    /**
     * 供应商提交申请融资信息  并且生成电子合同
     * @param anRequestNo
     * @param anRequestPayDate
     * @return
     */
    public String webSaveSubmitRequest(String anRequestNo,String anRequestPayDate,String anDescription);

    /**
     * 供应商签署合同（供应商和平台的两份合同）
     * @param anRequestNo
     * @return
     */
    public String webSaveSupplierSignAgreement(String anRequestNo);
    
    /**
     * 供应商签署合同之后提交信息给核心企业进行确认
     * @param anRequestNo
     * @param anRequestPayDate
     * @param anDescription
     * @return
     */
    public String webSaveSupplierFinishConfirmRequest(String anRequestNo,String anRequestPayDate,String anDescription);
    
    /**
     * 融资废止操作
     * @param anRequestNo
     * @return
     */
    public String webSaveAnnulReceivableRequest(String anRequestNo);
    
    /**
     * 核心企业签署合同
     * @param anRequestNo
     * @return
     */
    public String webSaveCoreSignAgreement(String anRequestNo);
    
    /**
     * 核心企业完成付款操作
     * @param anRequestNo
     * @param anRequestPayDate
     * @param anDescription
     * @return
     */
    public String webSaveCoreFinishPayRequest(String anRequestNo,String anRequestPayDate,String anDescription);
    
    /**
     * 查询单条融资信息
     * @param anRequestNo
     * @return
     */
    public String webFindOneByRequestNo(String anRequestNo);
    
    
    /**
     * 供应商查询还有那些融资申请可以再次提交
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryReceivableRequestWithSupplier(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 供应商查询已经完结的融资信息
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryFinishReceivableRequestWithSupplier(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 核心企业查询可以提交的融资信息
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryReceivableRequestWithCore(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 核心企业查询已经融资结束的所有的申请信息
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryFinishReceivableRequestWithCore(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 确定单个应付账款是否可以进行申请
     * @param anRequestNo
     * @return
     */
    public String webCheckVerifyReceivable(Long receivableId);
}
