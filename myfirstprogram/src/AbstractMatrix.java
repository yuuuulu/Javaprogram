public abstract class AbstractMatrix {
    private final double[][] data;
    // Task 1: Matrix Class Implementation
    //Constructor
    public AbstractMatrix(double[][] data) {
        ValidData(data); //Guarantee each deep copy of matrix will be validated.
        this.data = DeepCopy(data);

    }

    // Guarantee that the data(matrix) is not null and all rows have the same length.
    public void ValidData(double[][] data) {
        if (data == null || data.length == 0 || !isSameRowLength(data)) {
            throw new IllegalArgumentException("Please input valid matrix with the same length of each row!");
        }
    }
    // Check if all rows with the same length
    public boolean isSameRowLength(double[][] data) {
        for (double[] DataRow : data) {
            if (DataRow.length != data[0].length) {
                return false;

            }
        }
        return true;
    }

    // Task 2: Accessor Method
    public double[][] getData() {
        return DeepCopy(data); //data is the deep copy of data
    }

    //Deep copy of data(matrix)
    public double[][] DeepCopy(double[][] data) {
        double[][] CopyData = new double[data.length][data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                CopyData[i][j] = data[i][j];
            }
        }
        return CopyData;
    }

    // Task 3: Matrix Addition
    // Task 4: Matrix Subtraction
    // Guarantee data(matrix) with the same size for addition and subtraction
    public void SameSizeData(AbstractMatrix AnotherData) {
        if (getData().length != AnotherData.getData().length || getData()[0].length != AnotherData.getData()[0].length) {
            throw new IllegalArgumentException("Please input matrices with the same dimension!");

        }
    }
    public abstract Matrix add(AbstractMatrix AnotherData);
    public abstract Matrix subtract(AbstractMatrix AnotherData);

    // Task 5: Matrix Multiplication
    // Guarantee data(matrix) with the valid size to multiply
    public void ValidMultiply(AbstractMatrix AnotherData) {
        if (getData()[0].length != AnotherData.getData().length) {
            throw new IllegalArgumentException("Please input matrices with valid size to conduct multiplication!");
        }
    }
    public double[][] TwoMatricesOperation(AbstractMatrix AnotherData, String OperationType) {
        double[][] result = new double[getData().length][getData()[0].length];

        for (int i = 0; i < getData().length; i++) {
            for (int j = 0; j < getData()[0].length; j++) {
                double data_ij = getData()[i][j];
                double AnotherData_ij = AnotherData.getData()[i][j];

                if ("add".equals(OperationType)) {
                    SameSizeData(AnotherData);
                    result[i][j] = data_ij + AnotherData_ij;
                } else if ("subtract".equals(OperationType)) {
                    SameSizeData(AnotherData);
                    result[i][j] = data_ij - AnotherData_ij;
                } else if ("multiply".equals(OperationType)) {
                    ValidMultiply(AnotherData);
                    for (int k = 0; k < getData()[0].length; k++) {
                        result[i][j] += getData()[i][k] * AnotherData.getData()[k][j];
                    }
                } else {
                    throw new IllegalArgumentException("Please choose add, subtract or multiply instead of others to calculate!");
                }
            }
        }
        return result;
    }
    public abstract Matrix multiply(AbstractMatrix AnotherData);

    // Task 6: Matrix Transposition
    public abstract Matrix transpose();

    // Task 7: Matrix Determinant
    //Guarantee the data(matrix) is square for computing determinant
    public void SquareMatrix(){
        if(getData().length != getData()[0].length){
            throw new IllegalArgumentException("Please input a square matrix for computing determinant");
        }
    }
    public abstract double determinant();
}
