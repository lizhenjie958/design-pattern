package com.jie.pattern.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        Website website = webSiteFactory.getWebSiteByCategory("网站");
        website.use(new User("lilg"));
        Website website1 = webSiteFactory.getWebSiteByCategory("博客");
        website1.use(new User("sf"));
        Website website2 = webSiteFactory.getWebSiteByCategory("博客");
        website2.use(new User("sp"));
        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
