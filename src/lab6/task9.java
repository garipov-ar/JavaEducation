package lab6;
/*
Напишите программу со статическим методом, аргументом которому передается одномерный символьный массив.
В результате вызова метода элементы массива попарно меняются местами: первый — с последним, второй — с предпоследним
и так далее.
 */
public class task9 {
    static void Mix(char[] array) {
        int end = array.length - 1;
        char tmp;
        System.out.print("Изменённый массив: ");
        for(int i = 0; i < (array.length); i++) {
            if (i < end) {
                tmp = array[i];
                array[i] = array[end];
                array[end] = tmp;
            } else if (end >= i) {
                break;
            }
            end--;
        }
        for(int i = 0; i < (array.length); i++) {
            System.out.print(array[i] + " ");
        }
    }
    //смотри далее task9_main
}