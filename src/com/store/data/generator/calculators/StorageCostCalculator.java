package com.store.data.generator.calculators;

import com.store.data.generator.models.ItemSize;
import com.store.data.generator.models.ItemType;

public class StorageCostCalculator
{
    public double calculateCost(
            final ItemType itemType,
            final ItemSize itemSize)
    {
        return itemType.getBaseStorageCostPerMonth()
                + itemType.getBaseStorageCostPerMonth()
                    * (itemSize.getAdditionalStorageCostIndexPerMonth() * itemType.getStorageCostIncreasePerSizeIncrease());

    }
}
