public class Main {
    public static void main(String[] args) {
        Matrix matrixFirst = new Matrix(3, 3);
        Matrix matrixSecond = new Matrix(2, 3);

        matrixFirst.fillMatrix();
        matrixSecond.fillMatrix();

        matrixFirst.print();
        matrixSecond.print();

        Matrix result = matrixFirst.sum(matrixSecond);
        result.print();
        result = matrixFirst.multiplyNumber(3);
       result.print();
        result=matrixFirst.multiplyMatrix(matrixSecond);
        result.print();


    }

}
