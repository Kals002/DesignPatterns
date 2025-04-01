package com.test.singleton;

import javax.management.InstanceAlreadyExistsException;

public class Singleton1Test
{
    public static void main(String[] args) throws InstanceAlreadyExistsException
    {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s2 = Singleton1.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

    }
}
