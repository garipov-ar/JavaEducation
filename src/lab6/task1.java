package lab6;
/* Напишите программу с классом, в котором есть два поля: символьное и текстовое.
В классе должен быть перегруженный метод для присваивания значений полям. Если метод
вызывается с символьным аргументом, то соответствующее значение присваивается
символьному полю. Если метод вызывается с текстовым аргументом, то он определяет
значение текстового ноля. Методу аргументом также может передаваться символьный
массив. Если массив состоит из одного элемента, то он определяет значение символьного
поля. В противном случае (если в массиве больше одного элемента) из символов массива
формируется текстовая строка и присваивается значением текстовому полю. */
public class task1 {

    char ch1; // символьное поле
    String txt; // текстовое поле

    public void ch1Ortxt(String txt) {
        this.txt = txt;
    }
    public void ch1Ortxt(char ch1) {
        this.ch1 = ch1;
    }
    public void ch1Ortxt(char[] chars){
        if(chars.length == 1) {
            this.ch1 = chars[0];
        } else if (chars.length > 1) {
            this.txt = String.valueOf(chars);
        }
    }
//смотри далее task1_main
}