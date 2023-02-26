package com.jie.pattern.command;

public class Client {
    // 使用命令模式，完成通过遥控器操作
    public static void main(String[] args) {
        // 创建接受者(电灯和电视)
        LightReceiver lightReceiver = new LightReceiver();
        TVReceiver tvReceiver = new TVReceiver();


        // 电灯开关对象
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        // 电视开关的对象
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver);


        // 遥控器管理电灯和电视开关
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);

        System.out.println("-----------------按一下灯打开的按钮-------------------");
        remoteController.onButtonWasPushed(0);
        System.out.println("-----------------按一下灯关闭的按钮-------------------");
        remoteController.offButtonWasPushed(0);
        System.out.println("-----------------按一下灯撤销的按钮-------------------");
        remoteController.undoButtonWasPushed();


        System.out.println("=========================================================");

        System.out.println("-----------------按一下电视关闭的按钮-------------------");
        remoteController.offButtonWasPushed(1);
        System.out.println("-----------------按一下电视打开的按钮-------------------");
        remoteController.onButtonWasPushed(1);
        System.out.println("-----------------按一下电视撤销的按钮-------------------");
        remoteController.undoButtonWasPushed();
    }
}
