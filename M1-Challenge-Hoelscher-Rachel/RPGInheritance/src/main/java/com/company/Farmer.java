package com.company;

import java.util.Objects;

public class Farmer extends BaseCharacter {
    protected int strength = 75;
    protected int health = 100;
    protected int stamina = 75;
    protected int speed = 10;
    protected int attackPower = 1;
    protected boolean isPlowing = false;
    protected boolean isHarvesting = false;

    public void attackAnotherCharacter() {
        System.out.println("Yah!! Feel the wrath of my pitchfork!");
        isHarvesting = false;
        isPlowing = false;
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

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public boolean isArrested() {
        return isArrested;
    }

    @Override
    public void setArrested(boolean arrested) {
        isArrested = arrested;
    }

    public boolean isPlowing() {
        return isPlowing;
    }

    public void setPlowing(boolean plowing) {
        isPlowing = plowing;
    }

    public boolean isHarvesting() {
        return isHarvesting;
    }

    public void setHarvesting(boolean harvesting) {
        isHarvesting = harvesting;
    }

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean isRunning, boolean isArrested, boolean isPlowing, boolean isHarvesting) {
        super(name, strength, health, stamina, speed, attackPower, isRunning, isArrested);
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.isRunning = isRunning;
        this.isArrested = isArrested;
        this.isPlowing = isPlowing;
        this.isHarvesting = isHarvesting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return strength == farmer.strength && health == farmer.health && stamina == farmer.stamina && speed == farmer.speed && attackPower == farmer.attackPower && isRunning == farmer.isRunning && isArrested == farmer.isArrested && isPlowing == farmer.isPlowing && isHarvesting == farmer.isHarvesting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), strength, health, stamina, speed, attackPower, isRunning, isArrested, isPlowing, isHarvesting);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", isRunning=" + isRunning +
                ", isArrested=" + isArrested +
                ", isPlowing=" + isPlowing +
                ", isHarvesting=" + isHarvesting +
                '}';
    }

}
