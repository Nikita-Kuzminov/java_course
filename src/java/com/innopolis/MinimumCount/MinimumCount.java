package com.innopolis.MinimumCount;

//На вход подается последовательность чисел, оканчивающихся на -1.
//
//Необходимо вывести число, которое присутствует в последовательности минимальное количество раз.
//
//Сложность алгоритма - O(n)

import java.util.Arrays;

public class MinimumCount {

    public static int minimumCount(int[] array) {
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == temp) {
                continue;
            }
            temp = array[i];
        }
        return temp;
    }


        public static void main (String[] args){
            int[] a = {2, 1, 2, -1, -1};
            System.out.println(minimumCount(a));

        }
    }
