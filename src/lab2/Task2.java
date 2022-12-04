package lab2;
import java.util.Scanner;

//Напишите программу, которая проверяет, удовлетворяет ли введенное
//пользователем число следующим критериям: при делении на 5 в остатке
//получается 2, а при делении на 7 в остатке получается 1.

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scan.nextInt();

        System.out.println("Проверяю, удовлетворяет ли введенное число следующим критериям: при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1 ");

        boolean mod5 = i % 5 == 2;
        boolean mod7 = i % 7 == 1;
        if (mod5 && mod7) {
            System.out.printf("%d удовлетворяет критериям", i);
        }  else {
            System.out.printf("%d не удовлетворяет критериям.", i);
        }
    }
}
