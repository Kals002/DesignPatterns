package com.test.factory.abstractFactory;

public class App
{
    public static void main(String[] args)
    {
//        Button windowsButton = new WindowsButton();
//        windowsButton.render();
//
//        CheckBox windowsCheckBox = new WindowsCheckBox();
//        windowsCheckBox.render();

        GUI windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.button();
        windowsButton.render();

        GUI macFactory = new MacFactory();
        CheckBox macCheckBox = macFactory.checkBox();
        macCheckBox.render();
    }
}
