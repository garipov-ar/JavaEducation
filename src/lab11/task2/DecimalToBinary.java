package lab11.task2;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int decimal = scanner.nextInt();
        scanner.close();
        String binary = convertDecimalToBinary(decimal);
        System.out.printf("Число %d в двоичной системе счисления: %s", decimal, binary);
    }

    private static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            int remainder = decimal % 2;
            int quotient = decimal / 2;
            return convertDecimalToBinary(quotient) + remainder;
        }
    }
}


