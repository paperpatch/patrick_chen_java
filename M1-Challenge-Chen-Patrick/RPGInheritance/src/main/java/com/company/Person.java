package com.company;

import java.util.Objects;

public class Person {
    protected String name;
    protected int strength;
    protected int health;
    protected int stamina;
    protected int speed;
    protected int attackPower;
    protected boolean running;
    protected boolean arrested;

    public Person() {
    }

    public Person(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested) {
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
        this.running = running;
        this.arrested = arrested;
    }

    public void attack(Person enemy) {
        if (this.isArrested()) {
            System.out.println("Can't do anything if you're arrested!");
        } else {
            int attack = this.getAttackPower();
            int enemyHealth = enemy.getHealth();
            enemy.setHealth(enemyHealth - attack);
            System.out.println(this.getName() + " attacked " + enemy.getName() + " for " + attack + " damage.");
        }
    }

    public void run() {
        if (this.isArrested()) {
            System.out.println("Can't run if you're arrested!");
        } else {
            this.setRunning(true);
            this.setStamina(getStamina() - 10);
            System.out.println(this.getName() + " ran away!");
        }
    }

    public void stopRunning() {
        this.setRunning(false);
        System.out.println(this.getName() + " stopped running.");
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
        Person person = (Person) o;
        return strength == person.strength && health == person.health && stamina == person.stamina && speed == person.speed && attackPower == person.attackPower && running == person.running && arrested == person.arrested && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, strength, health, stamina, speed, attackPower, running, arrested);
    }

    @Override
    public String toString() {
        return "Person{" +
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
