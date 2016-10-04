package com.store.data.generator.models;

public enum ItemType
{
    SHIRT,
    SHORTS,
    JEANS,
    HAT,
    BELT,
    SOCKS;

    public double getBaseStorageCostPerMonth()
    {
        switch (ItemType.valueOf(this.toString()))
        {
            case SHIRT:
                return 0.02;
            case SHORTS:
                return 0.018;
            case JEANS:
                return 0.022;
            case HAT:
                return 0.015;
            case BELT:
                return 0.012;
            case SOCKS:
                return 0.01;
            default:
                return 0.015;
        }
    }

    public double getStorageCostIncreasePerSizeIncrease()
    {
        switch (ItemType.valueOf(this.toString()))
        {
            case SHIRT:
                return 0.01;
            case SHORTS:
                return 0.01;
            case JEANS:
                return 0.015;
            case HAT:
                return 0.005;
            case BELT:
                return 0.003;
            case SOCKS:
                return 0.001;
            default:
                return 0.008;
        }
    }
}
