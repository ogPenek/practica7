public class Main {
    public static void main(String[] args) {
        int rows = 4, cols = 4;
        double[][] array = new double[rows][cols];
        Random rand = new Random();

        // Заповнення масиву випадковими значеннями
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = rand.nextDouble() * 100; // Випадкове число від 0 до 100
            }
        }

        // Заміна елементів на квадратний корінь для непарних індексів
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i % 2 != 0) || (j % 2 != 0)) {
                    array[i][j] = Math.sqrt(array[i][j]);
                }
            }
        }

        // Виведення оновленого масиву
        System.out.println("Оновлений масив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%.2f ", array[i][j]);
            }
            System.out.println();
        }
    }
}