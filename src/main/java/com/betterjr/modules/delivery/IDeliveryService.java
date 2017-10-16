package com.betterjr.modules.delivery;

import java.util.Map;

public interface IDeliveryService {

    String webQueryFileList(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize,
            boolean anIsPostCust);

    String webFindDeliveryRecord(String anRefNo);

    String webAddDeliveryRecord(Map anParamMap);

    String webSaveDeleteStatement(Long anStatementId);

    String webSaveExpressDelivery(String anRefNo, String anDescription);

    String webSaveConfirmDelivery(String anRefNo);

    String webQueryMonthlyRecordList(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize);

    String webSaveDeleteRecord(Long anRecordId);

}
