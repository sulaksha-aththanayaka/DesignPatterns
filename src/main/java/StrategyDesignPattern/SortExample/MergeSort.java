package StrategyDesignPattern.SortExample;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(int[] array){
        System.out.println("Merge sort");
    }
}