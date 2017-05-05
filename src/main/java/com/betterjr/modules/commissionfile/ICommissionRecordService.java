package com.betterjr.modules.commissionfile;

import java.util.Map;

public interface ICommissionRecordService {

    String webQueryRecordList(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize);

    String webSaveAuditRecordList(Long anCustNo, String anImportDate);

}
