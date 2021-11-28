package com.innopolis.MinimumCount;

//На вход подается последовательность чисел, оканчивающихся на -1.
//
//Необходимо вывести число, которое присутствует в последовательности минимальное количество раз.
//
//Сложность алгоритма - O(n)

import java.util.Arrays;

public class MinimumCount {

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            array[minIndex] = array[i];
            array[i] = min;

        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int searchIndexOfMinimumCountNumber(int[] array) {
        int count = array[0];
        int countMin = array[0];

        for (int k = 0; k < array.length; k++) {

        }
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 2};
        int[] sortedArray = selectionSort(a);
        int minimumCount = searchIndexOfMinimumCountNumber(sortedArray);
    }
}
