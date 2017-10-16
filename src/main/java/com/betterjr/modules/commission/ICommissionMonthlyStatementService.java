package com.betterjr.modules.commission;

import java.util.Map;

public interface ICommissionMonthlyStatementService {

    /***
     * 保存月报表信息
     * @param anParam
     * @return
     */
    public String webSaveComissionMonthlyStatement(Map<String, Object> anParam);

    /***
     * 分页查询
     * @param anParam
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryMonthlyStatement(Map<String, Object> anParam, int anPageNum, int anPageSize);

    /***
     * ID查询详情
     * @param anMonthlyId
     * @return
     */
    public String webFindMonthlyStatementById(Long anMonthlyId);

    /***
     * 更新状态
     * @param anMonthlyId
     * @param anBusinStatus
     * @return
     */
    public String webSaveMonthlyStatement(Long anMonthlyId, String anBusinStatus);

    /***
     * 删除
     * @param anMonthlyId
     * @return
     */
    public String webDelMonthlyStatement(Long anMonthlyId);

}
