package lab8.task1.sample10bufRW2;

import java.io.*;

public class Buf_RW_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            // Создание потоков
            br = new BufferedReader(new InputStreamReader(
                            new FileInputStream("C:\\edu\\MyFile1.txt"),"cp1251"));
            out = new PrintWriter("C:\\edu\\MyFile2.txt","cp1251"); // Переписывание информации из одного файла в другой
            int lineCount = 0; String s;
            while ((s = br.readLine()) != null) { lineCount++; out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!"); }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
