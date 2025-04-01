package com.test.structural.adapter;

public class Demo
{
    public static void main(String[] args)
    {
        UI oldUI = new OldUI();
        oldUI.show("100");

        UI uiAdapter = new UIAdapter();
        uiAdapter.show("100");
    }
}
