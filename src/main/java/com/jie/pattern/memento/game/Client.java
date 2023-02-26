package com.jie.pattern.memento.game;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("和boss大战前的状态");
        gameRole.display();


//        把当前的状态保存当caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());

        System.out.println("和boss开始大战");

        gameRole.setDef(30);
        gameRole.setVit(50);
        gameRole.display();

        System.out.println("大战后使用备忘录讲状态恢复到大战前");

        gameRole.recoverGameRoleFormMemento(caretaker.getMemento());

        System.out.println("恢复后的状态");
        gameRole.display();
    }
}
