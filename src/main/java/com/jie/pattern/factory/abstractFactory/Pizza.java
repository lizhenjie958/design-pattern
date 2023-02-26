package com.jie.pattern.factory.abstractFactory;

abstract class Pizza {

    protected String name ;

    abstract void prepare();
    protected void bake(){
        System.out.println(name + " is baking");
    }
    protected void cut(){
        System.out.println(name + " is cutting");
    }
    protected void box(){
        System.out.println(name + " is boxing");
    }
    protected void setName(String name){
        this.name = name;
    }
}
