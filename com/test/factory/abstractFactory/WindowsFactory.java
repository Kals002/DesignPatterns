package com.test.factory.abstractFactory;

public class WindowsFactory implements GUI
{
    @Override
    public Button button() {
        return new WindowsButton();
    }

    @Override
    public CheckBox checkBox() {
        return new WindowsCheckBox();
    }
}
