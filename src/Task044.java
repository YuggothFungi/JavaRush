package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Переходим дорогу вслепую
*/

public class Task044 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sT = reader.readLine();
        Double nT = Double.parseDouble(sT);
        Double i = nT % 10;
        if (i >= 0 && i < 3 || i >= 5.0 && i < 8)
            System.out.println("зелёный");
        else
        if (i >= 3 && i < 4 || i >= 8 && i < 9)
            System.out.println("жёлтый");
        else
            System.out.println("красный");
    }
}