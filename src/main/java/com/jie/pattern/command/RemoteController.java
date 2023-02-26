package com.jie.pattern.command;

public class RemoteController {
    // 开按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;
    // 撤销按钮的命令
    Command undoCommand;

    // 构造，完成对按钮的初始化
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for(int i = 0 ; i < 5; i++){
            onCommands[i]= new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给按钮设置需要的命令
     * @param NO
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int NO, Command onCommand, Command offCommand){
        onCommands[NO] = onCommand;
        offCommands[NO] = offCommand;
    }

    // 按一下开按钮
    public void onButtonWasPushed(int NO){
        onCommands[NO].excute();
        // 记录本次操作，用于撤销
        undoCommand = onCommands[NO];
    }

    // 按关按钮
    public void offButtonWasPushed(int NO){
        offCommands[NO].excute();
        // 记录本次操作，用于撤销
        undoCommand = offCommands[NO];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
