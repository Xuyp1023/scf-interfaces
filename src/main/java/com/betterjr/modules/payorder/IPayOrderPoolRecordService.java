package com.betterjr.modules.payorder;

import java.util.Map;

/**
 * 
 * @ClassName: IPayOrderPoolRecordService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author xuyp
 * @date 2017年10月20日 下午2:22:49 
 *
 */
public interface IPayOrderPoolRecordService {

    /**
     * 查询记录列表
     * @Title: webQueryRecordPage 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anMap
     * @param @param anFlag
     * @param @param anPageNum
     * @param @param anPageSize
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午4:12:28
     * requestPayDate
     * businStatus
     * factoryNo
     */
    String webQueryRecordPage(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

    /**
     * 根据付款时间，企业，状态查询记录信息
     * @Title: webQueryRecordList 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anMap
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午4:13:36
     * requestPayDate","businStatus","factoryNo
     */
    String webQueryRecordList(Map<String, Object> anMap);

    /**
     * 根据对应的文件id查询所有的付款进入信息
     * @Title: webQueryRecordListByFileId 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anSourceFileId
     * @param @param anPayRecordBusinStatus
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午4:14:52
     */
    String webQueryRecordListByFileId(Long anSourceFileId, String anPayRecordBusinStatus);

    /**
     * 查询所有生效的付款记录信息
     * @Title: webQueryRecordListByFileId 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anId
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午4:16:00
     */
    String webQueryRecordListByFileId(Long anId);

}
