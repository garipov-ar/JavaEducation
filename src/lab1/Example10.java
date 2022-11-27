package lab1;
import java.util.Scanner;


public class Example10 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Введите год вашего рождения ");


        if (in.hasNextInt()) {
            int bdate = in.nextInt();
            System.out.println("Ващ возраст " + (2022 - bdate));
        } else {
            System.out.println("что-то не то..");
        }







    }



}
