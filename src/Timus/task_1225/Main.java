package Timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long[] f = new long[46];

        f[1] = 2;
        f[2] = 2;

        for (int a = 3; a <= n; a++) {
            f[a] = f[a - 1] + f[a - 2];
        }
        System.out.println(f[n]);
        in.close();
    }
}
