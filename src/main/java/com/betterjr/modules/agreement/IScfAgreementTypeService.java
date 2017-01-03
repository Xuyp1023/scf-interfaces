package com.betterjr.modules.agreement;

import java.util.Map;

/**
 * 合同类型接口
 * @author wudy
 */
public interface IScfAgreementTypeService {

    /**
     * 分页查询已登记合同类型
     */
    public String webQueryRegisteredAgreementType(int anPageNum, int anPageSize, String anFlag);
    
    /**
     * 合同类型登记
     */
    public String webAddAgreementType(Map<String, Object> anMap);
    
    /**
     * 编辑合同类型
     */
    public String webSaveModifyAgreementType(Map<String, Object> anMap, Long anId);
    
    /**
     * 删除合同类型
     */
    public String webSaveDeleteAgreementType(Long anId);
    
    /**
     * 合同类型审核分页查询
     */
    public String webQueryUnEnableAgreementType(int anPageNum, int anPageSize, String anFlag);
    
    /**
     * 查询已启用合同类型
     */
    public String webFindEnableAgreementType();
    /**
     * 启用合同类型
     */
    public String webSaveEnableAgreementType(Long anId);
    
    /**
     * 合同类型分页查询
     */
    public String webQueryAgreementType(Map<String, Object> anMap, int anPageNum, int anPageSize, String anFlag);

}
