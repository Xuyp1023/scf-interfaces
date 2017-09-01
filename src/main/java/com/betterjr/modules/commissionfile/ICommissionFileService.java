package com.betterjr.modules.commissionfile;

import java.util.Map;

public interface ICommissionFileService {

    String webAddCommissionFile(Map anParamMap);

    String webQueryFileList(Map<String, Object> anAnMap, String anFlag, int anPageNum, int anPageSize);

    String webSaveDeleteFile(String anRefNo,Map<String, Object> anMap);
    
    String webSaveCannulFile(Long  anFileId);

    String webSaveResolveFile(String anRefNo,Map<String, Object> anAnMap);

    String webFindTemplateFile();

}
