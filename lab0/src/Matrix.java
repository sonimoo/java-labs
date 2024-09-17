import java.util.Scanner;

public class Matrix {
    public int[][] matrix;

    // Конструктор
    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public static int[][] inputMatrix(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        System.out.println("Введите элементы матрицы " + rows + "x" + cols + ":");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public void printMatrix() {
        System.out.println("Матрица:");
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public int findMin() {
        int min = matrix[0][0];
        for (int[] row : matrix) {
            for (int elem : row) {
                if (elem < min) {
                    min = elem;
                }
            }
        }
        return min;
    }

    public int findMax() {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int elem : row) {
                if (elem > max) {
                    max = elem;
                }
            }
        }
        return max;
    }
}
