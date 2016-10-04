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

    public Level getLevel()
    {
        return level;
    }

    public Department getDepartment()
    {
        return department;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", level=" + level +
                ", department=" + department +
                '}';
    }

    public Employee(final long id,
                    final String firstName,
                    final String lastName,
                    final Level level,
                    final Department department)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.level = level;
        this.department = department;
    }

    private final long id;
    private final String firstName;
    private final String lastName;
    private final Level level;
    private final Department department;
}
