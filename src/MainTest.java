package src;

/**
 * Тестовий клас для перевірки методу знаходження найбільш повторюваного числа в матриці.
 */
public class MainTest {
    /**
     * Метод main для запуску тесту.
     *
     * @param args аргументи командного рядка (не використовуються)
     */
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {1, 2, 3}
        };

        int mostRepeatedNumber = Main.findMostRepeatedNumber(matrix);
        System.out.println("Найбільш повторюване число: " + mostRepeatedNumber);
    }
}
