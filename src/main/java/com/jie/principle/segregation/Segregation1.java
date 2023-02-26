package com.jie.principle.segregation;

public class Segregation1 {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        C c = new C();
        c.depend4(new D());
    }
}

/**
 * 接口 违背了接口隔离原则，接口最小化，需要拆分接口
 */
interface Inteface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Inteface1{

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了operation5");
    }
}

class D implements Inteface1{

    @Override
    public void operation1() {
        System.out.println("D  实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D  实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D  实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D  实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D  实现了operation5");
    }
}

class A{
    public void depend1(Inteface1 i1){
        i1.operation1();
    }
    public void depend2(Inteface1 i1){
        i1.operation2();
    }
    public void depend3(Inteface1 i1){
        i1.operation2();
    }
}

class C{
    public void depend1(Inteface1 i1){
        i1.operation1();
    }
    public void depend4(Inteface1 i1){
        i1.operation4();
    }
    public void depend5(Inteface1 i1){
        i1.operation5();
    }
}