package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        while (true) {
            System.out.println("Ваш год рождения?");
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            if (a > 2026) {
                System.out.println("Ошибка, введите заново свой год рождения");
            } else break; };
            int age = 2026 - a;
            if (age < 18) {
                System.out.println("Вы несовершеннолетний");
            } else if (age > 18 && age < 65) {
                System.out.println("Вы взрослый");
            } else {
                System.out.println("Вы пенсионер");
            }
        }
    }