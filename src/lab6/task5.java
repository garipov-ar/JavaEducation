package lab6;
/*
Напишите программу со статическим методом, которым вычисляется сумма квадратов натуральных чисел
1^2 + 2^2 + 3^2 + ... + n^2. Число п передается аргументом методу. Для проверки результата можно использовать формулу
1^2 + 2^2 +3^2+…+n^2=(n+l) (2n + 1)/6
 */
public class task5 {
    static int score = 0;
    static void sqrWithoutRecursion(int sqr) {
        int score = 0;
        for (int i = 1; i <= sqr; i++) {
            score += Math.pow(i, 2);
        }
        System.out.println("Сумма квадратов натуральных чисел до " + sqr + " = " + score);
    }

    static void sqrWithRecursion(int sqr) {
        if (sqr > 0) {
            score += Math.pow(sqr, 2);
            sqr--;
            sqrWithRecursion(sqr);
        } else if (sqr == 0) {
            System.out.println(score);
        }
    }
    //смотри далее task5_main
}