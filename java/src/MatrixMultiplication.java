public class MatrixMultiplication {
    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        int arr2[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

        int arr3[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    arr3[i][j] = arr3[i][j] + arr[i][k] * arr2[k][j];
                }
                System.out.print(arr3[i][j] + " ");

            }
            System.out.println();

        }
    }

}
