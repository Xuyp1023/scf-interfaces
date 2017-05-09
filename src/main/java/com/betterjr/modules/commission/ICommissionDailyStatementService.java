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
     * 根据对账月份查询日账单列表
     * @param anMonth 对账月份
     * @param anCustNo 对账企业
     * @return
     */
    public String webFindDailyStatementInfoByMonth(String anMonth, Long anCustNo);
    
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
    
    /***
     * 查询佣金支付统计数据
     * @param anPayDate
     * @param anOwnCustNo
     * @return
     */
    public String webFindPayResultCount(String anPayDate,Long anOwnCustNo);
    
    /***
     * 分页查询支付记录
     * @param anOwnCustNo
     * @param anPayDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryPayResultRecord(Long anOwnCustNo,String anPayDate,int anFlag, int anPageNum, int anPageSize);
    
    /***
     * 根据支付日期查询佣金支付记录
     * @param anPayDate
     * @param anOwnCustNo
     * @return
     */
    public String webFindPayResultInfo(String anPayDate,Long anOwnCustNo);
    
    /***
     * 添加日账单信息
     * @param anDailyRefNo
     * @param anPayDate
     * @param anOwnCustNo
     * @return
     */
    public String webSaveDailyStatement(String anDailyRefNo,String anPayDate,Long anOwnCustNo);
    
    /***
     * 查询日账单详情
     * @param anDailyStatementId
     * @return
     */
    public String webFindDailyStatementById(Long anDailyStatementId);

    /***
     * 根据ID查询日账单记录
     * @param anDailyStatementId
     * @param anPageNum
     * @param anPageSize
     * @param anFlag
     * @return
     */
    public String webQueryDailyStatementRecordById(Long anDailyStatementId,int anPageNum,int anPageSize,String anFlag);
}
