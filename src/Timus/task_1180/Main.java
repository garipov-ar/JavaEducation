package Timus.task_1180;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s = in.next();
        char[] ch;
        ch = s.toCharArray();
        int a = 0;
        for (char f : ch)
            a += f;
        out.println((a%3==0)?(2) : ("1" + "\n" + a % 3));
        out.flush();
    }
}
