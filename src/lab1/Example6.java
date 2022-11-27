package lab1;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Фамилию: ");
        String sname = in.nextLine();

        System.out.println("Введите Имя: ");
        String name = in.nextLine();

        System.out.println("Введите Отчество: ");
        String otchestvo = in.nextLine();

        System.out.print("Hello " + sname + " " + name + " " + otchestvo + "!");
        in.close();
    }
}