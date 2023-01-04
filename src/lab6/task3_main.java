package lab6;
import java.util.Random;
import java.util.Scanner;

public class task3_main {

        public static void main(String[] args) {
            Random random = new Random();
            Scanner id = new Scanner(System.in);
            System.out.print("input array's number: ");
            int number = id.nextInt();
            if (number <= 0) {
                System.out.print("it's zero ");
            } else {
                System.out.print("random: ");
                int[] nums = new int[number];
                for (int i = 0; i < nums.length; i++) {
                    nums[i] = random.nextInt(100);
                    System.out.print(nums[i] + " ");
                }
                task3.Metod(nums);
            }
        }
}