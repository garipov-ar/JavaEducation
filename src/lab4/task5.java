package lab4;

import java.util.Random;
import java.util.Scanner;

/*
Напишите программу, в которой создается двумерный целочисленный
массив. Он заполняется случайными числами. Затем в этом массиве строки и
столбцы меняются местами: первая строка становится первым столбцом,
вторая строка становиться вторым столбцом и так далее. Например, если
исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
из 5 строк и 3 столбцов
 */
public class task5 {
    public static void main(String[] args) {
        Random random = new Random(100);
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество столбцов массива: ");
        int a = id.nextInt(); // столбцы
        System.out.println("Введите количество строк массива: ");
        int b = id.nextInt(); // строки
        int[][] firstArray = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0; j < b; j++) {
                firstArray[i][j] = random.nextInt(100);
                System.out.println("i = " + i + "; j= " + j + "; value= " +firstArray[i][j]);
            }
        }
        System.out.println("Транспонируем массив...");

        int[][] secondArray = new int[b][a];
        for (int i = 0 ; i <b; i++) {
            for (int j = 0 ; j <a; j++) {
                secondArray[i][j] = firstArray[j][i];
                System.out.println("i = "+i+";j= "+j+";value= "+secondArray[i][j]);
            }
        }
    }
}
