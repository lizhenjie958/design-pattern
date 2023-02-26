package com.jie.pattern.composite;

public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("河南农业大学", "河南农业皇家学院");
        OrganizationComponent computerCollege = new College("计算机学院","男子学院");
        OrganizationComponent plantProtectCollege = new College("植物保护学院","绿色学院");
        university.add(computerCollege);
        university.add(plantProtectCollege);

        OrganizationComponent computerDepartment = new Department("计算机专业", "秃头最专业");
        OrganizationComponent safeDepartment = new Department("网络安全专业", "没有科技含量的专业");

        computerCollege.add(computerDepartment);
        computerCollege.add(safeDepartment);

        OrganizationComponent department = new Department("植物科学与技术专业", "种地的专业");
        OrganizationComponent plantDepartment = new Department("植物保护专业", "捉昆虫的专业");
        OrganizationComponent drinkDepartment = new Department("农药专业", "卖农药的专业");

        plantProtectCollege.add(department);
        plantProtectCollege.add(plantDepartment);
        plantProtectCollege.add(drinkDepartment);

        university.print();


    }
}
