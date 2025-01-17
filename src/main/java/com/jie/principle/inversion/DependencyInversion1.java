package com.jie.principle.inversion;

public class DependencyInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子信息是：hello，world！！！";
    }
}

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}