package UC16;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(capacities));

        SortUtility.bubbleSort(capacities);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(capacities));
    }
}