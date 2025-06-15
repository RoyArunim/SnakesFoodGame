package com.project.SNL.Strategy;

import com.project.SNL.models.Pair;

public interface MovementStrategy {

    public Pair getNextPosition(Pair currhead, String direction);
}
