package com.company;

import java.util.Objects;

public class Constable extends Person {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean running;
    private boolean arrested;

    public Constable(String name) {
        this.name = name;
        this.strength = 60;
        this.health = 100;
        this.stamina = 60;
        this.speed = 20;
        this.attackPower = 5;
        this.running = false;
        this.arrested = false;
    }

    public String attack() {
        if (this.arrested) {
            System.out.println("Can't attack if you're arrested!");
            return "Can't attack if you're arrested!";
        } else {
            System.out.println(this.name + " attacks!");
            return this.name + " attacks!";
        }
    }

    public boolean run() {
        System.out.println(this.name + " ran away!");
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
        Constable constable = (Constable) o;
        return strength == constable.strength && health == constable.health && stamina == constable.stamina && speed == constable.speed && attackPower == constable.attackPower && running == constable.running && arrested == constable.arrested && Objects.equals(name, constable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, strength, health, stamina, speed, attackPower, running, arrested);
    }

    @Override
    public String toString() {
        return "Constable{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", running=" + running +
                ", arrested=" + arrested +
                '}';
    }
}
