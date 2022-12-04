package lab2;

//Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: число делится на 4, и при
//этом оно не меньше 10

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scan.nextInt();

        boolean mod4 = i % 4 == 0;

        if (mod4 && i >= 10) {
            System.out.printf("%d удовлетворяет критериям", i);
        }  else {
            System.out.printf("%d не удовлетворяет критериям.", i);
        }

    }
}
