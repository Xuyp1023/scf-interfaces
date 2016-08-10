package com.betterjr.modules.loan;

import java.math.BigDecimal;
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

    /**
     * 融资详情
     * @param anMap
     * @param anRequestNo
     * @return
     */
    String webFindRequestDetail(Map<String, Object> anMap, String anRequestNo);

    /**
     * 查询融资审批详情
     * @param anRequestNo
     * @param anFactorNo
     * @return
     */
    String webFindSchemeDetail(String anRequestNo);

    /**
     * 修改融资审批
     * @param anMap
     * @param anId
     * @return
     */
    String webSaveModifyScheme(Map<String, Object> anMap);

    /**
     * 分页查询融资审批
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQuerySchemeList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 审批申请
     * @param anMap
     * @return
     */
    String webApproveRequest(String anRequestNo, String anApprovalResult, String anReturnNode, String anDescription, String tradeStatus);

    /**
     * 融资企业-确认融资方案
     * @param anRequestNo
     * @param anBusinStatus
     * @return
     */
    String webConfirmScheme(String anRequestNo, String anBusinStatus);

    /**
     * 资方--签约-发起贸易背景确认-发送债权转让通知书
     * @param anRequestNo
     * @return
     */
    String webRequestTradingBackgrand(String anRequestNo, String anAduitStatus, String anReturnNode, String anDescription);

    /**
     * 核心企业确认债权转上，签订转让协议
     * @param anRequestNo
     * @param anAduit
     * @return
     */
    String webConfirmTradingBackgrand(String anRequestNo, String anBusinStatus);

    /**
     * 出具贷款方案
     * @param anMap
     * @param anApprovalResult 审批结果
     * @param anReturnNode     打回节点
     * @param anDescription    备注
     * @return
     */
    String webOfferScheme(Map<String, Object> anMap, String anApprovalResult, String anReturnNode, String anDescription);

    /**
     * 保理公司-放款确认
     * @param anMap
     * @param anApprovalResult 审批结果
     * @param anReturnNode     打回节点
     * @param anDescription    备注
     * @return
     */
    String webConfirmLoan(Map<String, Object> anMap, String anApprovalResult, String anReturnNode, String anDescription);

    /**
     * 计算手续费
     * @param anRequestNo
     * @param loanBalance
     * @return
     */
    String webCalculatServiecFee(String anRequestNo, BigDecimal loanBalance);

    /**
     * 计算结束日期
     * @param anRequestNo
     * @param startDate
     * @return
     */
    String webCalculatEndDate(String anRequestNo, String startDate);

    /**
     * 计算利息 和管理费
     * @param anRequestNo
     * @param loanBalance
     * @return
     */
    String webCalculatInsterest(String anRequestNo, BigDecimal loanBalance);



}
