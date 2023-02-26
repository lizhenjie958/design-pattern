package com.jie.principle.ocp;

/**
 * 开闭原则 扩展开放(提供方)，修改关闭（使用方 ）
 */
public class Ocp2 {
    public static void main(String[] args) {
        GraphicEditor2 graphicEditor = new GraphicEditor2();
        graphicEditor.drawShape(new Circle2());
        graphicEditor.drawShape(new Rectangle2());
    }
}

/**
 * 用于绘图的类
 */
class GraphicEditor2{
    public void drawShape(Shape2 shape){
        shape.draw();
    }

}

abstract class Shape2{
    abstract void draw();
}

class Rectangle2 extends Shape2{
    @Override
    public void draw(){
        System.out.println("长方形");
    }
}


class Circle2 extends Shape2{
    @Override
    public void draw(){
        System.out.println("圆形");
    }
}


