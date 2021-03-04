package com.mcdermid;

import java.util.Comparator;

/**
 * A wrapper for several sorting algorithms, notably Selection Sort, Merge Sort, and Quicksort.
 */
public class Sorter<T> {

    /**
     * Sorts an array of custom objects using the provided {@link Comparator} such that
     * the comparator is consistent with equals and returns positive if, given c.compare(x, y),
     * x is greater, and negative if y is greater.
     * @param arr the array to be sorted
     * @param comparator the comparator used to sort the array
     * @param <T> Any custom object
     */
    public static <T> void selectionSort(T[] arr, Comparator<T> comparator) {
        int length = arr.length; // fetch array length
        for (int i = 0; i < length - 1; i++) {
            int min = i; // default min value
            for (int j = i + 1; j < length; j++) {
                if (comparator.compare(arr[i], arr[min]) < 0) {
                    min = j;
                }
            }
            //swap
            T tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }


    /**
     * Sorts a string array lexicographically using SelectionSort.
     * @param arr The array of Strings to be sorted
     */
    public static void selectionSort(String[] arr) {
        int length = arr.length; // fetch array length
        for (int i = 0; i < length - 1; i++) {
            int min = i; // defailt min value
            for (int j = i + i; j < length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) { // if arr[j] is lexicographically lesser than min
                    min = j; // then reassign min
                }
            }
            //swap
            String tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }

    /**
     * Sorts an integer array using SelectionSort
     * @param arr The array of integers to be sorted
     */
    public static void selectionSort(int[] arr) {
        int  length= arr.length; // fetch array length
        for (int i = 0; i < length - 1; i++) {
            int min = i; // default minimum value is first value
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j; // if the current value is lower than the minimum value, reassign minimum value
                }
            }
            // swap first and minimum values
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    /**
     * Sorts a character array by char value using SelectionSort
     * @param arr the array of characters to be sorted
     */
    public static void selectionSort(char[] arr) {
        int length= arr.length; // fetch array length
        for (int i = 0; i < length - 1; i++) {
            int min = i; // default minimum value is first value
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j; // if the current value is lower than min, reassign min
                }
            }
            // swap values
            char temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selectionSort(double[] arr) {
        int length = arr.length; // fetch array length
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i - 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            double tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void selectionSort(float[] arr) {
        int length = arr.length; // fetch array length
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i - 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            float tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void mergeSort(int[] arr) {
        //TODO: add mergeSorts for all primitives, Strings, and custom objects
    }
}
