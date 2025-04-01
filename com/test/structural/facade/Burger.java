package com.test.structural.facade;

public class Burger implements Food
{
    @Override
    public void prepareFood(String ingredients)
    {
        System.out.println("Burger is prepared with - "+ingredients);
    }
}
