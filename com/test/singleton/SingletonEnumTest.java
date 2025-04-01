package com.test.singleton;

public class SingletonEnumTest
{
    public static void main(String[] args)
    {
        SingletonEnum s1 = SingletonEnum.instance;
        SingletonEnum s2 = SingletonEnum.instance;

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
