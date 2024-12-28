public class Main {
    public static void main(String[] args) {
        double[][] data1 = {{1, 2}, {3, 4}};
        double[][] data2 = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        Matrix sum = matrix1.add(matrix2);
        Matrix difference = matrix1.subtract(matrix2);
        Matrix product = matrix1.multiply(matrix2);
        Matrix transpose = matrix1.transpose();
        double determinant = matrix1.determinant();

        // Print results
        System.out.println("Sum:");
        printMatrix(sum.getData());
        System.out.println("Difference:");
        printMatrix(difference.getData());
        System.out.println("Product:");
        printMatrix(product.getData());
        System.out.println("Transpose:");
        printMatrix(transpose.getData());
        System.out.println("Determinant:");
        System.out.println(determinant);
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

}