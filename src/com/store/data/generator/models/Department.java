package com.store.data.generator.models;

public enum Department
{
    MEN,
    WOMEN,
    GIRLS,
    BOYS;

    public int getStaffSize()
        {

        switch (Department.valueOf(this.name()))
        {
            case MEN:
                return 1103;

            case WOMEN:
                return 1263;

            case GIRLS:
                return 1453;

            case BOYS:
                return 1312;

            default:
                throw new RuntimeException("Reached invalid location in Department.getStaffSize()");
        }

    }
}
