package com.test.factory.factoryMethod;

public class AndroidFactory implements Factory
{
    @Override
    public OS getOS()
    {
        return new Android();
    }
}
