import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розміру матриці
        System.out.print("Введіть розмір матриці: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        Random rand = new Random();

        // Заповнення матриці випадковими цілими числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(10); // Випадкове число від 0 до 9
            }
        }

        // Виведення матриці
        System.out.println("Матриця:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Введення індексів для мінору
        System.out.print("Введіть рядок для мінору: ");
        int row = scanner.nextInt();
        System.out.print("Введіть стовпець для мінору: ");
        int col = scanner.nextInt();

        // Обчислення мінору
        int[][] minor = getMinor(matrix, row, col, n);

        // Виведення мінору
        System.out.println("Мінор матриці:");
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(minor[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод для обчислення мінору
    public static int[][] getMinor(int[][] matrix, int row, int col, int n) {
        int[][] minor = new int[n - 1][n - 1];
        int r = 0, c;
        for (int i = 0; i < n; i++) {
            if (i == row) continue;
            c = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                minor[r][c++] = matrix[i][j];
            }
            r++;
        }
        return minor;
    }
}