package com.betterjr.modules.commissionfile;

import java.util.Map;

public interface ICommissionInvoiceService {

    /**
     * 发票新增索取
     * 
     * @param anCustNo
     *            平台Id
     * @param anCoreCustNo
     *            核心企业Id
     * @param anMonthlyIds
     *            月对账单Id集合
     * @param anInvoiceType
     *            发票类型 0 普通发票 1 专用发票
     * @return
     */
    String webSaveDemandInvoice(Long anCustNo, Long anCoreCustNo, String anMonthlyIds, String anInvoiceType);

    /**
     * 索取发票之后提交发票信息 是发票正式生效
     * 
     * @param anInvoiceId
     * @param anInvoiceContent
     * @param anDescription
     * @return
     */
    String webSaveInvoiceEffective(Long anInvoiceId, String anInvoiceContent, String anDescription);

    /**
     * 将未确认的票据作废
     * 
     * @param anInvoiceId
     * @return
     */
    String webSaveAnnulInvoice(Long anInvoiceId);

    /**
     * 待开票的发票变成开票中的发票
     * 
     * @param anInvoiceId
     * @return
     */
    String webSaveConfirmInvoice(Long anInvoiceId);

    /**
     * 发票维护详细信息 id invoiceNo invoiceCode invoiceDate description drawer 出票人
     * 
     * @param anInvoice
     * @param anFileList
     * @return
     */
    String webSaveAuditInvoice(Map anParamMap, String anFileList);

    /**
     * 查询发票信息 businStatus 状态 GTEregDate 申请日期 LTEregDate 申请日期 custNo 平台id coreCustNo 发票抬头企业
     * 
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @param anIsConfirm
     *            是否是用来确认页面的查询 true 是确认页面的查询 false 发票申请页面的查询
     * @return
     */
    String webQueryCommissionInvoice(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize, boolean anIsConfirm);

    /**
     * 查询发票详情信息
     * 
     * @param anInvoiceId
     * @return
     */
    String webFindCommissionInvoiceById(Long anInvoiceId);

    String webQueryCanUseMonthly(Map<String, Object> anMap, int anPageNum, int anPageSize);
}
