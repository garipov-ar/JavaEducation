package lab5;
/*
Напишите программу с классом, в котором есть закрытое символьное поле
и три открытых метода.
Один из методов позволяет присвоить значение полю.
Еще один метод при вызове возвращает результатом код символа.
Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
 */
public class task1 {

    private char ch1;
    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    public int getCodeSymbol(){
        return ch1;
    }

    public void showCodeAndValue() {
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int) ch1);
    }
}
