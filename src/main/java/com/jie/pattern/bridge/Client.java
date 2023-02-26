package com.jie.pattern.bridge;

/**
 * 不希望继承或者多层次继承而导致系统内类急剧增加，可以使用桥接模式
 */
public class Client {
    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();
        System.out.println("===========================");
        FoldedPhone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
        System.out.println("============================");
        Phone phone3 = new UpRightPhone(new XiaoMi());
        phone3.open();
        phone3.call();
        phone3.close();
    }
}
