package com.store.data.generator.generators;

import com.store.data.generator.models.Name;
import com.store.data.generator.utils.NameRetriever;

import java.io.IOException;

public class NameGenerator
{
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
