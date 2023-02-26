package com.jie.pattern.command;

/**
 * 没有任何命令，空执行。当调用空命令时，对象什么都不做，省去了对空的判断
 */
public class NoCommand implements Command {
    @Override
    public void excute() {

    }

    @Override
    public void undo() {

    }
}
