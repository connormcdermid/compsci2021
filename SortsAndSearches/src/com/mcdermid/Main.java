package com.mcdermid;

import java.util.Arrays;

/**
 * @author Connor McDermid
 * Date: 2021-03-08
 * Looking through the project I now realise I only ever needed sorters and searchers for integers.
 * However, I wrote all the junk that's there, and it works, so I'm leaving it in.
 * Consider my extra being generics, even though an extra is not specifically required.
 *
 * Selection sort works by comparing every element to every other element.
 * Merge Sort is a divide-and-conquer algorithm that recursively sorts sub-arrays of the array, then
 * recombines them.
 * Selection Sort is slower, but sorts in-place, making it memory efficient.
 * Merge Sort is faster, but takes much more memory, as it must clone the entire array.
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 54, 3245, 643, 753, 34254, 654656, 11, 0, 8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Searcher.linearSearch(arr, 8));
        Sorter.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted with Merge Sort: " + Arrays.toString(arr));
        System.out.println("Searched with Binary Search: " + Searcher.binarySearch(arr, 0, arr.length, 8));
    }
}
