// Copyright (c) 2014-2017 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.3 : 2017年5月4日, liuwl, creation
// ============================================================================
package com.betterjr.modules.commission;

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
    String webCreatePayResult(String anImportDate, String anPayDate, Long anCustNo);

    /**
     * 查询已导入数据
     * @param anCustNo
     * @param anImportDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryUncheckCommissionRecord(Long anCustNo, String anImportDate, int anFlag, int anPageNum, int anPageSize);

    /**
     * 查询未确认的日对账单
     * @param anCustNo
     * @param anPayDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryNormalPayResultList(Long anCustNo, String anPayDate, int anFlag, int anPageNum, int anPageSize);

    /**
     *
     * @param anCustNo
     * @param anPayDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryConfirmPayResultList(Long anCustNo, String anPayDate, int anFlag, int anPageNum, int anPageSize);

    /**
     *
     * @param anCustNo
     * @param anPayDate
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryAuditPayResultList(Long anCustNo, String anPayDate, int anFlag, int anPageNum, int anPageSize);

    /**
     *
     * @param anPayResultId
     * @param anFlag
     * @param anPageNum
     * @param anPageSize
     * @return
     */
    String webQueryUncheckPayResultRecords(Long anPayResultId, int anFlag, int anPageNum, int anPageSize);

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
    String webConfirmSuccessPayResultRecords(Long anPayResultId, Long[] anPayResultRecords);

    /**
     *
     * @param anPayResultId
     * @param anPayResultRecords
     * @return
     */
    String webConfirmFailurePayResultRecords(Long anPayResultId, Long[] anPayResultRecords);

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
}
