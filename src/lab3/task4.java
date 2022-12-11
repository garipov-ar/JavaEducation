package lab3;

import java.util.Scanner;
//Напишите программу, в которой пользователем вводится два
//целых числа. Программа выводит все целые числа — начиная с наименьшего
//(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//чисел). Предложите разные версии программы (с использованием разных
//операторов цикла)
public class task4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите первое целое число ");
        int a = id.nextInt();
        System.out.println("Введите второе целое число ");
        int b = id.nextInt();

        sortirovka.For(a, b);
        sortirovka.While(a, b);
    }

    static class sortirovka {
        static void For(int a, int b) {
            System.out.println("Первая версия с оператором for");
             if (a > b) {
                 for (int b1 = b; b1 <= a; b1++) {
                     System.out.printf("%d, ", b1);
                 }
             } else {
                 for (int a1 = a; a1 <= b; a1++) {
                     System.out.printf("%d, ", a1);
                 }
             }
             System.out.println("конец");
        }
        static void While(int a, int b) {
            System.out.println("Первая версия с оператором while");
            if (a > b) {
                while (b <= a) {
                    System.out.printf("%d, ", b);
                    b++;
                }
            }
            else {
                while (a <= b) {
                    System.out.printf("%d, ", a);
                    a++;
                }
            }
            System.out.println("конец");
        }
    }
}
