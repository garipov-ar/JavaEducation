package Timus.task_1243;

import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(in.readLine());

        System.out.println(n.mod(BigInteger.valueOf(7)));
    }
}