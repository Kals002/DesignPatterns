package com.test.behavioral;

public class Demo
{
    public static void main(String[] args)
    {
        SortinContext context = new SortinContext(new BubbleSort());
        context.getTheSortingAlgorithm();

        SortinContext context2 = new SortinContext(new MergeSort());
        context2.getTheSortingAlgorithm();

    }
}
