package com.betterjr.modules.commissionfile;

import java.util.Map;

public interface ICommissionInvoiceCustInfoService {

    String webSaveAddInvoiceCustInfo(Map anParamMap);

    String webQueryInvoiceCustInfoList(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize);

    String webSaveUpdateInvoiceCustInfo(Map anParamMap);

    String webSaveDeleteCustInfo(Long anCustInfoId);

    String webFindInvoiceCustInfoEffectiveByCustNo(Long anCustNo, Long anCoreCustNo);

}
