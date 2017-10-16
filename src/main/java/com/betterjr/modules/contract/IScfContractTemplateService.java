package com.betterjr.modules.contract;

import java.util.Map;

/**
 * 提供合同模板管理相关接口
 * @author tangzw
 *
 */
public interface IScfContractTemplateService {

    /**
     * 根据ID查询合同模板
     * @param anId
     * @return
     */
    String webFindTemplate(Long anId);

    /**
     * 根据保理公司编号和合同类型查询合同模板
     * @param anFactorNo
     * @param anType
     * @return
     */
    String webFindTemplateByType(Long anFactorNo, String anType);

    /**
     * 查询合同列表
     * @param anParam
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryTemplate(Map<String, Object> anParam, int anFlag, int anPageNum, int anPageSize);

    /**
     * 保存合同模板
     * @param anParam
     * @return
     */
    String webSaveTemplate(Map<String, Object> anParam);

    /**
     * 修改合同模板
     * @param anParam
     * @param id
     * @return
     */
    String webSaveModifyTemplate(Map<String, Object> anParam, Long id);

}
