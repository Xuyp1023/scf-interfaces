package com.betterjr.modules.supplieroffer;

import java.util.Map;

public interface IScfReceivableRequestAgreementService {

    public String webQueryAgreementWithCore(Map<String, Object> anMap, String anFlag, int anPageNum, int anPageSize);

    public String webQueryAgreementWithSupplier(Map<String, Object> anMap, String anFlag, int anPageNum,
            int anPageSize);

    public String webQueryDictFactory();
}
