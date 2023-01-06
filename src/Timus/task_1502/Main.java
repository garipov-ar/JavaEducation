package Timus.task_1502;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        int n = in.nextInt();
        long numOfDiamonds = 0;
        for ( int i = 0; i <= n; i++ ) {
            for ( int i2 = 0; i2 <= n; i2++ ) {
                if ( i2 >= i ) {
                    numOfDiamonds += i + i2;
                }
            }
        }
        System.out.println( numOfDiamonds );
    }
}
