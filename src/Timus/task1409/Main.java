package Timus.task1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int numberBanok = a + b - 1;

        int harry = numberBanok - a;
        int larry = numberBanok - b;

        out.println(harry + " " + larry);
        out.flush();
    }
}
