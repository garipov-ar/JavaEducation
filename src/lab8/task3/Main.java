package lab8.task3;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Открываем файл для чтения
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\edu\\textin.txt"), "UTF-8"));
        // Открываем файл для записи
        //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\edu\\textout.txt"), "windows-1251"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\edu\\textout.txt"), "UTF-8"));

        String line;
        int lineNumber = 1; // номер текущей строки
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            String[] words = line.split(" "); // разбиваем строку на слова
            int count = 0; // счетчик выбранных слов
            for (String word : words) {
                if (isConsonantWord(word)) { // проверяем, является ли слово начинающимся с согласной буквы
                    writer.write(word + " "); // записываем слово в файл
                    count++;
                }
            }
            // записываем номер строки и количество выбранных слов
            writer.write("(Строка " + lineNumber + ", слово " + count + ")");
            writer.newLine(); // переносим каретку на новую строку
            lineNumber++;
        }

        // закрываем файлы
        reader.close();
        writer.close();
    }

    // метод для проверки, является ли слово начинающимся с согласной буквы

    private static boolean isConsonantWord(String word) {
        char firstLetter = word.charAt(0);
        // согласные буквы
        String consonants = "бвгджзклмнпрстфхцчшщБВГДЖЗКЛМНПРСТФХЦЧШЩ";
        return consonants.indexOf(firstLetter) != -1;
    }
}
