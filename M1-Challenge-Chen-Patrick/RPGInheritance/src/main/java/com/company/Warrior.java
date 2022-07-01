package com.company;

import java.util.Objects;

public class Warrior extends Person {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private int shieldStrength;
    private boolean running;
    private boolean arrested;

    public Warrior(String name) {
        this.name = name;
        this.strength = 75;
        this.health = 100;
        this.stamina = 100;
        this.speed = 50;
        this.attackPower = 10;
        this.shieldStrength = 100;
        this.running = false;
        this.arrested = false;
    }

    public int attacks() {
        System.out.println("this.name attacks! Stamina drained.");
        return this.stamina - 10;
    }

    public boolean run() {
        System.out.println(this.name + " ran away!");
        this.stamina = stamina - 10;
        return this.running = true;
    }

    public boolean stopRun() {
        System.out.println(this.name + " stopped running.");
        return this.running = false;
    }

    public int heal() {
        System.out.println(this.name + " gain 10 HP.");
        return this.health = health + 10;
    }

    public int decreaseHealth() {
        System.out.println(this.name + " lost 10 HP.");
        return this.health = health - 10;
    }

    public int increaseStamina() {
        System.out.println("Increased stamina!");
        return this.stamina = stamina + 10;
    }

    public int decreaseStamina() {
        System.out.println("Decreased stamina!");
        return this.stamina = stamina - 10;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

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

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public boolean isArrested() {
        return arrested;
    }

    public void setArrested(boolean arrested) {
        this.arrested = arrested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Warrior warrior = (Warrior) o;
        return strength == warrior.strength && health == warrior.health && stamina == warrior.stamina && speed == warrior.speed && attackPower == warrior.attackPower && shieldStrength == warrior.shieldStrength && running == warrior.running && arrested == warrior.arrested && Objects.equals(name, warrior.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, strength, health, stamina, speed, attackPower, shieldStrength, running, arrested);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", shieldStrength=" + shieldStrength +
                ", running=" + running +
                ", arrested=" + arrested +
                '}';
    }
}
