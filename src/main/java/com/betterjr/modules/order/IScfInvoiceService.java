package com.betterjr.modules.order;

import java.util.Map;

public interface IScfInvoiceService {
    /**
     * 订单发票信息录入功能
     */
    public String webAddInvoice(Map<String, Object> anMap, String anFileList);

}
