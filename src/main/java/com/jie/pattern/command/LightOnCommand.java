package com.jie.pattern.command;

public class LightOnCommand implements Command {
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void excute() {
        // 调用接受者的方法
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
