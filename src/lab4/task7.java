package lab4;

import java.util.Scanner;

/*
Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее
 */
public class task7 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a =id.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = id.nextInt();
        int[][] newArray = new int[a][b];
        int hvost = 0;
        int telo = 0;
        int h = 0;
        for (int i = 0; h < newArray.length ; h++) {
            for (int j = 0; j <(newArray[i].length - hvost); j++) {
                newArray[i][j] = telo;
                telo++;
            }
            if(i< newArray.length-1) {
                i++;}
            for (int o=a-1; o > hvost; o--) {
                newArray[o][newArray[i].length-1-hvost] = telo;
                telo++;
            }
            hvost++;
        }
        int out = 0;
        for (int i = 0; i < newArray.length; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < newArray[i].length; j++){
                System.out.print(newArray[i][j]+" ");
                out++;
            }
            System.out.println(" Количество символов в строке " + out);
            out = 0;
        }
    }
}
