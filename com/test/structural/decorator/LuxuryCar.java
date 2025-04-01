package com.test.structural.decorator;

public class LuxuryCar extends CarDecorator
{
    public LuxuryCar()
    {

    }

    public LuxuryCar(Car car)
    {
        super(car);
    }
    @Override
    public void design()
    {
        super.design();
        System.out.println("Luxury car");
    }
}
