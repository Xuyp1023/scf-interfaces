package com.betterjr.modules.order;

import java.util.Map;

public interface IScfOrderService {
    /**
     * 订单信息编辑
     */
    public String webSaveModifyOrder(Map<String, Object> anMap, Long anId, String anFileList, String anOtherFileList);
    
    /**
     * 订单V3信息编辑
     */
    public String webSaveModifyOrderDO(Map<String, Object> anMap, String anFileList, boolean confirmFlag);
    
    /**
     * 订单信息分页查询
     */
    public String webQueryOrder(Map<String, Object> anMap,String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize);
  
    /**
     * 订单信息分页查询
     */
    public String webQueryOrderDO (Map<String, Object> anMap,String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize);
    
    /**
     * 订单未生效信息分页查询
     */
    public String webQueryIneffectiveOrderDO (Map<String, Object> anMap,String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize,boolean anIsAudit);
    
    /**
     * 订单已生效信息分页查询
     */
    public String webQueryEffectiveOrderDO (Map<String, Object> anMap,String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize,boolean anIsCust);

    /**
     * 订单信息无分页查询
     */
    public String webFindOrderList(Map<String, Object> anMap, String anIsOnlyNormal);

    /**
     * 通过融资申请查询相关信息
     */
    public String webFindInfoListByRequest(String anRequestNo, String anRequestType);
    
    /**
     * 新增订单信息
     */
    public String webAddOrder(Map<String, Object> anMap, String anFileList, String anOtherFileList);
    
    /**
     * 新增订单V3信息
     */
    public String webAddOrderDO(Map<String, Object> anMap, String anFileList,boolean confirmFlag);
    
    /**
     * 检查订单下发票所关联订单是否勾选完成
     */
    public String webCheckCompleteInvoice(String anRequestType, String anIdList);

    /**
     * 根据融资编号查询基本信息的所有附件
     */
    public String webFindRequestBaseInfoFileList(String anRequestNo);

    /**
     * 根据Id查看订单详情
     */
    public String webFindOrderDetailsById(Long anId);

    /**
     * 检查业务所需信息是否完成--贸易合同、发票
     * 1:订单，2:票据;3:应收款;
     */
    public String webCheckInfoCompleted(String anIdList, String anRequestType);

    
    /**
     * 查出贸易合同不为1,未启用的贸易合同名称
     */
    public String webCheckAgreementStatus(Long anAcceptBillId);

	String webFindSubjectMaster(String anId, String anType);

	/**
	 * 根据资料id和资料类型查询融资实体
	 * @param anInfoId
	 * @param anInfoType
	 * @return
	 */
	String webFindRequestByInfoId(Long anInfoId, String anInfoType);

	/**
	 * 根据标的物查询核心企业编号
	 * @param anId
	 * @param anType
	 * @return
	 */
	String webFindCoreCustNo(String anId, String anType);

    public String webQueryCanAnnulOrder(Map<String, Object> anAnMap, String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize);

    public String webSaveAnnulOrder(String anRefNo, String anVersion);

    public String webSaveAuditOrderByRefNoVersion(String anRefNo, String anVersion);

    public String webQueryIneffectiveOrder(Map<String, Object> anAnMap, String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize,
            boolean anIsAudit);

    public String webQueryEffectiveOrder(Map<String, Object> anAnMap, String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize,
            boolean anIsCust);

    public String webfindOrderDetail(String anRefNo, String anVersion);

    public String webQueryExportOrderRecordList(Long anResolveFileid, String anFlag, int anPageNum, int anPageSize);

    public String webSaveResolveFile(Map<String, Object> anAnMap);
    
    public String webSaveAuditOrderByOrderIds(String ids) ;
}
