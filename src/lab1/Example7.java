package lab1;
import java.util.Scanner;

public class Example7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Имя: ");
        String name = in.nextLine();

        System.out.println("Введите возраст: ");
        int age = in.nextInt();


        if (age < 5 | age >21)
            System.out.println("Пользователю " + name + " " + age + " года" );



    }

    }
