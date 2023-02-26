package com.jie.principle.segregation;

/**
 * 实现接口隔离原则，实现接口最小化
 */
public class Segregation2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.depend1(new B2());
        C2 c = new C2();
        c.depend4(new D2());
    }
}

/**A
 * 接口 A
 */
interface IntAefaceA{
    void operation1();
}

/**A
 * 接口 B
 */
interface IntAefaceB{
    void operation2();
    void operation3();
}

/**A
 * 接口 C
 */
interface IntAefaceC{
    void operation4();
    void operation5();
}

class B2 implements IntAefaceA , IntAefaceB{

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
}

class D2 implements IntAefaceA, IntAefaceC{

    @Override
    public void operation1() {
        System.out.println("D  实现了operation1");
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

class A2{
    public void depend1(IntAefaceA i1){
        i1.operation1();
    }
    public void depend2(IntAefaceB i1){
        i1.operation2();
    }
    public void depend3(IntAefaceB i1){
        i1.operation2();
    }
}

class C2{
    public void depend1(IntAefaceA i1){
        i1.operation1();
    }
    public void depend4(IntAefaceC i1){
        i1.operation4();
    }
    public void depend5(IntAefaceC i1){
        i1.operation5();
    }
}