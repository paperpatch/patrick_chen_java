package com.company;

public class App {
    public static void main(String[] args) {
        com.company.factory.IceCream iceCream = new com.company.factory.IceCream();
        iceCream.setFlavor("Strawberry");
        iceCream.setSalePrice(5.32);
        iceCream.setProductionCost(0.78);
        iceCream.setProductionTime(90);
        iceCream.setIngredients("cone, waffle, milk");

        System.out.println("This " + iceCream.getFlavor() + " ice cream consists of " + iceCream.getIngredients() + " and takes about " + iceCream.getProductionTime() + " seconds to make one in our factory.");
        System.out.println("It costs about $" + iceCream.getProductionCost() + " per cone and we sell it at $" + iceCream.getSalePrice() + " market price.");

        System.out.println("-------------------------------------");

        com.company.pointofsale.IceCream iceCream2 = new com.company.pointofsale.IceCream();
        iceCream2.setFlavor("Chocolate");
        iceCream2.setPrice(4.32);
        iceCream2.setQuantity(1000);

        System.out.println("We sell " + iceCream2.getFlavor() + " ice creams at $" + iceCream2.getPrice() + " per cone. We can sell about " + iceCream2.getQuantity() + " ice creams per day.");

        System.out.println("-------------------------------------");

        iceCream2.sell(432);
        System.out.println("There are " + iceCream2.getQuantity() + " left in the inventory.");
    }
}
