package com.test.builder;

public class App
{
    public static void main(String[] args)
    {
        EmployeeBuilder builder = new EmployeeBuilder();
        builder.setId(23);
        builder.setCollegeName("git");

        Employee employee = builder.getEmployee();
        System.out.println(employee);

       // Employee employee1 = new Employee(23, "", "", 2.0, "");

    }
}
