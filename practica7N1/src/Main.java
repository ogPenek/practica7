public class Main {
    public static void main(String[] args) {
        int rows = 5; // кількість рядків
        int[][] pyramid = new int[rows][];

        // Створення зубкової піраміди
        for (int i = 0; i < rows; i++) {
            pyramid[i] = new int[i + 1]; // кожен рядок має на 1 елемент більше
            for (int j = 0; j <= i; j++) {
                pyramid[i][j] = i + 1; // заповнюємо піраміду значеннями
            }
        }

        // Виведення піраміди в звичайному порядку
        System.out.println("Піраміда в звичайному порядку:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }

        // Виведення піраміди в зворотному порядку
        System.out.println("Піраміда в зворотному порядку:");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pyramid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
