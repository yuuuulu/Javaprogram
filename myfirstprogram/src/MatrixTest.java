public class MatrixTest {
    public static void test(){
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

    public static void testValidOperations() {
        double[][] data1 = {{1, 2}, {3, 4}};
        double[][] data2 = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        // Test Addition
        Matrix sum = matrix1.add(matrix2);
        double[][] expectedSum = {{6, 8}, {10, 12}};
        if (areMatricesEqual(sum.getData(), expectedSum)) {
            System.out.println("Test Valid Addition: Passed");
        } else {
            System.out.println("Test Valid Addition: Failed");
        }

        // Test Subtraction
        Matrix difference = matrix1.subtract(matrix2);
        double[][] expectedDifference = {{-4, -4}, {-4, -4}};
        if (areMatricesEqual(difference.getData(), expectedDifference)) {
            System.out.println("Test Valid Subtraction: Passed");
        } else {
            System.out.println("Test Valid Subtraction: Failed");
        }

        // Test Multiplication
        Matrix product = matrix1.multiply(matrix2);
        double[][] expectedProduct = {{19, 22}, {43, 50}};
        if (areMatricesEqual(product.getData(), expectedProduct)) {
            System.out.println("Test Valid Multiplication: Passed");
        } else {
            System.out.println("Test Valid Multiplication: Failed");
        }

        // Test Transposition
        Matrix transpose = matrix1.transpose();
        double[][] expectedTranspose = {{1, 3}, {2, 4}};
        if (areMatricesEqual(transpose.getData(), expectedTranspose)) {
            System.out.println("Test Valid Transposition: Passed");
        } else {
            System.out.println("Test Valid Transposition: Failed");
        }

        // Test Determinant
        double determinant = matrix1.determinant();
        double expectedDeterminant = -2.0;
        if (determinant == expectedDeterminant) {
            System.out.println("Test Valid Determinant: Passed");
        } else {
            System.out.println("Test Valid Determinant: Failed");
        }
    }

    public static boolean areMatricesEqual(double[][] matrix1, double[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void testInvalidConstructor() {
        try {
            double[][] invalidData = null;
            Matrix invalidMatrix = new Matrix(invalidData);
            System.out.println("Test Invalid Constructor (null data): Failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Invalid Constructor (null data): Passed");
        }

        try {
            double[][] invalidData = {{1, 2}, {3}};
            Matrix invalidMatrix = new Matrix(invalidData);
            System.out.println("Test Invalid Constructor (jagged array): Failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Invalid Constructor (jagged array): Passed");
        }
    }

    public static void testInvalidAddition() {
        double[][] data1 = {{1, 2}, {3, 4}};
        double[][] data2 = {{5, 6, 7}, {8, 9, 10}};
        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        try {
            matrix1.add(matrix2);
            System.out.println("Test Invalid Addition (different sizes): Failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Invalid Addition (different sizes): Passed");
        }
    }

    public static void testInvalidSubtraction() {
        double[][] data1 = {{1, 2}, {3, 4}};
        double[][] data2 = {{5, 6, 7}, {8, 9, 10}};
        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        try {
            matrix1.subtract(matrix2);
            System.out.println("Test Invalid Subtraction (different sizes): Failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Invalid Subtraction (different sizes): Passed");
        }
    }

    public static void testInvalidMultiplication() {
        double[][] data1 = {{1, 2}, {3, 4}};
        double[][] data2 = {{5, 6}};
        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        try {
            matrix1.multiply(matrix2);
            System.out.println("Test Invalid Multiplication (incompatible sizes): Failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Invalid Multiplication (incompatible sizes): Passed");
        }
    }

    public static void testInvalidDeterminant() {
        double[][] data = {{1, 2, 3}, {4, 5, 6}};
        Matrix matrix = new Matrix(data);

        try {
            matrix.determinant();
            System.out.println("Test Invalid Determinant (non-square matrix): Failed");
        } catch (IllegalArgumentException e) {
            System.out.println("Test Invalid Determinant (non-square matrix): Passed");
        }
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        testValidOperations();
        testInvalidConstructor();
        testInvalidAddition();
        testInvalidSubtraction();
        testInvalidMultiplication();
        testInvalidDeterminant();
    }
}


//import java.util.Scanner;
//import javax.swing.JOptionPane;
//
//public class First {
//
//    public static void main(String[] args) {
//
//
//
//
//       // package of jumping "chat frame"
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, "Hello "+name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null,"You are "+age+"years old");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane.showMessageDialog(null,"You are "+height+"cm tall");
//
//
//
//
//
//
//
//
//
//
//
//        //expression = operands & operators
//        // operands= values, variables, numbers,quantity
//        //operators = +_*/%
//
//        //int friends = 10;
//
//        //friends = friends % 3; //reminder
//
//        //System.out.println(friends);
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What is your name?");
//        String name =scanner.nextLine();
//        System.out.println("How ole are you? ");
//        int age= scanner.nextInt();
//        scanner.nextLine(); // clear the scanner for us
//        System.out.println("What is your favorite food?");
//        String food=scanner.nextLine();
//
//        // the nextLine() will read the entire line(when we press enter it is similarto put\n to add a new line)
//        // but int will not read the entire line, which means excluding \n
//        //so the left/n was supposed by computers as a stop
//        //so we add scanner.nextLine();
//
//
//
//        System.out.println("Hello "+name);
//        System.out.println("You are  "+age+" years old");
//        System.out.println("You like "+food);
//
//
//
//
//
//
//        //System.out.println("I love pizza");
//        //System.out.println("It is really good！");
//
//        // this is notes
//
//        /*
//         *this
//         * is
//         * a
//         *
//         *
//         *
//         */
//
//        /*
//         *int x = 123; //initialization
//         *float y =3.14f;
//         *boolean z =true;
//         *char symbol='@';
//         *String name="Bro";
//
//         *System.out.println("My number is:"+name);
//
//         */
//
//         /*
//          *String x="water";
//          *String y="Kool-aid";
//          *String temp;
//
//          *temp =y;
//          *y=x;
//          *x=temp;
//
//
//          *System.out.println("x: "+x);
//          *System.out.println("y: "+y);
//
//
//          */
//
//
//
//
//
//
//
//    }
//}

