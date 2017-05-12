package com.betterjr.modules.commissionfile;

import java.util.Map;

public interface ICommissionFileDownService {
    
    String webQueryFileDownList(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize);

}
