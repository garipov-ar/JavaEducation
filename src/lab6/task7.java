package lab6;
/*
Напишите программу со статическим методом, аргументом которому передастся символьный массив, а результатом возвращается
ссылка на целочисленным массив, состоящий из кодов символов из массива- аргумента.
 */
public class task7 {
    static void Metod(char[] array) {
        int [] array2 = new int[array.length];
        System.out.print("Новый массив ");
        for (int i = 0; i < array.length; i++){
            array2[i] = array[i];
            System.out.print(array2[i] + " ");
        }
    }
    //смотри далее task7_main
}