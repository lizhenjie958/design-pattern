package com.jie.principle.liskov;

/**
 * 里氏替换原则：尽量通过不要重写父类的方法来实现功能
 */
public class Liskov2 {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println("11-3="+a.func1(11,3));
        B2 b = new B2();
        System.out.println("11+3=" + b.func1(11,3));
        System.out.println("11-3=" + b.func2(11,3));
    }
}

/**
 * 提取一个更加基础的基类
 */
class Base{
    /**
     * 基类的基础方法
     */
}

/**
 * 提取A和B公共的功能
 */

class A2 extends Base{
    public int func1(int num1, int num2){
        return num1 - num2;
    }
}

class B2 extends Base{
   // 如果B要使用A类的方法，可以使用组合关系
    private A2 a2 = new A2();

    /**
     * 减法
     * @param num1
     * @param num2
     * @return
     */
    public int func1(int num1, int num2){
        return num1 + num2;
    }

    /**
     * 加法
     * @param num1
     * @param num2
     * @return
     */
    public int func2(int num1, int num2){
        return this.a2.func1(num1, num2);
    }
}