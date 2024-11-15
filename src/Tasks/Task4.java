//Задание 4
//Определить матрицу (двумерный массив) и ее заполнить случайными значениями.

//14) среднее арифметическое положительных элементов в каждом столбце матрицы

package Tasks;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public void DoTask(String[] args) {
        var rows = 40;
        var cols = 40;

        var matrix = createMatrix(rows, cols);
        System.out.println("---");

        var means = new double[cols];
        for (int j = 0; j < cols; j++) {
            var col = getMatrixCol(matrix, rows, j);
            means[j] = getColumnMean(col);
        }

        System.out.println("Среднее арифметическое положительных элементов в столбцах:");
        System.out.println(Arrays.toString(means));
    }

    private int[][] createMatrix(int rows, int cols)
    {
        System.out.println("Матрица: ");
        var random = new Random();
        var minValue = -5;
        var maxValue = 50;
        var matrix = new int[rows][cols];
        for (var i = 0; i < rows; i++) {
            for (var j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(maxValue - minValue + 1) + minValue;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        return matrix;
    }

    private int[] getMatrixCol(int[][] matrix, int rows, int col) {
        var result = new int[rows];

        var current = 0;
        for (var i = 0; i < rows; i++) {
            result[current] = matrix[i][col];
            current++;
        }

        return result;
    }

    private double getColumnMean(int[] col) {
        double total = 0;
        var count = 0;
        for (var element : col) {
            if (element > 0) {
                total += element;
                count++;
            }
        }
        return total / count;
    }
}
