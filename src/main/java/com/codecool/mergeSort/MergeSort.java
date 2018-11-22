package com.codecool.mergeSort;

public class MergeSort {

    public static void mergeSort(int[] arr, int size) {
        if (size < 2) {
            return;
        }
        int mid = size / 2;
        int[] l = new int[mid];
        int[] r = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }
        for (int i = mid; i < size; i++) {
            r[i - mid] = arr[i];
        }
        mergeSort(l, mid);
        mergeSort(r, size - mid);

        merge(arr, l, r, mid, size - mid);
    }

    public static void merge(int[] arr, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] < r[j]) {
                arr[k++] = l[i++];
            }
            else {
                arr[k++] = r[j++];
            }
        }
        while (i < left) {
            arr[k++] = l[i++];
        }
        while (j < right) {
            arr[k++] = r[j++];
        }
    }

}

