package StrategyDesignPattern.SortExample;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] array){
        System.out.println("Bubble sort");
    }
}

