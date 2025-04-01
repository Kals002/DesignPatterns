package com.test.factory.abstractFactory;

public class MacCheckBox implements CheckBox
{
    @Override
    public void render()
    {
        System.out.println("Rendering Mac checkbox");
    }
}
