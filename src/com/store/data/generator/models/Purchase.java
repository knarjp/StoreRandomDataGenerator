package com.store.data.generator.models;

import org.joda.time.DateTime;

public class Purchase
{
    public long getId()
    {
        return id;
    }

    public int getSellingPrice()
    {
        return sellingPrice;
    }

    public DateTime getDate()
    {
        return date;
    }

    public long getItemId()
    {
        return itemId;
    }

    public long getEmployeeId()
    {
        return employeeId;
    }

    public Purchase(final long id,
                    final int sellingPrice,
                    final DateTime date,
                    final long itemId,
                    final long employeeId)
    {
        this.id = id;
        this.sellingPrice = sellingPrice;
        this.date = date;
        this.itemId = itemId;
        this.employeeId = employeeId;
    }

    private final long id;
    private final int sellingPrice;
    private final DateTime date;
    private final long itemId;
    private final long employeeId;
}
