package com.betterjr.modules.asset;

import java.util.Map;

public interface IScfAssetService {
    
    //public String webAddAsset(Map<String, Object> anMap);
    /**
     * 查询资产列表
     */
    public String webFindAsset(Map<String, Object> anMap);

    public String webQueryCanUseBaseData(Long anCustNo,Long anCoreCustNo, String anDataType, String anIds, int anPageNum, int anPageSize, String anFlag);

    public String webFindAssetById(Long anAssetId);
    
    public String webSaveRejectOrBreakAsset(Long anAssetId);
    
    public String webSaveAssignmentAssetToFactory(Long anAssetId);


}
