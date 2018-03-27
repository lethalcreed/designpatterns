package nl.yourivanleeuwen.storagestore;

import java.util.Scanner;

public class WebShop {

    public static void main(String[] args) {
        System.out.println("Welcome to the StorageStore!");
        System.out.println("What kind of storage device do you need?");

        new CategoryGenerator();

        System.out.println("Please make a choice by entering a product number and hit enter");

        ProductFactory productFactory = new ProductFactory();

        ProductComponent product = null;

        Scanner userInput = new Scanner(System.in);

        if (userInput.hasNextLine()) {
            String selectedProduct = userInput.nextLine();

            String optionalSata = "n";

            if (!selectedProduct.equals("3")) {
                System.out.println("Do you want a SataCable (€1.99) with you're drive? (y / n)");
                if (userInput.hasNextLine()) {
                        optionalSata = userInput.nextLine();
                    if (optionalSata.equals("y")) {
                        optionalSata = "y";
                    }
                }
            }

            product = productFactory.makeProduct(selectedProduct, optionalSata);

            if (product == null) {
                System.out.print("The selected product doesn't exist please try again");
            } else {
                System.out.println("You have chosen a " + product.getProductName());
                System.out.println("The total price will be: €" + product.getProductPrice());
                System.out.println("Thank you for shopping at the StorageStore! We will process you're order as quickly as possible");
            }
        }

    }

}