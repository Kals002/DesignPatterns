package com.test.structural.facade;

public class Pizza implements Food
{
    @Override
    public void prepareFood(String ingredients)
    {
        System.out.println("Pizza is prepared with - "+ingredients);
    }
}
