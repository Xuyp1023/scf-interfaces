package com.betterjr.modules.receivable;

import java.util.Map;

public interface IScfReceivableService {
    
    /**
     * 应收账款信息编辑
     */
    public String webSaveModifyReceivable(Map<String, Object> anMap, Long anId);

    /**
     * 应收张狂信息分页查询
     */
    public String webQueryReceivable(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

}
