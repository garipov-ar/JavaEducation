package Timus.task_1068;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = ((a<0)? (-1) : 1)*(a*(a+((a<2)? (-1) : 1))/2) + ((a<2) ? 1 : 0);
        out.println(b);
        out.flush();
    }
}
