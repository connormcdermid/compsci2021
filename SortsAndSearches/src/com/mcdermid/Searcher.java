package com.mcdermid;

import java.util.Comparator;

public class Searcher {

    /**
     * A linear search program for an unsorted integer array. Returns the position of the first match.
     * @param arr The array to be searched
     * @param target The target to match
     * @return The index of the target -- if not found, returns -1
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * A linear search program for an unsorted character array. Returns the position of the first match.
     * @param arr The array to be searched
     * @param target The target to match
     * @return The index of the target -- if not found, returns -1
     */
    public static int linearSearch(char[] arr, char target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * A linear search program for an unsorted double array. Returns the position of the first match.
     * @param arr The array to be searched
     * @param target The target to match
     * @return The index of the target -- if not found, returns -1
     */
    public static int linearSearch(double[] arr, double target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * A linear search program for an unsorted float array. Returns the position of the first match.
     * @param arr The array to be searched
     * @param target The target to match
     * @return The index of the target -- if not found, returns -1
     */
    public static int linearSearch(float[] arr, float target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * A linear search program for an unsorted boolean array. Returns the position of the first match.
     * @param arr The array to be searched
     * @param target The target to match
     * @return The index of the target -- if not found, returns -1
     */
    public static int linearSearch(boolean[] arr, boolean target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * A linear search program for an unsorted {@link String} array. Returns the position of the first match.
     * @param arr The array to be searched
     * @param target The target to match
     * @return The index of the target -- if not found, returns -1
     */
    public static int linearSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * A linear search program for an unsorted custom object array. Returns the position of the first match.
     * @param arr The array to be searched
     * @param target The target to match
     * @param comparator The comparator determining the equality of the objects
     * @param <T> The custom object
     * @return The index of the target -- if not found, returns -1
     */
    public static <T> int linearSearch(T[] arr, T target, Comparator<T> comparator) {
        for (int i = 0; i < arr.length; i++) {
            if (comparator.compare(arr[i], target) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int beg, int end, int target) {
        if (beg >= end) {
            int mid =   beg + (end - 1) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearch(arr, beg, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, end, target);
            }
        }

        return -1;
    }

    public static int binarySearch(char[] arr, int beg, int end, char target) {
        if (beg >= end) {
            int mid =   beg + (end - 1) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearch(arr, beg, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, end, target);
            }
        }

        return -1;
    }

    public static int binarySearch(float[] arr, int beg, int end, float target) {
        if (beg >= end) {
            int mid =   beg + (end - 1) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearch(arr, beg, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, end, target);
            }
        }

        return -1;
    }

    public static int binarySearch(double[] arr, int beg, int end, double target) {
        if (beg >= end) {
            int mid =   beg + (end - 1) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                return binarySearch(arr, beg, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, end, target);
            }
        }

        return -1;
    }

    public static int binarySearch(String[] arr, int beg, int end, String target) {
        if (beg >= end) {
            int mid = beg + (end - 1) / 2;

            if (arr[mid].equals(target)) {
                return mid;
            } else if (arr[mid].compareTo(target) > 0) {
                return binarySearch(arr, beg, mid - 1, target);
            } else {
                return binarySearch(arr, mid + 1, end, target);
            }
        }

        return -1;
    }

    public static <T> int binarySearch(T[] arr, int beg, int end, T target, Comparator<T> comparator) {
        if (beg > end) {
            int mid = beg + (end - 1) / 2;

            if (comparator.compare(arr[mid], target) == 0) {
                return mid;
            } else if (comparator.compare(arr[mid], target) > 0) {
                return binarySearch(arr, beg, mid - 1, target, comparator);
            } else {
                return binarySearch(arr, mid + 1, end, target, comparator);
            }
        }

        return -1;
    }
}


