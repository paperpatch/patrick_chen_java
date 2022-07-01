package com.company;

public class App {
    public static void main(String[] args) {

        Farmer joe = new Farmer();
        joe.setName("Joe");

        Warrior mike = new Warrior();
        mike.setName("Mike");

        Constable david = new Constable();
        david.setName("David");

        System.out.println(joe);
        System.out.println(mike);
        System.out.println(david);
        
    }
}
