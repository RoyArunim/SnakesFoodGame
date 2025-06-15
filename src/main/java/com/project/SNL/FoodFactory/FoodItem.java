package com.project.SNL.FoodFactory;

public abstract class FoodItem {
    int row, col;
    int points;

    public FoodItem(int row, int col){
        this.row=row;
        this.col=col;
    }
    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }


}
