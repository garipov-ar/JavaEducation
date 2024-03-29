package lab11.task7;

import java.util.LinkedList;

public class GameWithLinkedList {
    public static void main(String[] args) {
        int n = 10; // количество человек
        LinkedList<Integer> people = new LinkedList<>();

        // заполнение списка людьми
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int i = 0; // индекс текущего человека
        while (people.size() > 1) {
            i = (i + 1) % people.size(); // переход к следующему человеку
            people.remove(i); // удаление каждого второго человека
            i--; // корректировка индекса после удаления элемента
        }

        System.out.println("Остался человек под номером " + people.get(0));
    }
}
// В данном случае, скорее всего, программа с ArrayList будет работать быстрее, потому что он имеет простой внутренний механизм и быстрый доступ к элементам по индексу. LinkedList, напротив, имеет более сложную структуру и работает медленнее при доступе к элементам по индексу, однако при удалении элементов из середины списка работает быстрее.
