package lab4;

import java.util.Scanner;

/*
Напишите программу, в которой создается двумерный массив, который
выводит прямоугольный треугольник
 */
public class task4 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int height = id.nextInt();
        int [][] graph = new int [height][];
        for (int i=0;i<graph.length;i++){
            int j = i+1;
            graph[i]=new int[j];
        }
        int out = 0;
        for (int i =0; i < height; i++){
            for (int j = 0; j <i+1; j++){
                graph[i][j] = 2;
            }
        }
        for (int i =0; i < height; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < graph[i].length; j++){
                System.out.print(graph[i][j]+" ");
                out++;
            }
            System.out.println(" Количество символов в строке " + out);
            out = 0;
        }
    }

}
