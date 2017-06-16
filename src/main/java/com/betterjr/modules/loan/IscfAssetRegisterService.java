package com.betterjr.modules.loan;

import java.util.Map;

/**
 * 中登网，资产登记与资产检查相关接口
 * @author hewei
 *
 */
public interface IscfAssetRegisterService {
    
    /**
     * 新增资产登记
     * @param anMap
     * @return
     */
    String webAddAssetRegister(Map<String, Object> anMap, String anFileList);

    /**
     * 查询资产登记
     * @param anRequestNo
     * @return
     */
    String webFindAssetRegister(String anRequestNo);
	
    /**
     * 新增资产检查
     * @param anMap
     * @return
     */
    String webAddAssetCheck(Map<String, Object> anMap, String anFileList);

    /**
     * 查询资产检查
     * @param anRequestNo
     * @return
     */
    String webFindAssetCheck(String anRequestNo);

}
