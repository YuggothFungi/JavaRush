package com.javarush.task.task01.task0132;

/*
Сумма цифр трехзначного числа
*/

public class Task0312 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a = number % 10;
        int b = number / 10;
        int c = b % 10;
        int d = b / 10;
        return a + c + d;
    }
}