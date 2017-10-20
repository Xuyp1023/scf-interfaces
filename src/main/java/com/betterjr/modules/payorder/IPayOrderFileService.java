package com.betterjr.modules.payorder;

import java.util.Map;

/**
 * 
 * @ClassName: IPayOrderFileService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author xuyp
 * @date 2017年10月20日 下午2:22:20 
 *
 */
public interface IPayOrderFileService {

    /**
     * 新增付款文件(导出下载文件记录)
     * @Title: webSaveAddFile 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anRequestPayDate
     * @param @param anFlag
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月20日 下午2:24:32
     */
    String webSaveAddFile(String anRequestPayDate, String anFlag);

    /**
     *  查询文件记录
     * @Title: webQueryFileList 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anRequestPayDate
     * @param @param anbusinStatus
     * @param @param anInfoType
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午3:31:19
     */
    String webQueryFileList(String anRequestPayDate, String anbusinStatus, String anInfoType);

    /**
     * 查询文件记录
     * @Title: webQueryFileListByMap 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anAnMap
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月19日 下午2:04:17
     */
    String webQueryFileListByMap(Map<String, Object> anAnMap);

    /**
     * 上传付款结果解析
     * @Title: webSaveResolveFile 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anFileItemId
     * @param @param anSourceFileId
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午3:32:07
     */
    String webSaveResolveFile(Long anFileItemId, Long anSourceFileId);

    /**
     * 查询付款详情
     * @Title: webFindFileDetailByPrimaryKey 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anid
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午3:33:16
     */
    String webFindFileDetailByPrimaryKey(Long anid);

    /**
     * 审核文件
     * @Title: webSaveAuditFileByPrimaryKey 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anid
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午3:33:53
     */
    String webSaveAuditFileByPrimaryKey(Long anid);

    /**
     * 删除文件
     * @Title: webSaveDeleteFileByPrimaryKey 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anid
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月18日 下午3:34:31
     */
    String webSaveDeleteFileByPrimaryKey(Long anid);

    /**
     * 查询付款文件page
     * @Title: webQueryFilePage 
     * @Description: TODO(这里用一句话描述这个方法的作用) 
     * @param @param anAnMap
     * @param @param anFlag
     * @param @param anPageNum
     * @param @param anPageSize
     * @param @return 参数说明 
     * @return String 返回类型 
     * @throws 
     * @author xuyp
     * @date 2017年10月19日 上午10:55:31
     */
    String webQueryFilePage(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize);

}
