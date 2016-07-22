package com.betterjr.modules.credit;

import java.util.Map;

public interface IScfCreditService {

    /**
     * 保理-授信额度分页查询
     * 
     * @param anMap
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    public String webQueryFactorCredit(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

    /**
     * 保理-授信额度录入
     * 
     * @param anMap
     * @return
     */
    public String webAddCredit(Map<String, Object> anMap);

}
