package com.jie.principle.inversion;

public class DependencyInversion2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.receive(new Email2());

        person.receive(new WeiXin());
    }
}

/**
 * 增加接口，用户层无需改变，只要添加实现即可
 */
interface IReceiver{
    String getInfo();
}

class Email2 implements IReceiver{
    public String getInfo(){
        return "电子信息是：hello，world！！！";
    }
}

class WeiXin implements IReceiver{
    public String getInfo(){
        return "微信信息是：hello，world！！！";
    }
}

class Person2{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}