import java.util.Random;

public class Matrix {
    private double[][] matrix;
    private int row;
    private int column;

    public Matrix(int row, int column) {
        matrix = new double[row][column];
        this.row = row;
        this.column = column;


    }
        public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setValue(int row, int column, double value) {
        matrix[row][column] = value;
    }

    public double getValue(int row, int column) {
        return matrix[row][column];
    }


    public void fillMatrix() {
        Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = random.nextInt();

            }

        }
    }

    public void print() {
        if (matrix.length == 1 && matrix[0].length == 0)
            System.out.println("Входные данные, не соответствуют условиям сложения матриц");
        else if (matrix.length == 0) System.out.println("Входные данные не соответствуют условиям умножения матриц");

        else {
            System.out.println("===========================================================");
            for (double[] doubles : matrix) {
                for (double aDouble : doubles) {
                    System.out.print("   |   " + aDouble);

                }
                System.out.println("   |   ");
                System.out.print("___________________________________________________________");
                System.out.println();

            }
        }
    }

    public Matrix sum(Matrix matrix) {
        Matrix total = new Matrix(row, column);
        if (this.getRow() != matrix.getRow() || this.getColumn() != matrix.getColumn()) return new Matrix(1, 0);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                total.setValue(i, j, this.getValue(i, j) + matrix.getValue(i, j));
            }
        }
        return total;
    }

    public Matrix multiplyNumber(double number) {
        Matrix total = new Matrix(row, column);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                total.setValue(i, j, this.getValue(i, j) * number);
            }
        }
        return total;
    }

    public Matrix multiplyMatrix(Matrix matrix) {
        Matrix total = new Matrix(this.row, matrix.getColumn());
        if (this.getColumn() != matrix.getRow()) return new Matrix(0, 0);


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < matrix.getColumn(); j++) {
                for (int k = 0; k < column; k++) {
                    total.setValue(i, j, total.getValue(i, j) + this.getValue(i, k) * matrix.getValue(k, j));

                }

            }

        }
        return total;

    }

}
