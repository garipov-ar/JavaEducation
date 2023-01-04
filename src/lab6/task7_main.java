package lab6;

import java.util.Random;
import java.util.Scanner;

public class task7_main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int rndm;

        System.out.print("Введите количество элементов массива: ");
        int numbers = in.nextInt();
        if (numbers <= 0) {
            System.out.print("Нет аргументов ");
        } else {
            System.out.print("Исходный массив ");
            char[] array = new char[numbers];
            for (int i = 0; i < array.length; i++) {
                rndm = random.nextInt(26);
                array[i] = (char) (rndm + 'A');
                System.out.print(array[i] + " ");
            }
            task7.Metod(array);
        }
    }
}
