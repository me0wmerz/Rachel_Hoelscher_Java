package com.company;

import java.util.Objects;

public class Warrior extends BaseCharacter {

    protected int strength = 75;
    protected int health = 100;
    protected int stamina = 100;
    protected int speed = 50;
    protected int attackPower = 10;
    protected int shieldStrength = 100;

    public void attackAnotherCharacter() {
        System.out.println("*Smash* *Punch* *Kick*");
        attackPower++;
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

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean isRunning, boolean isArrested) {
        super(name, strength, health, stamina, speed, attackPower, isRunning, isArrested);
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.shieldStrength = shieldStrength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return strength == warrior.strength && health == warrior.health && stamina == warrior.stamina && speed == warrior.speed && attackPower == warrior.attackPower && shieldStrength == warrior.shieldStrength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength, health, stamina, speed, attackPower, shieldStrength);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", shieldStrength=" + shieldStrength +
                '}';
    }
}
