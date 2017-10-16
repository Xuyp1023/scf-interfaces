package com.betterjr.modules.approval;

import java.util.Map;

public interface IScfReceApprovalFlowDubboService {

    /**
     * 申请
     * @param anContext
     * @return
     */
    Map<String, Object> application(Map<String, Object> anContext);

    /**
     * 申请审核
     * @param anContext
     * @param resultType 1：通过
     * @return
     */
    Map<String, Object> applicationReview(Map<String, Object> anContext, int resultType);

    /**
     * 受理申请
     * @param anContext
     * @return
     */
    Map<String, Object> applictionAccept(Map<String, Object> anContext);

    /**
     * 风近审批
     * @param anContext
     * @param resultType  1：通过
     * @return
     */
    Map<String, Object> riskControl(Map<String, Object> anContext, int resultType);

    /**
     * 融资方案批复
     * @param anContext
     * @return
     */
    Map<String, Object> schemeReply(Map<String, Object> anContext);

    /**
     * 融资方案审核
     * @param anContext
     * @param resultType 1：通过
     * @return
     */
    Map<String, Object> schemeReview(Map<String, Object> anContext, int resultType);

    /**
     * 融资方案确认
     * @param anContext
     * @param resultType 1：通过
     * @return
     */
    Map<String, Object> schemeConfirm(Map<String, Object> anContext, int resultType);

    /**
     * 融资背景确认
     * @param anContext
     * @param resultType 1：通过
     * @return
     */
    Map<String, Object> confirmTradingBackgrand(Map<String, Object> anContext, int resultType);

    /**
     * 发起签约
     * @param anContext
     * @return
     */
    Map<String, Object> signInitiate(Map<String, Object> anContext);

    /**
     * 签约审核
     * @param anContext
     * @param resultType 1：通过
     * @return
     */
    Map<String, Object> signReview(Map<String, Object> anContext, int resultType);

    /**
     * 签约
     * @param anContext
     * @return
     */
    Map<String, Object> sign(Map<String, Object> anContext);

    /**
     * 资产登记
     * @param anContext
     * @return
     */
    Map<String, Object> registerAsset(Map<String, Object> anContext);

    /**
     * 放款审批
     * @param anContext
     * @param resultType 1：通过
     * @return
     */
    Map<String, Object> loanReview(Map<String, Object> anContext, int resultType);

    /**
     * 流程结束
     * @param anContext
     * @param resultType 1：通过
     * @return
     */
    void endFlow(Map<String, Object> parmMap, int resultType);

}
