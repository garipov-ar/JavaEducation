package lab1;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число ");
        int n1 = in.nextInt();
        System.out.println("Введите второе число ");
        int n2 = in.nextInt();

        System.out.println("Сумма чисел = " + (n1 + n2));
        System.out.println("Разность чисел = " + (n2 - n1));


    }
}
