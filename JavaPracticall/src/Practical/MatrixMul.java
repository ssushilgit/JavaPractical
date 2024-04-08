package Practical;
import java.util.Scanner;
public class MatrixMul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get matrix dimensions from user
        System.out.print("Enter the number of rows in first matrix: ");
        int rowsInFirstMatrix = scanner.nextInt();
        System.out.print("Enter the number of columns in first matrix: ");
        int columnsInFirstMatrix = scanner.nextInt();

        System.out.print("Enter the number of rows in second matrix: ");
        int rowsInSecondMatrix = scanner.nextInt();
        System.out.print("Enter the number of columns in second matrix: ");
        int columnsInSecondMatrix = scanner.nextInt();

        // Check if matrices are compatible for multiplication
        if (columnsInFirstMatrix != rowsInSecondMatrix) {
            System.out.println("Matrices cannot be multiplied. Incompatible dimensions.");
            return;
        }

        // Initialize matrices with zeros
        int[][] firstMatrix = new int[rowsInFirstMatrix][columnsInFirstMatrix];
        int[][] secondMatrix = new int[rowsInSecondMatrix][columnsInSecondMatrix];
        int[][] resultMatrix = new int[rowsInFirstMatrix][columnsInSecondMatrix];

        // Get elements for first matrix
        System.out.println("Enter elements for first matrix:");
        for (int i = 0; i < rowsInFirstMatrix; i++) {
            for (int j = 0; j < columnsInFirstMatrix; j++) {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        // Get elements for second matrix
        System.out.println("Enter elements for second matrix:");
        for (int i = 0; i < rowsInSecondMatrix; i++) {
            for (int j = 0; j < columnsInSecondMatrix; j++) {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rowsInFirstMatrix; i++) {
            for (int j = 0; j < columnsInSecondMatrix; j++) {
                for (int k = 0; k < columnsInFirstMatrix; k++) {
                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsInFirstMatrix; i++) {
            for (int j = 0; j < columnsInSecondMatrix; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}


