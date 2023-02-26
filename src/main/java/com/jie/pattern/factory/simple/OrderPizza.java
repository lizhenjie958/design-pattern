package com.jie.pattern.factory.simple;

class OrderPizza {

    public static void main(String[] args) {
        Pizza greek = SimpleFacotry.createPizza2("greek");
        greek.prepare();
        greek.bake();
        greek.cut();
        greek.box();

        SimpleFacotry simpleFacotry = new SimpleFacotry();
        Pizza cheese = simpleFacotry.createPizza1("cheese");
        cheese.prepare();
        cheese.bake();
        cheese.cut();
        cheese.box();

    }
}
