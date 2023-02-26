package com.jie.pattern.responsibilityChain;

// 责任链模式
public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("王院长");
        ViceSchooleMasterApprover viceSchooleMasterApprover = new ViceSchooleMasterApprover("赵副校长");
        SchooleMasterApprover schooleMasterApprover = new SchooleMasterApprover("李校长");

        // 设置各个级别审批的下一个设置好（处理人要构成环形结构）
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchooleMasterApprover);
        viceSchooleMasterApprover.setApprover(schooleMasterApprover);
        schooleMasterApprover.setApprover(departmentApprover);


        // 发送审批请求
        departmentApprover.processRequest(purchaseRequest);
        viceSchooleMasterApprover.processRequest(purchaseRequest);
    }
}
