package lab3;

import java.util.Scanner;

//Напишите программу, которая выводит последовательность чисел
//Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//следующее число равно сумме двух предыдущих (получается последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
//в последовательности вводится пользователем. Предложите версии
//программы, использующие разные операторы цикла.
public class task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности");
        int a = id.nextInt();

        Fibonacci.firstM(a);
        Fibonacci.secondM(a);

    }

    static class Fibonacci {
        static void firstM(int a) {
            System.out.println("Версия программы c операторм while");
            int b = a;
            long c = 0;
            long d = 1;
            long e = 1;
            while (b > 0) {
                System.out.printf("%d, ", e);
                e = c + d;
                c = d;
                d = e;
                b--;
            }
            System.out.println("конец цикла");
        }

        static void secondM(int a) {
            System.out.println("Версия программы с оперотором for");
            long b = 0;
            long c = 1;
            long e = 1;
            for (int a1 = a; a1 > 0; --a1) {
                System.out.printf("%d, ", e);
                e = b +c;
                b = c;
                c = e;
            }
            System.out.println("Конец цикла");
        }
    }
}
