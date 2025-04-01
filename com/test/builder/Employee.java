package com.test.builder;

public class Employee
{
    private int id;
    private String name;
    private String deptName;
    private String collegeName;
    private double salary;

    public Employee(int id, String name, String deptName, String collegeName, double salary)
    {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.collegeName = collegeName;
        this.salary = salary;
    }

    public Employee(EmployeeBuilder employeeBuilder)
    {
        this.id = employeeBuilder.getId();
        this.name = employeeBuilder.getName();
        this.deptName = employeeBuilder.getDeptName();
        this.collegeName = employeeBuilder.getCollegeName();
        this.salary = employeeBuilder.getSalary();
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", salary=" + salary +
                '}';
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
}
