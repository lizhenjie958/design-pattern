package com.jie.pattern.flyweight;

import java.util.HashMap;

/**
 * 网站的工厂类，需要返回一个网站
 */
public class WebSiteFactory {
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    public Website getWebSiteByCategory(String type){
        if (!pool.containsKey(type)) {
            pool.put(type,new ConcreteWebSite(type));
        }
        return (Website)pool.get(type);
    }

    /**
     * 获取网站分类的总数（池中的网站类型的总数）
     * @return
     */
    public int getWebSiteCount(){
        return pool.size();
    }
}
