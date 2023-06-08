package Timus.task_1402;

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger a = BigInteger.valueOf(n), s = BigInteger.ZERO;

        for (int i = n - 1; i >= 1; i--) {
            a = a.multiply(BigInteger.valueOf(i));
            s = s.add(a);
        }
        System.out.println(s);
    }
}
