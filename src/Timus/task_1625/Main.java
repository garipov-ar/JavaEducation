package Timus.task_1625;

import java.math.*;
import java.util.*;

public class Main {
    private static BigInteger Catalan(int n) {
        BigInteger ret = BigInteger.valueOf(1);

        for (int i = 1; i <= n; i++) {
            ret = ret.multiply(BigInteger.valueOf(n + i));
            ret = ret.divide(BigInteger.valueOf(i));
        }

        return ret.divide(BigInteger.valueOf(n + 1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.println(BigInteger.ZERO);
            }
            System.out.println(Catalan(i));
        }
    }
}
