package com.store.data.generator.models;

public enum ItemSize
{
    SMALL,
    MEDIUM,
    LARGE,
    XL,
    XXL;

    public double getAdditionalStorageCostIndexPerMonth()
    {
        switch (ItemSize.valueOf(this.toString()))
        {
            case SMALL:
                return 0;
            case MEDIUM:
                return 1;
            case LARGE:
                return 2;
            case XL:
                return 3;
            case XXL:
                return 4;
            default:
                return 5;
        }
    }
}
