package com.jie.pattern.responsibilityChain;

public abstract class Approver {
    Approver approver;   // 下一个处理者
    String name;

    public Approver(String name) {
        this.name = name;
    }

    // 下一个处理者
    public void setApprover(Approver approver){
        this.approver = approver;
    }

    // 处理审批请求的方法

    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
