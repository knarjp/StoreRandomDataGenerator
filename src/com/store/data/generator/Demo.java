package com.store.data.generator;

import com.store.data.generator.generators.ItemGenerator;
import com.store.data.generator.models.Item;
import com.store.data.generator.models.ItemType;

import java.util.LinkedList;

/**
 * Purchases:
 * 1- Make sure number of items sold doesn't exceed current inventory
 * 2-
 *
 * Tracking stolen items
 *
 * Tracking how fast items sell
 *
 * Tracking Employee Performance
 *
 * Tracking Department Performance
 *
 * Comparing Department maintenance costs vs Department profits
 *
 * Tracking item sales to find which one are seasonal and when
 */
public class Demo
{
    public static void main(String args[])
    {
        final ItemGenerator itemGenerator = new ItemGenerator();
        final LinkedList<Item> items = itemGenerator.listAllCombinations();

        for (final Item item : items)
        {
            System.out.println(items);
        }

        System.out.println(items.size());
    }
}
