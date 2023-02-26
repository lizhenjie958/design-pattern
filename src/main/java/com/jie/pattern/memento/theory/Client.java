package com.jie.pattern.memento.theory;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState(" 攻击力100 ");
        Caretaker caretaker = new Caretaker();
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 攻击力80 ");
        caretaker.add(originator.saveStateMemento());

        originator.setState(" 攻击力50 ");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前的状态是 =" + originator.getState());

        Memento memento = caretaker.get(0);
        String stateFromMemento = originator.getStateFromMemento(memento);
        System.out.println("恢复到状态1的状态是=" +stateFromMemento);
    }
}
