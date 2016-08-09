package com.betterjr.modules.loan;

import java.util.Map;

public interface IScfRepaymentService {

    
    /**
     * 保存还款
     * @param anMap
     * @return
     */
    String webSaveRepayment(Map<String, Object> anMap);

    /**
     * 进入还款界面后，填充还款数据
     * @param anRequestNo
     * @param anPayType
     * @param anFactorNo
     * @return
     */
    String webQueryRepaymentFee(String anRequestNo, String anPayType, String anFactorNo);

    /**
     * 经销商还款 -计算利息 -填入(本次还款额) 时  调用
     * @param anMap
     * @return
     */
    String webQuerySellerRepaymentFee(Map<String, Object> anMap);

    /**
     * 计算还款方式-还款时，在选择还款日期后调用，用于填充还款方式
     * @param anRequestNo
     * @param anPayDate
     * @return
     */
    String webCalculatPayType(String anRequestNo, String anPayDate);



}
