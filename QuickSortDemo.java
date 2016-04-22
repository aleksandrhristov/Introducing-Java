package com.clouway.quicksort;

import java.util.Arrays;

/**
 * Created by clouway on 13.04.16.
 */
public class QuickSortDemo {


    public static void main(String[] args) {
        QuickSort s = new QuickSort();
        int[] arr = new int[]{5, -5, -3, 2, 1, 6};

        s.quickSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


