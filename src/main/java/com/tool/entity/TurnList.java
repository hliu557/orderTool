package com.tool.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class TurnList  {
    private Double all = 20000.00;
    private Character[] turn;
    public void init(){
        turn = new Character[]{
                new Character("张三",new Abilities("100","10","10","10","10","10")),
                new Character("李四",new Abilities("100","10","10","10","10","10")),
                new Character("王五",new Abilities("100","10","10","10","10","10")),
        };
    }
    public void turn() throws InterruptedException {
        calculateResTime();
        turn[0].turn();
        turn[0].setTurn_res_time(all.doubleValue()/Double.valueOf(turn[0].getAbilities().getSpeed()));
        Arrays.sort(turn, new CharacterComparator());
    }
    public void calculateResTime(){
        for(int i=1;i<turn.length;i++){
            turn[i].setTurn_res_time(turn[i].getTurn_res_time()-turn[0].getTurn_res_time());
        }


    }
}
