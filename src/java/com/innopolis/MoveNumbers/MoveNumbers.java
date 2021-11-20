package com.innopolis.MoveNumbers;

import java.util.Arrays;

public class MoveNumbers {

    public static int[] shiftZeroToRight(int[] array) {

        int[] newArray = new int[array.length];

        int count = 0;
        for (int number : array) {
            if (number != 0) {
                newArray[count] = number;
                count++;
            }
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 0, 2, 0, 3, 0, 0, 0};
        System.out.println(Arrays.toString(shiftZeroToRight(array)));

    }
}
