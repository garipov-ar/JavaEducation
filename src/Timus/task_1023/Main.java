package Timus.task_1023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long a = 3;
        long b;

        Scanner in = new Scanner(System.in);
        b = in.nextLong();
        while (b % a != 0) {
            a++;
        }
        System.out.println(a - 1);
    }
}
