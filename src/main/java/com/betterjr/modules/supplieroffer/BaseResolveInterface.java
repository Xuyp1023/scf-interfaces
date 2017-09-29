package com.betterjr.modules.supplieroffer;

import java.util.List;
import java.util.Map;

import com.betterjr.modules.supplieroffer.entity.ResolveResult;

public interface BaseResolveInterface {

    public ResolveResult invokeResolve(List<Map<String, Object>> listData);

    public ResolveResult invokeDelete(Long commissionFileId);

}
