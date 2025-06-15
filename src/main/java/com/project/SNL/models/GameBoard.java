package com.project.SNL.models;

public class GameBoard {
    private int width, height;
    private static GameBoard instance;

    private static class SingletonHelper{
        private static final GameBoard instance = new GameBoard();
    }

    public static GameBoard getInstance(){
        return SingletonHelper.instance;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }
}
