package com.company;

public class GameLifecycle {
    public static void main(String[] args) {

        Farmer joe = new Farmer("Joe", 85, 120, 80, 5, 3, false, false, false, false);

        Constable larry = new Constable("Larry", 70, 90, 45, 25, 15, true, false, "Silver City");

        Warrior bob = new Warrior("Bob", 200, 50, 10, 35, 15, false, false);

        joe.isPlowing=true;
        larry.isRunning=true;
        bob.attackAnotherCharacter();
        larry.arrestAnotherCharacter();
        bob.isArrested=true;
    }
}