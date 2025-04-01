package com.test.behavioral;

public class SortinContext
{
    private SortingStratgey sortingStratgey;

    public SortinContext(SortingStratgey sortingStratgey)
    {
        this.sortingStratgey = sortingStratgey;
    }

    public void getTheSortingAlgorithm()
    {
        sortingStratgey.sort();
    }
}
