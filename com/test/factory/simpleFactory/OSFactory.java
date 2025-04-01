package com.test.factory.simpleFactory;

public class OSFactory
{
    public String osName(String name)
    {
        if(name.equalsIgnoreCase("Android"))
        {
            return new Android().getOS();
        }
        else if(name.equalsIgnoreCase("Mac"))
        {
            return new Mac().getOS();
        }
        else if(name.equalsIgnoreCase("ios"))
        {
            return "ios";
        }
        else
        {
            return "Invalid os name";
        }
    }

    public static void main(String[] args)
    {
        OSFactory android = new OSFactory();
        System.out.println(android.osName("android"));

        System.out.println(android.osName("Macc"));

    }
}
