package com.innopolis.FingIndex;

public class FindIndex {
    public static int getIndex(int[] array, int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] a = {1, 76, 45, 9, 5};
        System.out.println(getIndex(a, 5));
    }
}
