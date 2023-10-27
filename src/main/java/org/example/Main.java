package org.example;

public class Main {
    public static <string> void main(String[] args) {
        /* Сравнение*/
        int a = 10;
        int b = 11;
        if (a > b) {
            System.out.println("Первое число больше второго");
        } else {
            System.out.println("Первое число меньше второго");
        }
        /*Переполнение*/
        float r=1234567890;
        float d =1234567890;
        float Result=r+d;
         System.out.println("Результат переполнения :"+Result);

         /*Использование int double*/
        int x = 2147483647;
        float y = x;            // от типа int к типу float
        System.out.println("Результат вычисления :"+y);
    }
    }


