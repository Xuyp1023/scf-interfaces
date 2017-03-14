// Copyright (c) 2014-2017 Bytter. All rights reserved.
// ============================================================================
// CURRENT VERSION
// ============================================================================
// CHANGE LOG
// V2.0 : 2017年3月14日, liuwl, creation
// ============================================================================
package com.betterjr.modules.fund;

import java.util.Map;

import com.betterjr.common.annotation.AnnotRuleService;
import com.betterjr.modules.rule.annotation.AnnotRuleFunc;
import com.betterjr.modules.rule.entity.RuleFuncType;

/**
 * @author liuwl
 *
 */
@AnnotRuleService("fundClientWebServiceDubboService")
public interface IFundClientWebService {
    /**
     * 账户业务复核通知，操作员在拜特金融平台上完成业务后，通过该接口通知复核人员复核操作
     *
     * @return
     */
    @AnnotRuleFunc(name = "noticeAccoCheck", fundType = RuleFuncType.OBJECT)
    public String noticeAccoCheck(Map anMap);

    /**
     * 交易业务复核通知，操作员在拜特金融平台上完成业务后，通过该接口通知复核人员复核操作
     *
     * @return
     */
    @AnnotRuleFunc(name = "noticeTradeCheck", fundType = RuleFuncType.OBJECT)
    public String noticeTradeCheck(Map anMap);

    /**
     * 拜特资金管理系统主动通知金融平台一些信息，例如申购资金的划拨等；具体的内容由NoticeInfo.data中的字段json序列化后传递。
     *
     * @return
     */
    @AnnotRuleFunc(name = "noticeToPlatForm", fundType = RuleFuncType.OBJECT)
    public String noticeToPlatForm(Map anMap);

}
