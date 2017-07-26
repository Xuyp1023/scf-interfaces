package com.betterjr.modules.commissionfile;

import java.util.Map;

public interface ICommissionParamService {
    
    String webSaveAddParam(Map anParamMap);

    String webQueryParamList(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize);

    String webSaveUpdateParam(Map anParamMap);
    
    String webSaveDeleteParam(Long anParamId);

    String webFindParamByCustNo(Long anCustNo,Long anCoreCustNo);


}
