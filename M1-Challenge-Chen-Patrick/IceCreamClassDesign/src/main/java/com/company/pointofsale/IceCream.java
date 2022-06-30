package com.company.pointofsale;

public class IceCream {

    private String flavor;
    private double price;
    private int quantity;

    public int sell(int num) {
        System.out.println("Sold " + num + " ice creams!");
        return this.quantity = quantity - num;
    }

    public double increasePrice(double num) {
        System.out.println("Breaking! Ice cream prices have increased by $" + num + "!");
        return this.price = price + num;
    }

    public double decreasePrice(double num) {
        System.out.println("Incoming discounts! Ice cream prices have decreased by $" + num + "!");
        return this.price = price - num;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
