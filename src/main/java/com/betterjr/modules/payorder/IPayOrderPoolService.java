package com.betterjr.modules.payorder;

import java.util.Map;

/**
 * 
 * @ClassName: IPayOrderPoolService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author xuyp
 * @date 2017年10月20日 下午2:23:39 
 *
 */
public interface IPayOrderPoolService {

    /**
     * 融资申请完成时新增申请记录信息
     * @Title: webSaveAddPayRecord 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anRequestNo
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午4:04:36
     */
    String webSaveAddPayRecord(String anRequestNo);

    /**
     * 企业查询付款池列表
     * @Title: webQueryPayPoolList 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anMap
     * @param @param anFlag
     * @param @param anPageNum
     * @param @param anPageSize
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午4:05:29
     * GTErequestPayDate
     * LTErequestPayDate
     * factoryNo
     */
    String webQueryPayPoolList(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

}
