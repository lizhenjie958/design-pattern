package com.jie.principle.liskov;

/**
 * 里氏替换原则：尽量通过不要重写父类的方法来实现功能
 */
public class Liskov1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        B b = new B();
        System.out.println("11-3=" + b.func1(11,3));
    }
}

class A{
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}

class B extends A {
    /**
     * 这里的B重写A的方法，可能是无意识的行为
     * @param num1
     * @param num2
     * @return
     */
    public int func1(int num1, int num2) {
        return num1 + num2;
    }
}
