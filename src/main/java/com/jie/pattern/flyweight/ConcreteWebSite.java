package com.jie.pattern.flyweight;

public class ConcreteWebSite extends Website {
    // 类型为享元模式的内部状态
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type + ",发布者为：" + user.getName());
    }
}
