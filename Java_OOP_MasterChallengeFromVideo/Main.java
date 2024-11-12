/*
 * OOP MASTER CHALLENGE
 * 
 * #The challenge is to write an application for a food restaurant.
 * #Let's start by finding out some details about the restaurant and what is required.
 * 
 *  ----BILL'S BURGER CHALLENGE---
 * Bill runs a fast-food hamburger restaurant and sells hamburger meals.
 * His meal orders are composed of three items, the hamburger, the drink, and the side item.
 * Your challenge is to write an application to let Bill select the type of burgers 
 * and some of the additional items or extras that can be added to the burgers, as well as the actual pricing.
 * 
 * $$The Objects
 * 1.You need a meal order.
    ##This should be composed of exactly one burger, one drink, and one side item.
    ##The most common meal order should be created without any arguments, like a regular burger, a small coke, and fries, for example.
    ##You should be able to create other meal orders by specifying different burgers, drinks, and side items.
    ##You need a drink and side item.
    ##The drink should have at least a type, size, and price, and the price of the drink should change for each size.
    ##The side item needs at least a type and price.

    2.You need burgers
    ##Every hamburger should have a burger type, a base price, and up to a maximum of three extra toppings.
    ##The constructor should include only the burger type and price.
    ##Extra Toppings on a burger need to be added somehow and priced according to their type.
    ##The deluxe burger bonus.
    ##Create a deluxe burger meal with a deluxe burger that has a set price, so that any additional toppings do not change the price.
    ##The deluxe burger should have room for an additional two toppings.

 * $$ The Functionality

    -Your main method should have code to do the following:

    ##Create a default meal that uses the no arguments constructor.
    ##Create a meal with a burger and the drink and side item of your choice, with up to 3 extra toppings.
    ##Create a meal with a deluxe burger where all items, drink, side item, and up to 5 extra toppings are included in the burger price.

    -For each meal order, you'll want to perform these functions:
    
    ##Add some additional toppings to the burger.
    ##Change the size of the drink.
    ##Print the itemized list. This should include the price of the burger, any extra toppings, the drink price based on size, and the side item price.
    ##Print the total due amount for the meal.

 * 
 * 
 * 
 */

public class Main extends Object {

    public static void main(String[] args) {
        
        // Item coke = new Item("drink","coke", 1.50);
        // coke.printItem();
        // coke.setSize("LARGE");
        // coke.printItem();
        // coke.setSize("SMALL");
        // coke.printItem();

        // Item avocardo = new Item("topping", "avocado", 1.5);
        // avocardo.printItem();

        // Burger burger = new Burger("regular", 4.0);
        // burger.addTopping("ONION", "CHEESE", "MAYO");
        // burger.printItem();

        // MealOrder regularMeal = new MealOrder();
        // regularMeal.addBurgerTopping("Cheese", "tomatos", "avocado");
        // regularMeal.setDrinkSize("LARGE");
        // regularMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerTopping("AVACADO", "ONION", "TOMATOS","MAYO", "CHEESE");
        deluxeMeal.setDrinkSize("Small");
        deluxeMeal.printItemizedList();
        // MealOrder meal = new MealOrder();
        
        // meal.printItemizedList();


    }

}

