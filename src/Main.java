public class Main {
    public static void main(String[] args) {
        Matrix matrixFirst = new Matrix(4, 3);
        Matrix matrixSecond = new Matrix(3, 2);

        matrixFirst.fillMatrix();
        matrixSecond.fillMatrix();

        matrixFirst.print();
        matrixSecond.print();

        Matrix c = matrixFirst.sum(matrixSecond);
        c.print();
        c = matrixFirst.multiplyNumber(3);
       c.print();
        c=matrixFirst.multiplyMatrix(matrixSecond);
        c.print();


    }

}
