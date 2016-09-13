package com.store.data.generator.models;

public class Employee
{
    public long getId()
    {
        return id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getSalary()
    {
        return salary;
    }

    public Department getDepartment()
    {
        return department;
    }

    public Employee(final long id,
                    final String firstName,
                    final String lastName,
                    final int salary,
                    final Department department)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    private final long id;
    private final String firstName;
    private final String lastName;
    private final int salary;
    private final Department department;
}
