package Timus.task_1619;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k, m;

        n = scan.nextInt();
        while (n-- > 0) {
            k = scan.nextInt();
            m = scan.nextInt();
            if (k < m) {
                System.out.println("0");
            }
            else {
                // C(k + m, m) - C(k + m, m - 1)
                System.out.println(1.0 - m / (k + 1.0));
            }
        }
    }
}
