import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розміру квадратної матриці
        System.out.print("Введіть розмір квадратної матриці: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Введення елементів матриці
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Транспонування матриці
        int[][] transposedMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
    }
}