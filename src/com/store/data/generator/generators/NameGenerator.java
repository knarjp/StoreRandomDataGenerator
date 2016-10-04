package com.store.data.generator.generators;

import com.store.data.generator.models.Name;
import com.store.data.generator.utils.NameRetriever;

import java.io.IOException;
import java.util.Random;

public class NameGenerator
{
    public Name getRandomName() throws IOException
    {
        final Random random = new Random();
        switch(random.nextInt(2))
        {
            case 0:
                return getMaleName();
            case 1:
                return getFemaleName();
            default:
                throw new RuntimeException("Reached invalid location in NameGenerator.getRandomName()");
        }
    }

    public Name getMaleName() throws IOException
    {
        return new Name(nameRetriever.getMaleFirstName(), nameRetriever.getLastName());
    }

    public Name getFemaleName() throws IOException
    {
        return new Name(nameRetriever.getFemaleFirstName(), nameRetriever.getLastName());
    }

    public NameGenerator(final NameRetriever nameRetriever)
    {
        this.nameRetriever = nameRetriever;
    }

    private final NameRetriever nameRetriever;
}
