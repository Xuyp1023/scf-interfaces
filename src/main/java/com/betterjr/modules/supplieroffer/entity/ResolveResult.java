package com.betterjr.modules.supplieroffer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ResolveResult implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = -3527018016187153199L;

    private int recordAmount;
    
    private BigDecimal blance;
    
    private List<Object> listData=new ArrayList<>();

    public int getRecordAmount() {
        return this.recordAmount;
    }

    public void setRecordAmount(int anRecordAmount) {
        this.recordAmount = anRecordAmount;
    }

    public BigDecimal getBlance() {
        return this.blance;
    }

    public void setBlance(BigDecimal anBlance) {
        this.blance = anBlance;
    }

    public List<Object> getListData() {
        return this.listData;
    }

    public void setListData(List<Object> anListData) {
        this.listData = anListData;
    }
    
    
    public static ResolveResult getInitValue(){
        
        ResolveResult result=new ResolveResult();
        result.setBlance(new BigDecimal(0));
        result.setRecordAmount(0);
        return result;
        
    }
    

}
