package com.company;

import java.util.Objects;

public abstract class BaseCharacter {
    protected String name;
    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;
    protected boolean isRunning = false;
    protected boolean isArrested = false;

    //method below for future classes in case they don't have a specialized battle cry during attackAnotherCharacter
    public void attackAnotherCharacter() {
        System.out.println("Heya! Take this! *judo chop*");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public boolean isArrested() {
        return isArrested;
    }

    public void setArrested(boolean arrested) {
        isArrested = arrested;
    }

    public BaseCharacter(String name, int strength, int health, int stamina, int speed, int attackPower, boolean isRunning, boolean isArrested) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.isRunning = isRunning;
        this.isArrested = isArrested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCharacter that = (BaseCharacter) o;
        return strength == that.strength && health == that.health && stamina == that.stamina && speed == that.speed && attackPower == that.attackPower && isRunning == that.isRunning && isArrested == that.isArrested && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower, isRunning, isArrested);
    }

    @Override
    public String toString() {
        return "BaseCharacter{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", isRunning=" + isRunning +
                ", isArrested=" + isArrested +
                '}';
    }
}
