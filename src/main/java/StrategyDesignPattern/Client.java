package StrategyDesignPattern;

public class Client {
    public static  void main(String[] args){
        int[] array = {1, 2, 3};
        SortingContext sortingContext = new SortingContext(new BubbleSort());
        sortingContext.performSort(array);

        // Change strategy to merge sort
        sortingContext.setSortingStrategy((new MergeSort()));
        sortingContext.performSort(array);

        // Change strategy to quick sort
        sortingContext.setSortingStrategy(new QuickSort());
        sortingContext.performSort(array);
    }
}
