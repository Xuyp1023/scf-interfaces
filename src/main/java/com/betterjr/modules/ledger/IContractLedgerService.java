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
    
    /***
     * 微信端添加合同台账信息
     * @param anMap
     * @return
     */
    public String webWechatAddContractLedger(Map<String, Object> anMap);
    
    /***
     * 保存合同台账附件
     * @param id 合同台账id
     * @param fileTypeName 文件类型名称
     * @param fileMediaId  文件
     * @return
     */
    public String webSaveContractLedgerFile(Long anId,String anFileTypeName,String anFileMediaId);
    
    /***
     * 修改微信端合同台账
     * @param anMap
     * @return
     */
    public String webWechatSaveContractLedger(Map<String, Object> anMap);
    
    /***
     * 根据合同编号查询合同附件信息
     * @param anContractId
     * @return
     */
    public String webFindFileByContractId(Long anContractId);
    
    /***
     * 删除合同台账
     * @param anContractId
     * @return
     */
    public String webDeleteContractById(Long anContractId);
    
    /***
     * 删除合同附件
     * @param anContractId
     * @return
     */
    public String webDeleteContractFile(Long anContractId);
    
}
