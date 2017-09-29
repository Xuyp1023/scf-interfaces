package com.betterjr.modules.acceptbill;

import java.util.Map;

public interface IScfAcceptBillService {

    public String webQueryAcceptBill(Map<String, Object> anMap, String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize);

    public String webSaveModifyAcceptBill(Map<String, Object> anMap, Long anId, String anFileList, String anOtherFileList);

    public String webSaveModifyAcceptBillDO(Map<String, Object> anMap, String anFileList, boolean anConfirmFlag);

    public String webFindAcceptBillList(Map<String, Object> anMap, String anIsOnlyNormal);

    public String webAddAcceptBill(Map<String, Object> anMap, String anFileList, String anOtherFileList);

    public String webAddAcceptBillDO(Map<String, Object> anMap, String anFileList, boolean confirmFlag);

    public String webSaveAduitAcceptBill(Long anId);

    public String webFindAllFile(Long anId);

    public String webQueryFinancedByFactor(Map<String, Object> anMap, Long anFactorNo);

    public String webFindAcceptBillDetailsById(Long anId);

    public String webSaveSingleFileLink(Long anId, Long anFileId);

    public String webFindAcceptBillListByCustNo(String anCustNo);

    public String findAcceptBillStatusById(Long anBillId);

    /***
     * 保存票据附件
     * 
     * @param id
     *            票据id
     * @param fileTypeName
     *            文件类型名称
     * @param fileMediaId
     *            文件
     * @return
     */
    public String webSaveBillFile(Long anBillId, String anFileTypeName, String anFileMediaId);

    public String webSaveAnnulAcceptBill(String anRefNo, String anVersion);

    public String webSaveCoreCustAnnulBill(String anRefNo, String anVersion);

    public String webFindAcceptBillDOByRefNoVersion(String anRefNo, String anVersion);

    public String webSaveAuditBillDOByRefNoVersion(String anRefNo, String anVersion);

    public String webQueryIneffectiveAcceptBill(Map<String, Object> anAnMap, String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize,
            boolean anIsAudit);

    public String webQueryEffectiveAcceptBill(Map<String, Object> anAnMap, String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize,
            boolean anIsCust);

    public String webQueryCanAnnulAcceptBill(Map<String, Object> anAnMap, String anIsOnlyNormal, String anFlag, int anPageNum, int anPageSize);

    public String webSaveModifyAcceptBillFile(String anFileList, String anRefNo, String anVersion);

}
