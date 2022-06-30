package com.company;

import java.util.Objects;

public class Person {
    private String name;
    private int health;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int decreaseHealth() {
        System.out.println(this.name + " lost HP.");
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return health == person.health && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
