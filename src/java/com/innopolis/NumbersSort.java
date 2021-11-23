package com.innopolis;

import java.util.Arrays;

public class NumbersSort {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;

            System.out.println(Arrays.toString(array));
        }
    }

    public static boolean search(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;
        int middle = left + (right - left) / 2;

        while (left <= right) {
            if (element < array[middle]) {
                right = middle - 1;
            } else if (element > array[middle]) {
                left = middle + 1;
            } else {
                return true;
            }
            middle = left + (right - left) / 2;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {45, 10, -1, 40, 25, 30, -5, 8};
        System.out.println(search(a, 30));
        System.out.println(search(a, 100));
        selectionSort(a);
        System.out.println(binarySearch(a, 30));
        System.out.println(binarySearch(a, 100));
    }
}
