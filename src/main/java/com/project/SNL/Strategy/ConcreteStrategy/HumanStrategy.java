package com.project.SNL.Strategy.ConcreteStrategy;

import com.project.SNL.Strategy.MovementStrategy;
import com.project.SNL.models.Pair;

public class HumanStrategy implements MovementStrategy {
    @Override
    public Pair getNextPosition(Pair currhead, String direction) {
        int row= currhead.getRow();
        int col=currhead.getCol();

        switch(direction){
            case "U":
                return new Pair(row-1, col);
            case "D":
                return new Pair(row+1, col);
            case "L":
                return new Pair(row, col-1);
            case "R":
                return new Pair(row, col+1);
            default:return currhead;
        }
    }
}
