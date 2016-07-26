package com.betterjr.modules.order;

import java.util.Map;

public interface IScfTransportService {
    
    /**
     * 订单运输单据录入
     */
    public String webAddTransport(Map<String, Object> anMap, String anFileList);

    /**
     * 订单运输单据查询
     */
    public String webQueryTransportList(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

}
