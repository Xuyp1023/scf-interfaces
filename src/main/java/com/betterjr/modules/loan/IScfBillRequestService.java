package com.betterjr.modules.loan;

import java.util.Map;

public interface IScfBillRequestService {

    String webAddBillRequest(Map<String, Object> anMap);

    String webQueryBillRequestList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 从报价的列表-进入申请界面（带出报价相关数据）
     * @param anId
     * @return
     */
    String webToRequest(String anId);

   /**
    * 修改票据申请的融资状态
    * @param anRequestNo
    * @param anTradeStatus
    * @return
    */
    String updateRequestTradeStauts(String anRequestNo, String anTradeStatus);


}
