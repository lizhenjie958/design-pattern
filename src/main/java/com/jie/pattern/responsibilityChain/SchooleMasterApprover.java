package com.jie.pattern.responsibilityChain;

public class SchooleMasterApprover extends Approver {
    public SchooleMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() > 30000){
            System.out.println("请求编号 id=" + purchaseRequest.getId() + "被" + this.name + "处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}
