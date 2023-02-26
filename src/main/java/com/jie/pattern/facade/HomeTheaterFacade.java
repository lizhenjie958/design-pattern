package com.jie.pattern.facade;

public class HomeTheaterFacade {
    private DVDPlayer dVDPlayer = DVDPlayer.getInstance();
    private Popcorn  popcorn = Popcorn.getInstance();
    private Projector projector = Projector.getInstance();
    private Screen screen = Screen.getInstance();
    private Stereo stereo = Stereo.getInstance();
    private TheaterLight theaterLight = TheaterLight.getInstance();

    // 操作分为4步
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dVDPlayer.on();
        theaterLight.dim();
    }

    public void play(){
        dVDPlayer.play();
    }

    public void pause(){
        dVDPlayer.pause();
    }

    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dVDPlayer.off();
    }
}
