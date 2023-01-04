package lab6;
/*
Напишите программу, в которой описан статический метод для вычисления двойного факториала числа, переданного аргументом
методу. По определению, двойной факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для нечетного п и равен 2 для
четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
 */
public class task4 {
    static int score = 1;

    static void factWithoutRecursion(int factorial) {
        score = 1;
        while (factorial > 0) {
            score *= factorial;
            factorial -= 2;
        }
        System.out.println("Двойной факториал равен = " + score);
    }
    static void factWithRecursion(int factor) {
        if (factor != 1 & factor > 0) {
            score *= factor;
            factor -= 2;
            factWithRecursion(factor);
        } else {
            System.out.println("Двойной факториал равен = " + score);
        }
    }
    //смотри далее task4_main
}