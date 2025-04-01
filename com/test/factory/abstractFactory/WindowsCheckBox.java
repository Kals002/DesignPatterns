package com.test.factory.abstractFactory;

public class WindowsCheckBox implements CheckBox
{
    @Override
    public void render()
    {
        System.out.println("Rendering windows checkbox");
    }
}
