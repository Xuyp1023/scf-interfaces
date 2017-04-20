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

    /**
     * 发票信息删除
     */
    public String webSaveDeleteInvoice(Long anId);
    
    /**
     * 查询出具保理方案下的发票,用于完善资料
     */
    public String webQueryIncompletedInvoice(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

    public String webAddInvoiceDO(Map<String, Object> anAnMap, String anFileList, boolean anConfirmFlag);

    public String webSaveModifyInvoiceDO(Map<String, Object> anAnMap, String anFileList, boolean anConfirmFlag);

    public String webSaveAnnulInvoice(String anRefNo, String anVersion);

    public String webSaveAuditInvoiceByRefNoVersion(String anRefNo, String anVersion);

    public String webQueryIneffectiveInvoice(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize, boolean anIsAudit);

    public String webQueryEffectiveInvoice(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize, boolean anIsCust);

    public String webFindInvoiceDO(String anRefNo, String anVersion);

    public String webQueryRecycleInvoice(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize);

    public String webSaveAnnulEffectiveInvoice(String anRefNo, String anVersion);
}
