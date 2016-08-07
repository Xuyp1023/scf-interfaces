package com.betterjr.modules.order;

import java.util.Map;

public interface IScfOrderRelationService {
    /**
     * 订单关联关系增加
     */
    public String webAddOrderRelation(Map<String, Object> anMap, String anInfoIdList);
    
    /**
     * 订单关联关系删除
     */
    public String webSaveDeleteOrderRelation(Long anId);

}
