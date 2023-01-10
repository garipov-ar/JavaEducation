package lab8.task1.sample3FileByteRead;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    //Считывание по 5 символов (буфер)
    public static void readAllByArray(InputStream in) throws IOException {
        byte [] buff = new byte[5];
        while (true) {
            int count = in.read(buff);
            if (count !=-1) {   //если не конец файла
                System.out.println("Количество = " + count + ", buff = "
                + Arrays.toString(buff) + ", str = "
                + new String(buff, 0, count, "cp1251"));//"UTF8"
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "C://edu/text1.txt";
        InputStream inFile = null; //переменная объявляется до секции try, чтобы не ограничивать область видимости

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла " + fileName + e);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /*NOP*/
                }
            }
        }

    }
}
