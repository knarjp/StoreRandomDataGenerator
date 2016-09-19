package com.store.data.generator.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NameRetriever
{
    public String getFemaleFirstName() throws IOException
    {
        String line;
        if((line = femaleFirstBufferedReader.readLine()) != null)
        {
            String[] splitLine = line.split(" ");
            return splitLine[0];
        }
        else
        {
            throw new RuntimeException("Reached end of file for female first names");
        }
    }

    public String getMaleFirstName() throws IOException
    {
        String line;
        if ((line = maleFirstBufferedReader.readLine()) != null)
        {
            String[] splitLine = line.split(" ");
            return splitLine[0];
        }
        else
        {
            throw new RuntimeException("Reached end of file for male first names");
        }
    }

    public String getLastName() throws IOException
    {
        String line;
        if ((line = lastBufferedReader.readLine()) != null)
        {
            String[] splitLine = line.split(" ");
            return splitLine[0];
        }
        else
        {
            throw new RuntimeException("Reached end of file for last names");
        }
    }


    public NameRetriever() throws IOException
    {
        maleFirstBufferedReader = new BufferedReader(new FileReader(FIRST_NAMES_MALE_FILE_NAME));
        femaleFirstBufferedReader = new BufferedReader(new FileReader(FIRST_NAMES_FEMALE_FILE_NAME));
        lastBufferedReader = new BufferedReader(new FileReader(LAST_NAMES_FILE_NAME));
    }

    private final static String FIRST_NAMES_MALE_FILE_NAME = "census-dist-male-first.txt";
    private final static String FIRST_NAMES_FEMALE_FILE_NAME = "census-dist-female-first.txt";
    private final static String LAST_NAMES_FILE_NAME = "dist.all.last.txt";

    private final BufferedReader maleFirstBufferedReader;
    private final BufferedReader femaleFirstBufferedReader;
    private final BufferedReader lastBufferedReader;
}
