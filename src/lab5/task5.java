package lab5;
/*
Напишите программу с классом, у которого есть закрытое целочисленное
поле. Значение полю присваивается с помощью открытого метода. Методу
аргументом может передаваться целое число, а также метод может вызываться
без аргументов. Если методы вызывается без аргументов, то поле получает
нулевое значение. Если метод вызывается с целочисленным аргументом, то
это значение присваивается полю. Однако если переданное аргументом
методу значение превышает 100, то значением полю присваивается число 100.
Предусмотрите в классе конструктор, который работает по тому же принципу
что и метод для присваивания значения полю. Также в классе должен быть
метод, позволяющий проверить значение поля
 */
public class task5 {
    public static void main(String[] args) {
        Example test = new Example(21);
        System.out.println("Число = " + test.PrintInt());

        test.Set(15);
        System.out.println("Число = " + test.PrintInt());

        test.Set(125);
        System.out.println("Число = " + test.PrintInt());

        test.Set(-15);
        System.out.println("Число = " + test.PrintInt());

        test.Set();
        System.out.println("Число = " + test.PrintInt());
    }

    static class Example {
        private int int1;

        public void Set(int n) {
            System.out.println("Метод Set() c аргументом");
            int1 = n;
            if (n >= 100) {
                int1 = 100;
            }
            if (n <= 0) {
                int1 = 0;
            }
        }

        public void Set() {
            System.out.println("Метод Set() без аргумента");
            int1 = 0;
        }

        public int PrintInt() {
            return int1;
        }

        Example(int int1) {
            System.out.println("Example() конструктор");
            this.Set(int1);
        }
    }
}
