package com.betterjr.modules.loan;

import java.util.Map;

public interface IScfRequestService {

    /**
     * 查询融资申请列表
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryRequestList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 添加融资申请
     * @param anMap
     * @return
     */
    String webAddRequest(Map<String, Object> anMap);

    /**
     * 保存融资申请
     * @param anMap
     * @param anRequestNo
     * @return
     */
    String webSaveModifyRequest(Map<String, Object> anMap, String anRequestNo);

    String webFindRequestDetail(Map<String, Object> anMap, String anRequestNo);


}
