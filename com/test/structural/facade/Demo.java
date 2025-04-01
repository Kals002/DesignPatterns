package com.test.structural.facade;

public class Demo
{
    public static void main(String[] args)
    {
//        Food pizza = new Pizza();
//        String pizzaIngredients = "Onion, bread";
//
//        pizza.prepareFood(pizzaIngredients);
//
//        Food burger = new Burger();
//        String burgerIngredients = "Bread, tomato, sauce";
//
//        burger.prepareFood(burgerIngredients);

        FoodFacade facade = new FoodFacade();
        facade.getFood("Pizza");

        facade.getFood("Burger");
    }
}
