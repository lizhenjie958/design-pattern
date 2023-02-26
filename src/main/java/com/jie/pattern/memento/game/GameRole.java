package com.jie.pattern.memento.game;

public class GameRole {
    private int vit;
    private int def;

    // 创建一个备忘录
    public Memento createMemento(){
        return new Memento(vit,def);
    }

    // 从备忘录恢复gamerole的状态
    public void recoverGameRoleFormMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    // 显示当前游戏角色的状态
    public void display(){
        System.out.println("游戏角色当前的攻击力："+ this.vit + ",防御力："+this.def);
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public int getDef() {
        return def;
    }
}
