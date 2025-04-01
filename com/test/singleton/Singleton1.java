package com.test.singleton;

import javax.management.InstanceAlreadyExistsException;

public class Singleton1 implements Cloneable
{
    //Eager initialization

  //  private static volatile Singleton1 singleton1 = new Singleton1();
    private static volatile Singleton1 singleton1;

    private Singleton1() throws InstanceAlreadyExistsException
    {
        if (singleton1 != null)
        {
            throw new InstanceAlreadyExistsException("Instance exists");
        }
    }
    public Singleton1 readResolve()
    {
        return singleton1;
    }

    public static Singleton1 getInstance() throws InstanceAlreadyExistsException {
       if(singleton1 == null)
       {
           synchronized(Singleton1.class)
           {
               if(singleton1 == null)
               {
                   singleton1 = new Singleton1();
               }
           }
       }
       return singleton1;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
}
