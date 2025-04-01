package com.test.builder;

public class EmployeeBuilder
{
    private int id;
    private String name;
    private String deptName;
    private String collegeName;
    private double salary;

    public EmployeeBuilder setId(int id)
    {
        this.id = id;
        return this;
    }
    public EmployeeBuilder setName(String name)
    {
        this.name = name;
        return this;
    }
    public EmployeeBuilder setDeptName(String deptName)
    {
        this.deptName = deptName;
        return this;
    }
    public EmployeeBuilder setCollegeName(String collegeName)
    {
        this.collegeName = collegeName;
        return  this;
    }
    public EmployeeBuilder setSalary(double salary)
    {
        this.salary = salary;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public double getSalary() {
        return salary;
    }

    public Employee getEmployee()
    {
        return new Employee(this);
    }
}
