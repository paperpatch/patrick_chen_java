package com.company;

import java.util.Objects;

public class Farmer extends Person {

    private String name;
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
    private boolean running;
    private boolean arrested;
    private boolean plowing;
    private boolean harvesting;

    public Farmer(String name) {
        this.name = name;
        this.strength = 75;
        this.health = 100;
        this.stamina = 75;
        this.speed = 10;
        this.attackPower = 1;
        this.running = false;
        this.arrested = false;
        this.plowing = false;
        this.harvesting = false;
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

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    public void attack() {
        System.out.println(this.name + " attacks!");
    }

    public void run() {
        System.out.println(this.name + " ran away!");
        this.running = true;
    }

    public void stopRun() {
        System.out.println(this.name + " stopped running.");
        this.running = false;
    }

    public void heal() {
        System.out.println(this.name + " gain 10 HP.");
        this.health = health + 10;
    }

    public void decreaseHealth() {
        System.out.println(this.name + " lost 10 HP.");
        this.health = health - 10;
    }

    public void increaseStamina() {
        System.out.println("Increased stamina!");
        this.stamina = stamina + 10;
    }

    public void decreaseStamina() {
        System.out.println("Decreased stamina!");
        this.stamina = stamina - 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Farmer farmer = (Farmer) o;
        return strength == farmer.strength && health == farmer.health && stamina == farmer.stamina && speed == farmer.speed && attackPower == farmer.attackPower && running == farmer.running && arrested == farmer.arrested && plowing == farmer.plowing && harvesting == farmer.harvesting && Objects.equals(name, farmer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, strength, health, stamina, speed, attackPower, running, arrested, plowing, harvesting);
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", running=" + running +
                ", arrested=" + arrested +
                ", plowing=" + plowing +
                ", harvesting=" + harvesting +
                '}';
    }
}
