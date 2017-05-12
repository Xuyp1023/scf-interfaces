// Copyright (c) 2014-2017 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.3 : 2017年5月4日, liuwl, creation
// ============================================================================
package com.betterjr.modules.commission;

import java.util.Map;

/**
 * @author liuwl
 *
 */
public interface ICommissionPayResultService {
    /**
     * 创建日对账单
     * @param anImportDate
     * @param anPayDate
     * @param anCustNo
     * @return
     */
    String webCreatePayResult(Map<String, Object> anParam);

    /**
     *
     * @param anPayResultId
     * @return
     */
    String webCountPayResultRecord(Long anPayResultId);

    /**
     * 查询已导入数据
     * @param anCustNo
     * @param anImportDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryUncheckCommissionRecord(Map<String, Object> param, int anFlag, int anPageNum, int anPageSize);

    /**
     *
     * @param anParam
     * @return
     */
    String webFindCountCommissionRecord(Map<String, Object> anParam);

    /**
     * 查询未确认的日对账单
     * @param anCustNo
     * @param anPayDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryNormalPayResultList(Map<String, Object> param, int anFlag, int anPageNum, int anPageSize);

    /**
     *
     * @param anCustNo
     * @param anPayDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryConfirmPayResultList(Map<String, Object> param, int anFlag, int anPageNum, int anPageSize);

    /**
     *
     * @param anCustNo
     * @param anPayDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryAuditPayResultList(Map<String, Object> param, int anFlag, int anPageNum, int anPageSize);

    /**
     *
     * @param anPayResultId
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryAllPayResultRecords(Long anPayResultId, int anFlag, int anPageNum, int anPageSize);
    /**
     *
     * @param anPayResultId
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryUncheckPayResultRecords(Map<String, Object> param, Long anPayResultId, int anFlag, int anPageNum, int anPageSize);

    /**
     *
     * @param anPayResultId
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQuerySuccessPayResultRecords(Long anPayResultId, int anFlag, int anPageNum, int anPageSize);

    /**
     *
     * @param anPayResultId
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryFailurePayResultRecords(Long anPayResultId, int anFlag, int anPageNum, int anPageSize);

    /**
     *
     * @param anPayResultId
     * @param anPayResultRecords
     * @return
     */
    String webConfirmSuccessPayResultRecords(Long anPayResultId, String anPayResultRecords);

    /**
     *
     * @param anPayResultId
     * @param anPayResultRecords
     * @return
     */
    String webConfirmFailurePayResultRecords(Long anPayResultId, String anPayResultRecords);

    /**
     *
     * @param anPayResultId
     * @param anPayResultRecordId
     * @return
     */
    String webSuccessToFailurePayResultRecord(Long anPayResultId, Long anPayResultRecordId);

    /**
     *
     * @param anPayResultId
     * @param anPayResultRecordId
     * @return
     */
    String webFailureToSuccessPayResultRecord(Long anPayResultId, Long anPayResultRecordId);

    /**
     *
     * @param anPayResultId
     * @return
     */
    String webConfirmPayResult(Long anPayResultId);

    /**
     *
     * @param anPayResultId
     * @return
     */
    String webAuditPayResult(Long anPayResultId);

    /**
     * @param anRefNo
     * @return
     */
    String webFindCommissionRecord(String anRefNo);
}
