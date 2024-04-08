package MatrixMultiplication;

public class MatrixMultiplications {
    public static void main(String[] args) {
        int[][] num1 = { { 1,2,3 }, { 4,5,6 } };
        int[][] num2 = { { 1,2 }, { 3,4 }, { 5,6 } };

        int result[][] = new int[num1.length][num2[0].length];

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2[0].length; j++) {
                for (int k = 0; k < num1[0].length; k++) {
                    result[i][j] += num1[i][k] * num2[k][j];
                }
            }
        }
        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
