package com.test.factory.factoryMethod;



public class OSFactory
{
    //Not asking client to provide the name of which object he wants.

    public static void main(String[] args) {

        Factory androidFactory = new AndroidFactory();
        System.out.println(androidFactory.getOS().osName());

        Factory iosF = new IOSFactory();
        System.out.println(iosF.getOS().osName());
    }

}
