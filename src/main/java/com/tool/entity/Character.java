package com.tool.entity;

import java.math.BigDecimal;

public class Character implements Comparable<Character>{
    private String name;
    private Abilities abilities;
    private Double turn_res_time;
    public int compareTo(Character c) {
        return this.turn_res_time.compareTo(c.getTurn_res_time());
    }


    public Abilities getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities abilities) {
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getTurn_res_time() {
        return turn_res_time;
    }

    public void setTurn_res_time(Double turn_res_time) {
        this.turn_res_time = turn_res_time;
    }


}
