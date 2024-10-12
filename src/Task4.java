import java.util.Arrays;
import java.util.Random;

public class Task4 {
    //Задание 4
    //Определить матрицу (двумерный массив) и ее заполнить случайными значениями.

    //14) среднее арифметическое положительных элементов в каждом столбце матрицы

    public static void main(String[] args) {
        var rows = 4;
        var cols = 4;

        var matrix = createMatrix(rows, cols);
        System.out.println("");

        for (int j = 0; j < cols; j++) {
            var col = getMatrixCol(matrix, rows, cols, j);
            var columnMean = getColumnMean(col);
            System.out.printf("Среднее арифметическое положительных элементов в столбце %d: %.2f%n", j, columnMean);
        }
    }

    static int[][] createMatrix(int rows, int cols)
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

    static int[] getMatrixCol(int[][] matrix, int rows, int cols, int col) {
        var result = new int[rows];

        var current = 0;
        for (var i = 0; i < rows; i++) {
            result[current] = matrix[i][col];
            current++;
        }

        return result;
    }

    static double getColumnMean(int[] col) {
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
