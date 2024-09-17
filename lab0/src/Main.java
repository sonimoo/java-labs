import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int rows = scanner.nextInt();

        System.out.println("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        // Ввод
        int[][] matrixData = Matrix.inputMatrix(rows, cols);

        Matrix matrix = new Matrix(matrixData);

        // Вывод матрицы
        matrix.printMatrix();

        int min = matrix.findMin();
        int max = matrix.findMax();

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}
