package com.betterjr.modules.ledger;

import java.util.Map;

public interface IContractLedgerService {
    
    public String webQueryContractLedgerByPage(Map<String,Object> anMap,String anQueryType, int anPageNum, int anPageSize);
    
    public String webFindCustInfoByCustNo(Long anCustNo);
    
    public String webAddContractLedger(Map<String, Object> anMap, String anFileList);
    
    /***
     * 根据客户号，合同号查询合同客户信息
     * @param anCustNo
     * @return
     */
    public String webFindCustInfoByCustNoAndContractId(Long anCustNo,Long anContractId);
    
    /***
     * 根据合同编号查询合同信息
     * @param anContractId
     * @return
     */
    public String webFindContractLedgerByContractId(Long anContractId);
    

    /**
     * 根据批次号获取合同附件列表
     * 
     * @param anParam
     * @return
     */
    public String webFindCustFileItems(Long anContractId);
    
    /***
     * 修改合同台账
     * @param anMap
     * @param anFileList
     * @return
     */
    public String webSaveContractLedger(Map<String, Object> anMap, String anFileList);
    
    /***
     * 修改合同状态
     * @param anContractId
     * @param anStatus
     */
    public String webSaveContractLedgerStatus(Long anContractId,String anStatus);
    
    /***
     * 查询合同台账记录
     * @param anContractId
     * @return
     */
    public String webFindContractLedgerRecode(Long anContractId);
    
}
