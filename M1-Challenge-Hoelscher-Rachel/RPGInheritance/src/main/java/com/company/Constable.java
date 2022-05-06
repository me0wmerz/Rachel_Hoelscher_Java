package com.company;

import java.util.Objects;

public class Constable extends BaseCharacter {
    protected int strength = 60;
    protected int health = 100;
    protected int stamina = 60;
    protected int speed = 20;
    protected int attackPower = 5;
    protected String jurisdiction;

    public void arrestAnotherCharacter() {
        System.out.println("You are under arrest, hooligan. No more terrorizing my fair village of " + jurisdiction + " .");
        speed--;
    }

    public void attackAnotherCharacter() {
        System.out.println("The long arm of the law always gets its due...");
    }

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean isRunning, boolean isArrested, String jurisdiction) {
        super(name, strength, health, stamina, speed, attackPower, isRunning, isArrested);
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.jurisdiction = jurisdiction;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public int getStamina() {
        return stamina;
    }

    @Override
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Constable constable = (Constable) o;
        return strength == constable.strength && health == constable.health && stamina == constable.stamina && speed == constable.speed && attackPower == constable.attackPower && Objects.equals(jurisdiction, constable.jurisdiction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), strength, health, stamina, speed, attackPower, jurisdiction);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", jurisdiction='" + jurisdiction + '\'' +
                '}';
    }
}
