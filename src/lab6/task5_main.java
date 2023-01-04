package lab6;
import java.util.Scanner;

public class task5_main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите число: ");
        int sqr = id.nextInt();
        System.out.print("Сумма квадратов натуральных чисел до " + sqr + " = ");
        task5.sqrWithRecursion(sqr);
        task5.sqrWithoutRecursion(sqr);
    }
}