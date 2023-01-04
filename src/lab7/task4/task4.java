package lab7.task4;
/*
Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии
 */
public class task4 {
    public static void main(String[] args) {
        superClass superClass = new superClass('X');
        System.out.println(superClass.toString());
        subClass1 subClass1 = new subClass1('о',"строчка");
        System.out.println(subClass1 .toString());
        subClass2 subClass2 = new subClass2('ч',"строчка2",4);
        System.out.println(subClass2 .toString());
    }
}
