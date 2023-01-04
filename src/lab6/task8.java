package lab6;
/*
Напишите программу со статическим методом, аргументом которому передается целочисленный массив, а результатом
возвращается среднее значение для элементов массива
(сумма значений элементов, деленная на количество элементов в массиве).
 */
public class task8 {
    static void Metod(int[] nums) {
        int score = 0;
        float mid;
        for (int i = 0; i < nums.length; i++) {
            score += nums[i];
        }
        mid = (float) score/ nums.length;
        System.out.println("Среднее из всех чисел масива = " + mid);
    }
    //смотри далее task8_main
}