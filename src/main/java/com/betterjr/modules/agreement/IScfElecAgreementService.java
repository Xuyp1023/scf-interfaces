package com.betterjr.modules.agreement;

import java.util.List;
import java.util.Map;

/****
 * 电子合同管理
 * @author hubl
 *
 */
public interface IScfElecAgreementService {

    /***
     * 查询用户电子合同分页信息
     * @param anParam 入参
     * @param anPageNum 页码
     * @param anPageSize 一页显示的数量
     * @return
     */
    public String webQueryElecAgreementByPage(Map<String, Object> anParam, int anPageNum, int anPageSize);
    
    /***
     * 取消电子合同的流水号
     * @param appNo 流水号
     * @return
     */
    public String webCancelElecAgreement(String anAppNo);
    
    /****
     * 生成电子合同的静态页面
     * @param anAppNo  流水号
     */
    public String webFindElecAgreePage(String anAppNo);
    
    /***
     * 获取签署合同的验证码
     * @param anAppNo
     * @param anCustType
     * @return
     */
    public String webFindValidCode(String anAppNo, String anCustType);
    
    /***
     * 发送并验证签署合同的验证码
     * @param anAppNo
     * @param anCustType
     * @param anVcode
     * @return
     */
    public String webSendValidCode(String anAppNo, String anCustType, String anVcode);
    
    /***
     * 添加电子合同
     * @param anMap  
     *            电子合同信息
     * @param anCustNoList  
     *            电子合同的签约方信息
     */
    public void webAddElecAgreementInfo(Map<String, Object> anMap, List<Long> anCustNoList);
    
    /***
     * 转让通知书
     * @param anRequestNo 申请单号
     * @param anFactorRequestNo 保理商单号
     * @return
     */
    public boolean webTransNotice(Map<String, Object> anMap);
    
    /***
     * 确认意见书
     * @param anRequestNo 申请单号
     * @param anFactorRequestNo 保理商单号
     * @return
     */
    public boolean webTransOpinion(Map<String, Object> anMap);
    
    /****
     * 根据申请单号，类型查询合同
     * @param anRequestNo
     * @param anSignType
     * @return
     */
    public String webFindOneElecAgreeByOrderNo(String anRequestNo, String anSignType);
}
