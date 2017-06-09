package com.betterjr.modules.loan;

import java.util.Map;

public interface IScfRequestTempService {
	String webAddRequestTemp(Map<String, Object> anMap);
	
	String webSaveModifyRequestTemp(Map<String, Object> anMap, String anRequestNo);

	String webQueryRequestTempList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);
}
