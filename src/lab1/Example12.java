package lab1;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Введите Ваше имя ");
        String name = in.nextLine();

        System.out.println("Введите Ваш возраст ");

        if (in.hasNextInt()) {
            int age = in.nextInt();
            System.out.println("Пользователь " + name + " " + (2022 - age) + " года рождения");
        } else {
            System.out.println("что-то не то..");
        }
    }
}