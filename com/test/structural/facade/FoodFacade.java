package com.test.structural.facade;

public class FoodFacade
{
    public void getFood(String name)
    {
        if(name.equalsIgnoreCase("burger"))
        {
            Food burger = new Burger();
            String burgerIngredients = "Bread, tomato, sauce";
            burger.prepareFood(burgerIngredients);

        }
        else if(name.equalsIgnoreCase("pizza"))
        {
            Food pizza = new Pizza();
            String pizzaIngredients = "Onion, bread";
            pizza.prepareFood(pizzaIngredients);
        }
        else
        {
            System.out.println("Invalid food selection");
        }
    }
}
