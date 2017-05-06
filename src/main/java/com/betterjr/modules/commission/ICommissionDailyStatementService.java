package com.betterjr.modules.commission;

import java.util.Map;

/***
 * 日报表的接口服务类
 * @author hubl
 *
 */

public interface ICommissionDailyStatementService {
    
    /***
     * 分页查询
     * @param anParam
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryDailyStatement(Map<String, Object> anParam, int anPageNum, int anPageSize);
    
    /***
     * 查询统计日账单的累计月总数
     * @param anMonth  对账月份
     * @param anCustNo 对账企业客户号
     * @return
     */
    public String webFindDailyStatementCount(String anMonth,Long anCustNo);
    
    /***
     * 查询日账单的列表基础信息
     * @param anParam 
     * @return
     */
    public String webFindDailyStatementBasicsInfo(Map<String,Object> anParam);

    /***
     * 更新日报表状态
     * @param anDailyStatementId
     * @param anBusinStatus
     * @return
     */
    public String webUpdateDailyStatement(Long anDailyStatementId,String anBusinStatus);
    
    /***
     * 删除日报表
     * @param anDailyStatementId
     * @return
     */
    public String webDelDailyStatement(Long anDailyStatementId);
    
}
