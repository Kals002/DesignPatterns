package com.test.structural.decorator;

public class Demo
{
    public static void main(String[] args)
    {
        Car basicCar = new BasicCar();
        //basicCar.design();

       LuxuryCar luxuryCar = new LuxuryCar(basicCar);
       //luxuryCar.design();

        PassengerCar passengerCar = new PassengerCar(luxuryCar);
        passengerCar.design();

    }
}
