package com.betterjr.modules.supplieroffer;

import java.util.Map;

public interface IScfAgreementTemplateService {
    
    /**
     * 新增合同模版
     * @param anMap
     * @param anIsOperator true是平台
     * @return
     */
    public String webSaveAddTemplate(Map<String, Object> anMap,boolean anIsOperator);
    
    
    /**
     * 合同模版的删除
     * @param anId
     * @return
     */
    public String webSaveDeleteTemplate(Long anId);
    
    /**
     * 合同模版的激活
     * @param anId
     * @return
     */
    public String webSaveActiveTemplate(Long anId);
    
    /**
     * 合同模版的查找，通过核心企业查找不同状态下的合同模版信息
     * @param anCoreCustNo
     * @param anBusinStatus
     * @return
     */
    public String webFindTemplateWithStatus(Long anCoreCustNo,String anBusinStatus);
    
    /**
     * 平台给每个核心企业生成Ftl类型模版并上传
     * @param anId
     * @param anFileId
     * @return
     */
    public String webSaveUploadFtlAgreement(Long anId,Long anFileId);
    
    /**
     * 平台删除合同的ftl模版
     * @param anId
     * @return
     */
    public String webSaveDeleteFtlAgreement(Long anId);
    
    /**
     * 查找当前公司可用的合同模版信息
     * @param anCoreCustNo
     * @return
     */
    public String webFindTemplate(Long anCoreCustNo);
    
    /**
     * 平台查询所有企业的合同模版信息
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryTemplatePage(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

}
