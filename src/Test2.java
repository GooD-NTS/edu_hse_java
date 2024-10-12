import java.util.Scanner;

public class Test2 {
//14. Дано a,b. Найти наибольшее max(a,b) из чисел a и b.
//Найти d:=tg(max(a,b))

    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Введите a: ");
        var a = input.nextDouble();

        System.out.print("Введите b: ");
        var b = input.nextDouble();

        var max = Math.max(a, b);
        System.out.printf("Максимальное число: %.2f\n", max);

        var tgMax = Math.tan(max);
        System.out.printf("Тангенс максимального числа: %.2f\n", tgMax);
    }


}
