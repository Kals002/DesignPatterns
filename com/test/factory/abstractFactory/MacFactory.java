package com.test.factory.abstractFactory;

public class MacFactory implements GUI
{
    @Override
    public Button button() {
        return new MacButton();
    }

    @Override
    public CheckBox checkBox() {
        return new MacCheckBox();
    }
}
