public class Matrix extends AbstractMatrix{
    // Task 1: Matrix Class Implementation
    // Task 2: Accessor Method
    //Constructor
    public Matrix(double[][] data){
        super(data);
    }
    // Task 3: Matrix Addition
    public Matrix add(AbstractMatrix AnotherData){
        double[][] result = TwoMatricesOperation(AnotherData, "add");
        return new Matrix(result);
    }
    // Task 4: Matrix Subtraction
    public Matrix subtract(AbstractMatrix AnotherData){
        double[][] result = TwoMatricesOperation(AnotherData, "subtract");
        return new Matrix(result);
    }
    // Task 5: Matrix Multiplication
    public Matrix multiply(AbstractMatrix AnotherData){
        double[][] result = TwoMatricesOperation(AnotherData, "multiply");
        return new Matrix(result);
    }
    // Task 6: Matrix Transposition
    public Matrix transpose() {
        double[][] TransposedMatrix = new double[getData()[0].length][getData().length];
        for (int i = 0; i < getData().length; i++) {
            for (int j = 0; j < getData()[0].length; j++) {
                TransposedMatrix[j][i] = getData()[i][j];
            }
        }
        return new Matrix(TransposedMatrix);
    }

    // Task 7: Matrix Determinant
    public double determinant() {
        //Guarantee the data(matrix) is square for computing determinant
        SquareMatrix();
        //1*1(a number) returns itself
        if (getData().length == 1) return getData()[0][0];
        //2*2 matrix multiplication
        if (getData().length == 2) {
            return getData()[0][0] * getData()[1][1] - getData()[0][1] * getData()[1][0];
        }
        //3*3 matrix multiplication
        if (getData().length == 3) {
            return getData()[0][0] * (getData()[1][1] * getData()[2][2] - getData()[1][2] * getData()[2][1])
                    - getData()[0][1] * (getData()[1][0] * getData()[2][2] - getData()[1][2] * getData()[2][0])
                    + getData()[0][2] * (getData()[1][0] * getData()[2][1] - getData()[1][1] * getData()[2][0]);
        }
        throw new UnsupportedOperationException("Determinant calculation is only supported for 1x1, 2x2, or 3x3 matrices.");
    }
}
