package com.jie.principle.ocp;

/**
 * 开闭原则
 */
public class Ocp1 {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

/**
 * 用于绘图的类
 */
class GraphicEditor{
    public void drawShape(Shape shape){
        if(shape.mType == 1){
            drawRectangle(shape);
        }else if(shape.mType == 2){
            drawCircle(shape);
        }
    }
    public void drawRectangle(Shape shape){
        System.out.println("矩形");
    }
    public void drawCircle(Shape shape){
        System.out.println("圆形");
    }
}

class Shape{
    int mType;
}

class Rectangle extends Shape{
    public Rectangle(){
        super.mType = 1;
    }
}

class Circle extends Shape{
    public Circle(){
        super.mType = 2;
    }
}


