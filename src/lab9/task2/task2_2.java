package lab9.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Чтение размеров матрицы
            System.out.print("Введите количество строк матрицы: ");
            int rows = scanner.nextInt();
            System.out.print("Введите количество столбцов матрицы: ");
            int cols = scanner.nextInt();

            // Создание матрицы
            int[][] matrix = new int[rows][cols];

            // Чтение элементов матрицы
            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Чтение номера столбца для вывода
            System.out.print("Введите номер столбца для вывода: ");
            int column = scanner.nextInt();

            // Проверка наличия столбца с заданным номером
            if (column < 0 || column >= cols) {
                throw new IllegalArgumentException("Столбца с номером " + column + " не существует");
            }

            // Вывод столбца
            System.out.println("Столбец " + column + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][column]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введенные данные не являются числом");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введенные данные не являются числом");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
