package lab1;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Введите Ваше имя ");
        String name = in.nextLine();

        System.out.println("Введите год вашего рождения ");

        if (in.hasNextInt()) {
            int bdate = in.nextInt();
            System.out.println("Возраст пользователя " + name + " " + (2022 - bdate) + " года");
        } else {
            System.out.println("что-то не то..");
        }
    }
}
