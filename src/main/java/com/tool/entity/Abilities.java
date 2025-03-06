package com.tool.entity;

public class Abilities {
    private String attack;
    private String defense;
    private String speed;
    private String lifePoint;
    private String CriticalRate;
    private String CriticalDamageRate;

    public Abilities(String number, String number1, String number2, String number3, String number4, String number5) {
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getCriticalDamageRate() {
        return CriticalDamageRate;
    }

    public void setCriticalDamageRate(String criticalDamageRate) {
        CriticalDamageRate = criticalDamageRate;
    }

    public String getCriticalRate() {
        return CriticalRate;
    }

    public void setCriticalRate(String criticalRate) {
        CriticalRate = criticalRate;
    }

    public String getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(String lifePoint) {
        this.lifePoint = lifePoint;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }
}
