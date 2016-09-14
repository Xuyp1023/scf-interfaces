package com.betterjr.modules.acceptbill;

import java.util.Map;

public interface IScfAcceptBillService {

    public String webQueryAcceptBill(Map<String, Object> anMap, String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize);

    public String webSaveModifyAcceptBill(Map<String, Object> anMap, Long anId, String anFileList);

    public String webFindAcceptBillList(String anCustNo, String anIsOnlyNormal);

    public String webAddAcceptBill(Map<String, Object> anMap, String anFileList);

    public String webSaveAduitAcceptBill(Long anId);
    
    public String webFindAllFile(Long anId);

    public String webQueryFinancedByFactor(Map<String, Object> anMap, Long anFactorNo);
    
}
