package lab2;
//Напишите программу, которая проверяет, попадает ли введение
//пользователем число в диапазон от 5 до 10 включительно.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scan.nextInt();

        if ( i > 5 && i <= 10) {
            System.out.printf("%d попадает в диапазон от 5 до 10 включительно", i);
        }  else {
            System.out.printf("%d не попадает в диапазон от 5 до 10 включительно", i);
        }
    }
}
