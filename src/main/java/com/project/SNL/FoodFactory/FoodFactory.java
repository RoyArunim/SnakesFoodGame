package com.project.SNL.FoodFactory;

public class FoodFactory {
    public static FoodItem createFood(int[] position, String type){
        if(type.equals("bonus")){
            return new BonusFood(position[0], position[1]);
        }
        return new NormalFood(position[0], position[1]);
    }
}
