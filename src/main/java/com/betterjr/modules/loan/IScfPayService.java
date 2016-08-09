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

    /**
     * 还款记录-分页查询
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryPayRecordList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 还款记录-修改
     * @param anMap
     * @param id
     * @return
     */
    String webSaveModifyPayRecord(Map<String, Object> anMap, Long id);

    /**
     * 还款记录-详情
     * @param anMap
     * @param id
     * @return
     */
    String webFindPayRecordDetail(Map<String, Object> anMap, Long id);

    /**
     * 还款分配记录-分页查询
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryRecordDetailList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 还款分配记录-修改
     * @param anMap
     * @param id
     * @return
     */
    String webSaveModifyRecordDetail(Map<String, Object> anMap, Long id);

    /**
     * 还款分配记录-详情
     * @param anMap
     * @param id
     * @return
     */
    String webFindRecordDetail(Map<String, Object> anMap, Long id);

}
