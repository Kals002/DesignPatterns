package com.test.structural.adapter;

public class OldUI implements UI
{
    @Override
    public void show(String data)
    {
        System.out.println("Displaying "+data+" using old UI");
    }
}
