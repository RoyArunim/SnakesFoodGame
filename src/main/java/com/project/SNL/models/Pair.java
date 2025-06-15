package com.project.SNL.models;

public class Pair {
    private int row, col;
    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }
}
