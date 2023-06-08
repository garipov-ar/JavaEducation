package Timus.task_1620;

import java.math.*;
import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, m, k;

        n = scan.nextInt();
        m = scan.nextInt();
        k = scan.nextInt();

        // [1] p = p / n  * (p - 1) + (1 - p / n) * (p + 1)
        // def pk = x / n ^ k;  x[k + 1] = n ^ (k + 1) + n * x - 2 * x
        // [2] Amid = n / 2; D = (n - 2) ^ k; Am - Am-1 = D;

        BigInteger num = new BigInteger(m + ""), den = new BigInteger(1 + ""), gcd;

        for (int i = 0; i < k; i++) {
            den = den.multiply(new BigInteger(n + ""));
            num = num.multiply(new BigInteger(n - 2 + ""));
            num = num.add(den);
        }
        gcd = den.gcd(num);

        System.out.print(num.divide(gcd));
        System.out.print('/');
        System.out.print(den.divide(gcd));
        System.out.println();
    }
}
