package lab1;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число ");
        int n = in.nextInt();

        int n1 = n-1;
        int n2 = n+1;
        int n3 = n*n;

        System.out.println(n1 + " " + n + " " + n2 + " " + n3);


    }
}
