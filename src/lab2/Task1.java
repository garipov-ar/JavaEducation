package lab2;
import java.util.Scanner;

//Напишите программу, которая проверяет, делится ли введенное Пользователем число на 3.

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scan.nextInt();
        boolean mod3 = i % 3 == 0;

        if (mod3) {
            System.out.printf("%d делится на 3.", i);
        }  else {
            System.out.printf("%d не делится 3.", i);
        }

    }
}
