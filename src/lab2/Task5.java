package lab2;
//Напишите программу, которая проверяет, сколько тысяч во введенном
//пользователем числе (определяется четвертая цифра справа в десятичном
//представлении числа).

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scan.nextInt();
        System.out.println("Количество тысяч в числе: " + (i/1000)%10);
    }
}
