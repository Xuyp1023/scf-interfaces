package com.betterjr.modules.agreement;

import java.util.Map;


public interface IScfAgreementStandardService {

    public String webAddAgreementStandard(Map<String, Object> anMap);
    
    public String webQueryRegisteredAgreementStandard(int anPageNum, int anPageSize, String anFlag);
    
    public String webSaveModifyAgreementStandard(Map<String, Object> anMap, Long anId); 

    public String webSaveDeleteAgreementStandard(Long anId);

    public String webQueryAgreementStandardByStatus(String anBusinStatus,int anPageNum, int anPageSize, String anFlag);

    public String webSaveEnableAgreementStandard(Long anId);
    
    public String webSaveDisableAgreementStandard(Long anId);

    public String webQueryAgreementStandard(Map<String, Object> anMap, int anPageNum, int anPageSize, String anFlag);
    
}
