package lab8.task2;
/* Этот код читает данные из файла input.txt, соответствующего условию
(две строки в формате UTF-8 и 5 чисел типа double),
и записывает вторую строку и положительные числа в файл output.txt`*\
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;
import java.io.File;
public class Main {
    public static void main(String[] args) throws Exception {

// Создаем файл
        File file = new File("C:\\edu\\input.txt");
        file.createNewFile();

        try (PrintWriter writer = new PrintWriter(file, StandardCharsets.UTF_8)) {
// Записываем данные в файл
            writer.println("First string");
            writer.println("Second string");
            for (int i = 0; i < 5; i++) {
                double min = -2;
                double max = 10;
                double randomNum = Math.random() * (max - min) + min;
                writer.println(randomNum);
            }
        }
        try (Scanner scanner = new Scanner(new FileInputStream("C:\\edu\\input.txt"), StandardCharsets.UTF_8)
                .useLocale(Locale.ROOT);
             PrintWriter writer = new PrintWriter(new FileOutputStream("C:\\edu\\output.txt"), true)) {

// Читаем первую строку
            String firstLine = scanner.nextLine();

// Читаем вторую строку и записываем ее в результирующий файл
            String secondLine = scanner.nextLine();
            System.out.println("Second line: " + secondLine);
            writer.println(secondLine);

// Читаем пять чисел и записываем положительные значения в результирующий файл
            for (int i = 0; i < 5; i++) {
                if (scanner.hasNextDouble()) {
                    double num = Double.parseDouble(scanner.next());

                    if (num > 0) {
                        System.out.println("Number: " + num);
                        writer.println(num);
                    }
                } else {
                    System.out.println("No more tokens");
                    break;
                }
            }
        }
    }
}
