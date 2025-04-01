package com.test.structural.decorator;

public class PassengerCar extends CarDecorator
{
    public PassengerCar()
    {

    }

    public PassengerCar(Car car)
    {
        super(car);
    }

    @Override
    public void design()
    {
        super.design();
        System.out.println("Passenger car");
    }
}
