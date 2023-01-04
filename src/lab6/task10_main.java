package lab6;

import java.util.Random;
import java.util.Scanner;

public class task10_main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int numbers = in.nextInt();
        if (numbers <= 0) {
            System.out.print("It's Zero ");
        } else {
            System.out.print("Рандомные числа: ");
            int[] nums = new int[numbers];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(100);
                System.out.print(nums[i] + " ");
            }
            task10.Metod(nums);
        }
    }
}
