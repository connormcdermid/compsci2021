package com.mcdermid;

import java.util.Arrays;
import java.util.Comparator;

/**
 * A wrapper for several sorting algorithms, notably Selection Sort, and merge sort.
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

    @SuppressWarnings("unchecked")
    public static void merge(Object[] arr, int l, int m, int r, Comparator comparator) {
        // Find sizes of two subarrays to be merged
        int len1 = m - l + 1;
        int len2 = r - m;

        //create temporary arrays
        //no generic arrays in java *sigh*, so Objects it is.
        //because I am not writing this method more than once.
        //regarding all the unchecked casts, I can guarantee these arrays will be of type T.
        Object[] L = new Object[len1];
        Object[] R = new Object[len2];

        //copy data
        for (int i = 0; i < len1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < len2; ++j)
            R[j] = arr[m + 1 + j];

        //begin merge

        // initial indices
        int i = 0, j = 0;

        // initial indices of merged array
        int k = l;
        while (i < len1 && j < len2) {
            if (comparator.compare(L[i], R[j]) < 0) { //yeah, yeah, unchecked casts, I get it.
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements
        while (i < len1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // copy remaining elements
        while (j < len2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - 1) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            //yes, I realise I've written myself into what's probably a little extra work, but it's good practice,
            //no?
            // conversion oneliner from https://stackoverflow.com/a/27043087/7327253
            merge(Arrays.stream(arr).boxed().toArray(Integer[]::new), l, mid, r, new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    return a.compareTo(b);
                }
            });
        }
    }

    public static void mergeSort(char[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - 1) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            // conversion oneliner from https://stackoverflow.com/a/27690990/7327253
            merge(arr.toString().chars().mapToObj(c -> (char)c).toArray(Character[]::new),
                    l, mid, r, new Comparator<Character>() {
                public int compare(Character a, Character b) {
                    return a.compareTo(b);
                }
            });
        }
    }

    public static void mergeSort(double[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - 1) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);


            merge(Arrays.stream(arr).boxed().toArray(Double[]::new), l, mid, r, new Comparator<Double>() {
                public int compare(Double a, Double b) {
                    return a.compareTo(b);
                }
            });
        }
    }

    public static void mergeSort(String[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - 1) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            //so much simpler because it's already an Object
            merge(arr, l, mid, r, new Comparator<String> () {
                public int compare(String a, String b) {
                    return a.compareTo(b);
                }
            });
        }
    }
}
