package lab4;
/*
Напишите программу, которая выводить в консольное окно
прямоугольник, размеры сторон которого, ширина: 23 колонки, высота: 11
строк
 */
public class task1 {
    public static void main(String[] args) {
        int rows = 11; // число строк которое необходимо вывести
        int columns = 23; // переменная задает число, необходимое для расчета количества колонок (символов в строке)
        int out; // переменная необходима для вывода служебного сообщения о количестве символов в строке;
        for (int i = 1 ; i <= rows; i++){
            System.out.print("номер строки: " + i + " ");
            out = 0;
            for (int j = 1; j <=columns; j++){
                System.out.print("+");
                out = out + 1;
            }
            System.out.println(" Количество символов в строке " + out);
        }
    }
}
