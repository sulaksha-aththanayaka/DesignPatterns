package StrategyDesignPattern;

public class QuickSort implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Quick sort");
    }
}
