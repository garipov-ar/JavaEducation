package lab6;
import java.util.Random;
import java.util.Scanner;

public class task6_main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int numbers = id.nextInt();
        System.out.print("Введите число: ");
        int a = id.nextInt();
        if (numbers <= 0) {
            System.out.print("Нет аргументов ");
        } else {
            System.out.print("Исходный массив ");
            int[] nums = new int[numbers];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(100);
                System.out.print(nums[i] + " ");
            }
            task6.Metod(nums, a);
        }
    }
}