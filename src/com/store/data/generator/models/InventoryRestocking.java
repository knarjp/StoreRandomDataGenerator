package com.store.data.generator.models;

import org.joda.time.DateTime;

public class InventoryRestocking
{
    public long getId()
    {
        return id;
    }

    public long getItemId()
    {
        return itemId;
    }

    public DateTime getDateOfRestocking()
    {
        return dateOfRestocking;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public InventoryRestocking(final long id,
                               final long itemId,
                               final DateTime dateOfRestocking,
                               final int quantity)
    {
        this.id = id;
        this.itemId = itemId;
        this.dateOfRestocking = dateOfRestocking;
        this.quantity = quantity;
    }

    private final long id;
    private final long itemId;
    private final DateTime dateOfRestocking;
    private final int quantity;
}
