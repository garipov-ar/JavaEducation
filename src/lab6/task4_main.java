package lab6;
import java.util.Scanner;

public class task4_main {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите число, двойной факториал которого необходимо найти: ");
        int factor = id.nextInt();
        task4.factWithRecursion(factor);
        task4.factWithoutRecursion(factor);
    }
}