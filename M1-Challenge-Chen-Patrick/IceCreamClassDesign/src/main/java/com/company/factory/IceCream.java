package com.company.factory;

public class IceCream {
    private String flavor;
    private double salePrice;
    private double productionCost;
    private int productionTime;
    private String ingredients;

    public int increaseProductionTime(int num) {
        System.out.println("Production time to make each individual ice cream has increased by " + num + " seconds due to various reasons.");
        return this.productionTime = productionTime + num;
    }

    public int decreaseProductionTime(int num) {
        System.out.println("Efficiency increased! Each ice cream made decreased by " + num + " seconds.");
        return this.productionTime = productionTime - num;
    }

    public double increaseSalesPrice(double num) {
        System.out.println("Sales price has increased by " + num + "!");
        return this.salePrice = salePrice + num;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
