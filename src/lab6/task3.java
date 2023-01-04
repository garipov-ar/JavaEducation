package lab6;
/*
Напишите программу с классом, в котором есть статические методы, которым можно передавать произвольное количество
целочисленных аргументов (или целочисленный массив). Методы, на основании переданных аргументов или массива,
позволяют вычислить: наибольшее значение, наименьшее значение, а также среднее значение из набора чисел.
 */
public class task3 {
    static void Metod(int[] nums) {
        int max = nums[0], min = nums[0], score = nums[0];
        float mid;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max =  nums [i];
            } if (nums[i] < min) {
                min =  nums [i];
            }
            score += nums[i];
        }
        mid = (float) score/ nums.length;
        System.out.println("maximum = " + max);
        System.out.println("minimum = " + min);
        System.out.println("average = " + mid);
    }
    //смотри далее task3_main
}