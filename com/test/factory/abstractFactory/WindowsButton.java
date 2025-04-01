package com.test.factory.abstractFactory;

public class WindowsButton implements Button
{
    @Override
    public void render()
    {
        System.out.println("Rendering windows button");
    }
}
