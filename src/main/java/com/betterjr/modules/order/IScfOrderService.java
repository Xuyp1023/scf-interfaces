package com.betterjr.modules.order;

import java.util.Map;

public interface IScfOrderService {
    /**
     * 订单信息编辑
     */
    public String webSaveModifyOrder(Map<String, Object> anMap, Long anId, String anFileList, String anOtherFileList);
    
    /**
     * 订单信息分页查询
     */
    public String webQueryOrder(Map<String, Object> anMap,String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize);

    /**
     * 订单信息无分页查询
     */
    public String webFindOrderList(String anCustNo, String anIsOnlyNormal);

    /**
     * 通过融资申请查询相关信息
     */
    public String webFindInfoListByRequest(String anRequestNo, String anRequestType);
}
