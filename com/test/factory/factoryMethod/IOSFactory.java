package com.test.factory.factoryMethod;

public class IOSFactory implements Factory
{
    @Override
    public OS getOS() {
        return new IOS();
    }
}
