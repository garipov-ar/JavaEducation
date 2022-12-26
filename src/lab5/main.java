package lab5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("task1 work here:"); //1
        task1 task1 = new task1();
        task1.setCh1('K');
        System.out.println("getCodeSymbol " + task1.getCodeSymbol());
        task1.showCodeAndValue();

        System.out.println("task2 work here:"); //2
        task2 task2 = new task2();
        task2.setCh('A', 'D');
        task2.showCharArray();

        System.out.println("task3 work here:"); //3
        Scanner id = new Scanner(System.in);
        System.out.println("Введите num1");
        int int1 = id.nextInt();
        System.out.println("Введите num2");
        int int2 = id.nextInt();
        task3 myexample1 = new task3();
        task3 myexample2 = new task3(int1);
        task3 myexample3 = new task3(int1,int2);

        System.out.println("task4 work here:"); //4
        task4 task4a = new task4(12, 'A');
        task4 task4b = new task4(65.1267);


    }
}
