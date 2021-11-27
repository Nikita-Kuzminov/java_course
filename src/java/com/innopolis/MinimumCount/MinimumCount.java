package com.innopolis.MinimumCount;

//На вход подается последовательность чисел, оканчивающихся на -1.
//
//Необходимо вывести число, которое присутствует в последовательности минимальное количество раз.
//
//Сложность алгоритма - O(n)

import java.util.Arrays;

public class MinimumCount {

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

            array[minIndex] = array[i];
            array[i] = min;

        }
        System.out.println(Arrays.toString(array));
    }

    public static void searchIndexOfMinimumCountNumber(int[] array) {
        int count = 0;
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i+1] == array[i]) {
                count++;
            } else if (array[i+2] == array[i]) {
                count1++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 2};
        selectionSort(a);
//        searchIndexOfMinimumCountNumber(a);
    }
}
