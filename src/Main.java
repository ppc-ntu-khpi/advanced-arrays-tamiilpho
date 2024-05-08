package src;

import java.util.Arrays;

public class Main {
    /**
     * Знаходить найбільш повторюване число в матриці.
     *
     * @param matrix матриця, в якій шукаємо найбільш повторюване число
     * @return найбільш повторюване число в матриці
     */
    public static int findMostRepeatedNumber(int[][] matrix) {
        // Отримуємо розміри матриці
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Перетворюємо матрицю у одномірний масив
        int[] flatMatrix = new int[rows * cols];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flatMatrix[index++] = matrix[i][j];
            }
        }

        // Сортуємо одномірний масив
        Arrays.sort(flatMatrix);

        // Знаходимо найчастіше повторюване число
        int mostRepeatedNumber = flatMatrix[0];
        int maxCount = 1;
        int currentCount = 1;
        for (int i = 1; i < flatMatrix.length; i++) {
            if (flatMatrix[i] == flatMatrix[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostRepeatedNumber = flatMatrix[i - 1];
                }
                currentCount = 1;
            }
        }

        // Повертаємо найчастіше повторюване число
        return mostRepeatedNumber;
    }
}
