package com.betterjr.modules.delivery;

import java.util.Map;

public interface IDeliveryStatementService {

    String webQueryStatementList(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize);

}
