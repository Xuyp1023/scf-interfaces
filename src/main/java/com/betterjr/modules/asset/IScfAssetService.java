package com.betterjr.modules.asset;

import java.util.Map;

public interface IScfAssetService {
    
    //public String webAddAsset(Map<String, Object> anMap);
    /**
     * 查询资产列表
     */
    public String webFindAsset(Map<String, Object> anMap);


}