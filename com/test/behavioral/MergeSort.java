package com.test.behavioral;

public class MergeSort implements SortingStratgey
{
    /*
    When there are multiple algorithms then client can choose any of the algorithm in runtime
     */
    @Override
    public void sort()
    {
        System.out.println("Sorting using merge sort");
    }
}
