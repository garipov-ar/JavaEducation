package lab3;
//Напишите программу, в которой создается массив и заполняется
//случайными числами. Массив отображается в консольном окне. В этом
//массиве необходимо определить элемент с минимальным значением. В
//частности, программа должна вывести значение элемента с минимальным
//значением и индекс этого элемента. Если элементов с минимальным
//значением несколько, должны быть выведены индексы всех этих элементов

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int p = Integer.parseInt(sc.nextLine());

        int k = 10;
        int minimal = k;

        int[] arr = new int[p];

        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(k) + 1;
            if(arr[i] < minimal){
                minimal = arr[i];
            }
            System.out.print(arr[i] + "\t");
        }

        for (int j = 0; j < arr.length; j++){
            if(arr[j] < minimal){
                minimal = arr[j];
            }
        }
        System.out.println();

        System.out.println("Минимальный элемет массива: " + minimal);

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++){
            if(arr[i] == minimal){
                list.add(i);
            }
        }

        if(list.size() == 1){
            for (int kl = 0; kl < list.size(); kl++){
                System.out.print("Его индекс: " + list.get(kl));
            }
        } else {
            System.out.print("Элемент находится на следующих индексах: ");
            for (int kl = 0; kl < list.size(); kl++) {
                System.out.print(list.get(kl) + ", ");
            }
        }
    }

}
