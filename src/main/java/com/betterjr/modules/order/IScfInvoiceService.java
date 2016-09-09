package com.betterjr.modules.order;

import java.util.Map;

public interface IScfInvoiceService {
    /**
     * 订单发票信息录入功能
     */
    public String webAddInvoice(Map<String, Object> anMap, String anInvoiceIds, String anFileList);

    /**
     *  订单发票分页查询 
     */
    public String webQueryInvoiceList(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 发票信息编辑
     */
    public String webSaveModifyInvoice(Map<String, Object> anMap, String anInvoiceIds, String anFileList);

    /**
     * 发票详情录入
     */
    public String webAddInvoiceItem(Map<String, Object> anMap);
}
