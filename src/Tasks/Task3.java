//Задание 3
//Определить одномерный массив и заполнить его случайными значениями

//14) Дан одномерный массив а(n), в котором находится единственный нулевой элемент.
//Найти где он находится и вычислить сумму последующих за ним элементов.
//Выдать на экран номер элемента и сумму.

package Tasks;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public void DoTask(String[] args) {
        var n = 50;

        var random = new Random();
        var a = new int[n];
        for (var i = 0; i < n; i++) {
            a[i] = random.nextInt(50);
        }
        System.out.println("Массив: " + Arrays.toString(a));

        var zeroIndex = -1;
        for (var i = 0; i < n; i++) {
            if (a[i] == 0) {
                zeroIndex = i;
                break;
            }
        }

        if (zeroIndex != -1) {
            var sum = 0;
            for (var i = zeroIndex + 1; i < n; i++) {
                sum += a[i];
            }

            System.out.println("Номер нулевого элемента: " + zeroIndex);
            System.out.println("Сумма последующих элементов: " + sum);
        } else {
            System.out.println("Нулевой элемент не найден");
        }
    }
}
