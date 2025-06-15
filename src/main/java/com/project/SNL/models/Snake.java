package com.project.SNL.models;

import com.sun.jdi.connect.spi.TransportService;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Snake {

    Deque<Pair> body;
    Map<Pair, Boolean> posmap;
    public Snake(){
        this.body=new LinkedList<>();
        this.posmap=new HashMap<>();

        //Initializing snake position
        Pair initialPos=new Pair(0,0);
        this.body.offerFirst(initialPos);
        this.posmap.put(initialPos, true);
    }

}
