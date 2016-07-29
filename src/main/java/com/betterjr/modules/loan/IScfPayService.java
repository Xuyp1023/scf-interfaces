package com.betterjr.modules.loan;

import java.util.Map;

public interface IScfPayService {

    /**
     * 查询还款计划列表
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryPayPlanList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 添加还款计划
     * @param anMap
     * @return
     */
    String webAddPayPlan(Map<String, Object> anMap);

    /**
     * 修改还款计划
     * @param anMap
     * @param id
     * @return
     */
    String webSaveModifyPayPlan(Map<String, Object> anMap, Long id);

    /**
     * 查询还款计划详情
     * @param anMap
     * @param id
     * @return
     */
    String webFindPayPlanDetail(Map<String, Object> anMap, Long id);

}
