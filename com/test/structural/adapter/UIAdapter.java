package com.test.structural.adapter;

public class UIAdapter implements UI
{
    private final NewUI newUI;

    public UIAdapter()
    {
        newUI = new NewUI();
    }

    @Override
    public void show(String data)
    {
        newUI.show(Integer.valueOf(data));
    }
}
