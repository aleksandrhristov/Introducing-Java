package com.clouway.quicksort;

import java.util.Arrays;

/**
 * Created by clouway on 13.04.16.
 */
public class QuickSort {
    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }


    private void quickSort(int[] arr, int left, int right) {

        int pivotIndex = left + (right - left) / 2;
        int pivotValue = arr[pivotIndex];

        int i = left, j = right;

        while (i <= j) {

            while (arr[i] < pivotValue) {
                i++;
            }

            while (arr[j] > pivotValue) {
                j--;
            }

            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }

            if (left < i) {
                quickSort(arr, left, j);
            }

            if (right > i) {
                quickSort(arr, i, right);
            }

        }

    }

}










