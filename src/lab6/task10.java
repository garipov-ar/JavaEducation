package lab6;
/*
Напишите программу со статическим методом, аргументом которому передается произвольное количество целочисленных
аргументов. Результатом метод возвращает массив из двух элементов: это значения наибольшего и наименьшего значений
среди аргументов, переданных методу.
 */
public class task10 {
    static void Metod(int[] nums) {
        int max = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max =  nums [i];
            } if (nums[i] < min) {
                min =  nums [i];
            }
        }
        System.out.println("Максмум = " + max);
        System.out.println("Минимум = " + min);
    }
    //смотри далее task10_main
}