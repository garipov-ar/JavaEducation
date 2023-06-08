package Timus.task_1206;

import java.math.*;
import java.util.*;

public class Main {
    private static final BigInteger _36 = BigInteger.valueOf(36L);
    private static final BigInteger _55 = BigInteger.valueOf(55L);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(_55.pow(n - 1).multiply(_36));
    }
}