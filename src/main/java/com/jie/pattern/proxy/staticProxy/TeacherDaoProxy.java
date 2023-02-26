package com.jie.pattern.proxy.staticProxy;

public class TeacherDaoProxy implements ITeacherDao {
    private TeacherDao teacherDao;

    public TeacherDaoProxy(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理  完成某些操作。。。。。 ");//方法
        teacherDao.teach();
        System.out.println("提交。。。。。");//方法
    }
}
