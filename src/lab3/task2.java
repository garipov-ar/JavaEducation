package lab3;

import java.util.Scanner;

//Напишите программу, в которой пользователю предлагается
//ввести название дня недели. По введенному названию программа определяет
//порядковый номер дня в неделе. Если пользователь вводит неправильное
//название дня, программа выводит сообщение о том, что такого дня нет.
//Предложите версию программы на основе вложенных условных операторов и
//на основе оператора выбора switch.
public class task2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите название дня недели");
        String day = id.nextLine();

        dayOfWeek.firstM(day);
        dayOfWeek.secondM(day);
    }

    static class dayOfWeek {
        static void firstM(String d) {
            String day = d;
            System.out.println("1. Версия на основе вложенных условных операторов if, else if");

            int nDay = 0;
            if (day.equals("понедельник")){
                nDay = 1;
            } else if (day.equals("вторник")) {
                nDay = 2;
            } else if (day.equals("среда")) {
                nDay = 3;
            } else if (day.equals("четверг")) {
                nDay = 4;
            } else if (day.equals("пятница")) {
                nDay = 5;
            } else if (day.equals("суббота")) {
                nDay = 6;
            } else if (day.equals("воскресенье")) {
                nDay = 7;
            } else {
                System.out.println(day + " - некорректно введен день");
            }
            if (nDay != 0) {
                System.out.printf("%s это %s-й день недели\n", day, nDay);
            }
            return;
        }

        static void secondM(String d) {
            System.out.println("2. Версия на основе оператора выбора switch");

            String day = d;

            switch (day) {
                case "понедельник":
                    System.out.println(day + " это первый день недели");
                    break;
                case "вторник":
                    System.out.println(day + " это второй день недели");
                    break;
                case "среда":
                    System.out.println(day + " это третий день недели");
                    break;
                case "четверг":
                    System.out.println(day + " это четвертый день недели");
                    break;
                case "пятница":
                    System.out.println(day + " это пятый день недели");
                    break;
                case "суббота":
                    System.out.println(day + " это шестой день недели");
                    break;
                case "воскресенье":
                    System.out.println(day + " это седьмой день недели");
                    break;
                default:
                    System.out.println(day + " - некорректно введено значение");
                    break;
            }
        }
    }

}
