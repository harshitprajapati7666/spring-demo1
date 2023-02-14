package com.harshitprajapati.demo;

public class App01BasicGaming {

    public static void main(String[] args) {

//        var game = new MarioGame();
//        var game = new SuperContraGame();
        var game = new PacManGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
