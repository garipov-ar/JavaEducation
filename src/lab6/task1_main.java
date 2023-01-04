package lab6;

public class task1_main {
    public static void main(String[] args) {
        task1 task1 = new task1();

        task1.ch1Ortxt('3');
        task1.ch1Ortxt("Test");

        System.out.println(task1.txt);
        System.out.println(task1.ch1);

        char[] chars1 = new char[5];
        chars1[0] = 'H';
        chars1[1] = 'e';
        chars1[2] = 'l';
        chars1[3] = 'l';
        chars1[4] = 'o';
        task1.ch1Ortxt(chars1);
        System.out.println(task1.txt);

        char[] chars2 = new char[1];
        chars2[0] = 'x';

        task1.ch1Ortxt(chars2);

        System.out.println(task1.ch1);
    }
}
