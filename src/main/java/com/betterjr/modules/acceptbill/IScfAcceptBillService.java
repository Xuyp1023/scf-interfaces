package com.betterjr.modules.acceptbill;

import java.util.Map;

public interface IScfAcceptBillService {

    public String webQueryAcceptBill(Map<String, Object> anMap, String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize);

    public String webSaveModifyAcceptBill(Map<String, Object> anMap, Long anId, String anFileList);

}
