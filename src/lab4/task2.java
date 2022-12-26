package lab4;
/*
Напишите программу, которая выводит в консольное окно
прямоугольный треугольник
 */
public class task2 {
    public static void main(String[] args) {
        int s = 15;
        int out = 0;
        for (int i = 1; i <= s; i++) {
            System.out.print("номер строки: " + i + " ");
            for (int j = 0; j <= out; j++) {
                System.out.print("#");
            }
            out = out + 1;
            System.out.println(" Количество символов в строке " + out);
        }
    }
}
