package lab6;

public class task9_main {
    public static void main(String[] args) {
        char[] array = new char[24];
        char alfabet = 'A';
        System.out.print("Исходный массив: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = alfabet;
            alfabet++;
            System.out.print(array[i] + " ");
        }
        task9.Mix(array);
    }
}