package com.betterjr.modules.approval;

import java.util.Map;

/**
 * 经销商融资申请
 * @author tangzw
 *
 */
public interface IScfSellerApprovalService {

    /**
     * 融资申请
     * @param anContext
     */
    Map<String, Object> application(Map<String, Object> anContext);

    /**
     *  出具保理方案
     * @param anContext
     * @param resultType
     */
    Map<String, Object> offerScheme(Map<String, Object> anContext, int resultType);

    /**
     *  确认保理方案
     * @param anContext
     * @param resultType
     */
    void confirmScheme(Map<String, Object> anContext, int resultType);

    /**
     * 发起贸易背景确认
     * @param anContext
     * @param resultType
     */
    void requestTradingBackgrand(Map<String, Object> anContext, int resultType);

    /**
     * 确认贸易背景
     * @param anContext
     * @param resultType
     */
    void confirmTradingBackgrand(Map<String, Object> anContext, int resultType);

    /**
     * 确认放款
     * @param anContext
     * @param resultType
     */
    void confirmLoan(Map<String, Object> anContext, int resultType);

    /**
     *   结束流程
     * @param anContext
     * @param resultType
     */
    void endFlow(Map<String, Object> anContext, int resultType);

    /**
     * 融资失败时-回滚所有融资数据
     * @param anRequestNo
     */
    void releaseSource(String anRequestNo);

}
