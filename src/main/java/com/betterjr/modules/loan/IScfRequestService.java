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

    /**
     * 融资详情
     * @param anMap
     * @param anRequestNo
     * @return
     */
    String webFindRequestDetail(Map<String, Object> anMap, String anRequestNo);

    /**
     * 出具贷款方案
     * @param anMap
     * @return
     */
    String webOfferScheme(Map<String, Object> anMap);

    /**
     * 查询融资审批详情
     * @param anRequestNo
     * @param anFactorNo
     * @return
     */
    String webFindApprovedDetail(String anRequestNo);

    /**
     * 修改融资审批
     * @param anMap
     * @param anId
     * @return
     */
    String webSaveModifyApproved(Map<String, Object> anMap);

    /**
     * 分页查询融资审批
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryApprovedList(Map<String, Object> anMap, int anFlag, int anPageNum, int anPageSize);

    /**
     * 审批申请
     * @param anMap
     * @return
     */
    String webApproveRequest(Map<String, Object> anMap);

    /**
     * 融资企业-确认融资方案
     * @param anRequestNo
     * @param anAduit
     * @return
     */
    String webConfirmScheme(String anRequestNo, String anBusinStatus);

    /**
     * 资方发起贸易背景确认-发送债权转让通知书
     * @param anRequestNo
     * @return
     */
    String webRequestTradingBackgrand(String anRequestNo);

    /**
     * 核心企业确认债权转上，签订转让协议
     * @param anRequestNo
     * @param anAduit
     * @return
     */
    String webConfirmTradingBackgrand(String anRequestNo, String anBusinStatus);



}
