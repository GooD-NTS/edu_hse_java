package Tasks;

public class Task1 {
    //Задание 1

    // 14) Написать программу, получающую на вход в качестве аргумента два параметра–числа x и y.
    // Если произведение этих чисел больше 100, то вычислить удвоенный куб первого числа
    // и второе число разделить на 2. Вывести результат на экран.

    public void DoTask(String[] args) {
        if (args.length == 2) {
            var x = Integer.parseInt(args[0]);
            var y = Integer.parseInt(args[1]);
            System.out.println("x = " + x);
            System.out.println("y = " + y);

            if (x + y > 100) {
                int xDC = x * x * x * x;
                System.out.println("Удвоенный куб числа " + x + " = " + xDC);

                var yDiv = (float)y / 2;
                System.out.println("Число " + y + " разделенное на 2 = " + yDiv);
            } else {
                System.out.println("Sum is less 100");
            }
        } else {
            System.out.println("Bad args");
        }
    }
}
