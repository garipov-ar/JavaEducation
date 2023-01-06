package Timus.task_1607;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        String line = in.nextLine();
        String[] value = line.split( " " );
        int a = Integer.parseInt( value[0] );
        int b = Integer.parseInt( value[1] );
        int c = Integer.parseInt( value[2] );
        int d = Integer.parseInt( value[3] );

        while ( a <= c ) {
            a = a + b;
            if ( a > c ) {
                a = c;
            }
            c = c - d;
        }
        System.out.println( a );
    }
}
