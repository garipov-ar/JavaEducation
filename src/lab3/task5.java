package lab3;

import java.util.Random;
import java.util.Scanner;

//Напишите программу, в которой вычисляется сумма чисел,
//удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
//вводится пользователем. Программа отображает числа, которые
//суммируются, и значение суммы. Предложите версии программы,
//использующие разные операторы цикла
public class task5 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите колличество чисел в сумме");
        int a = id.nextInt();

        Summa.While(a);
        Summa.For(a);
    }

    private class Summa {
        private static void While(int a) {
            System.out.println("Версия программы с оператором while");
            int sum = 0;
            Random random = new Random();
            int a1 = a;
            while (a1 > 0) {
                int numbs = random.nextInt(100);
                if (numbs % 5 == 2 || numbs % 3 == 1) {
                    System.out.printf("%d, ", numbs);
                    sum = sum + numbs;
                    a1--;
                }
            }
            System.out.printf("Сумма чисел: %d", sum);
        }
        private static void For(int a) {
            System.out.println("\n\nВерсия программы с оператором for");
            int sum = 0;
            for (int i = 0; a > 0; i++) {
                if (i % 5 == 2 || i % 3 == 1) {
                    System.out.printf("%d, ", i);
                    sum = sum + i;
                    a--;
                }
            }
            System.out.printf("Сумма чисел: %d", sum);
        }
    }
}
