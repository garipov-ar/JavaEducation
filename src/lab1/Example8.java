package lab1;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Введите название текущего дня недели: ");
        String day = in.nextLine();

        System.out.println("Введите текущий месяц: ");
        String month = in.nextLine();

        System.out.println("Введите сегодняшнее число месяца ");
        String number = in.nextLine();

        System.out.println("Сегодня " + day + " " + number + " " + month);
    }
}
