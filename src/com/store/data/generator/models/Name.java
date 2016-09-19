package com.store.data.generator.models;

public class Name
{

    public String getFullName()
    {
        return this.firstName + " " + this.lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public Name(
            final String firstName,
            final String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private final String firstName;
    private final String lastName;
}
