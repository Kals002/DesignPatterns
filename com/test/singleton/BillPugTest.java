package com.test.singleton;

public class BillPugTest
{
    public static void main(String[] args)
    {
        BillPug b1 = BillPug.getBillPugInstance();
        BillPug b2 = BillPug.getBillPugInstance();

        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
