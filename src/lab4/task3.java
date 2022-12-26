package lab4;

import java.util.Scanner;

/*
Напишите программу, в которой создается двумерный массив, который
выводит прямоугольник из цифр 2
 */
public class task3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int width = id.nextInt(); // число строк которое необходимо вывести
        System.out.print("Введите высоту прямоугольника: ");
        int height = id.nextInt(); // число строк которое необходимо вывести
        int [][] graph = new int [height][width]; //создание элемента массива необходимого размера
        int out = 0; //переменная для вывода количества строк
        for (int i =0; i < height; i++){//заполнение массива
            for (int j = 0; j <width; j++){
                graph[i][j] = 2;
            }
        }
        for (int i =0; i < height; i++){//печать массива
            int count = i + 1;//переменная для повышения номера индекса для вывода на консоль
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j <width; j++){
                System.out.print(graph[i][j]+" ");
                out++;
            }
            System.out.println(" Количество символов в строке " + out);
            out = 0; //обнуление счетчика
        }
    }
}
