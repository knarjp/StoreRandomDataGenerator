package com.store.data.generator.models;

public enum Level
{
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE;

    public int getSalary()
    {
        switch (Level.valueOf(this.name()))
        {
            case ONE:
                return 35000;
            case TWO:
                return 37000;
            case THREE:
                return 40000;
            case FOUR:
                return 60000;
            case FIVE:
                return 70000;
            default:
                throw new RuntimeException("Reached invalid location in Level.getLevelSalary()");
        }
    }

    public double getDistrubution()
    {
        switch (this)
        {
            case ONE:
                return 0.4;
            case TWO:
                return 0.2;
            case THREE:
                return 0.2;
            case FOUR:
                return 0.1;
            case FIVE:
                return 0.1;
            default:
            throw new RuntimeException("Reached invalid location in Level.getLevelSalary()");
        }
    }
}
