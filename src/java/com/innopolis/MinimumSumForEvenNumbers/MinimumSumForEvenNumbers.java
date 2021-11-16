package com.innopolis.MinimumSumForEvenNumbers;

import java.util.Scanner;

public class MinimumSumForEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int digitsSum = 0;
        int minDigitsSum = 37;

        while (a != -1) {
            digitsSum = 0;
            if (a % 2 == 0) {

                while (a != 0) {
                    //запоминаем последнюю цифру, так как
                    //оператор «/» - это остаток от деления
                    int lastDigit = a % 10;
                    digitsSum = digitsSum + lastDigit;
                    //отбрасываем от исходного числа последнюю цифру, так как
                    //оператор «/» - это деление на число без остатка
                    a = a / 10;
                }

                if (digitsSum < minDigitsSum) {
                    minDigitsSum = digitsSum;
                }
            }

            a = scanner.nextInt();
        }
        System.out.println("Result - " + minDigitsSum);

    }
}

//Ниже представлен метод считывания аргументов, передаваемых в командную строку
//while (i < args.length) {
//    System.out.println(args[i]);
//    i++;
//    }
