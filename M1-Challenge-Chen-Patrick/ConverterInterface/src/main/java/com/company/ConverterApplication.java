package com.company;

public class ConverterApplication {
    public static void main(String[] args) {
        ConverterIf userInput = new ConverterIf();
        ConverterSwitch switchInput = new ConverterSwitch();

        System.out.println("---------- Converter If/Else Statement Outputs -------------");
        System.out.println(userInput.convertMonth(1));
        System.out.println(userInput.convertDay(6));

        System.out.println("---------- Converter Switch Statement Outputs -------------");
        System.out.println(switchInput.convertMonth(2));
        System.out.println(switchInput.convertDay(3));
        System.out.println(switchInput.convertDay(0));
    }
}
