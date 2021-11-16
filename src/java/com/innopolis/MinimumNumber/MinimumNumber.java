package com.innopolis.MinimumNumber;
import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int min = number;

        while (number != -1) {
            if (min > number) {
                min = number;
            }
            number = scanner.nextInt();
        }
        System.out.println("Result - " + min);
    }
}
