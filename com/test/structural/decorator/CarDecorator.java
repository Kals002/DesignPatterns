package com.test.structural.decorator;

public class CarDecorator implements Car
{
    private Car car;

    public CarDecorator()
    {

    }

    public CarDecorator(Car car)
    {
        this.car = car;
    }

    @Override
    public void design()
    {
        this.car.design();
    }
}
