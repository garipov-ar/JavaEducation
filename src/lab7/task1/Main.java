package lab7.task1;

public class Main {

    public static void main(String[] args) {

        task1 superClassObject = new task1("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        task1 subClassObject1 = new task1Sub("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        task1 subClassObject2 = new task1Sub("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
