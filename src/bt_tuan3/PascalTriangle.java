package bt_tuan3;

import bt_tuan2.BasicArray;

public class PascalTriangle {
    //bai 6: print pascal retangle
    //a
    public static void printMatrix(int[][] matrix) {
        for(int[] row: matrix){
            for(int cell: row){
                System.out.print(cell+" ");
            }
            //new line
            System.out.println("\n");
        }
    }
    //b
    public static int[][] createPascalTriangle(int size) {
        int[][] triangle = new int[size][];
        for(int row = 1; row <= size; row++) {
            //create row
            int[] rowArray = new int[row];
            for(int col =0; col < row; col++) {
                rowArray[col] = col +1;
            }
            //add row to triangle
            triangle[row-1] = rowArray;
        }
        return triangle;
    }
    public static int[][] createPascalTriangle(int[][] matrix) {
        int[][] result = new int[matrix.length][];
        //iterate row
        for(int row = 0; row < matrix.length; row++) {
            int[] rowArray = new int[row+1];
            //add cell to row
            for(int col = 0;col < row; col++) {
                rowArray[col] = matrix[row][col];
            }
            //add row to triangle
            result[row] = rowArray;
        }
        return result;
    }
    //
    public static int[][] createRandomRetangleMatrix(int size){
        int[][] matrix = new int[size][size];
        for (int row=0; row < size; row++){
            for (int col=0; col < size; col++){
                matrix[row][col] = (int) (Math.random()*10);
            }
        }
        return matrix;
    }

    //KIEM TRA tat ca phan tu tren duong cheo chinh la CHAN
    public static boolean isEvenOnCross(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
                if (!(matrix[row][row] % 2 == 0)) return false;
        }
        return true;
    }

    //KIEM TRA tat ca phan tu tren duong cheo chinh la CHAN LE "dan xen"
    public static boolean isEvenAndOddOnCross(int[][] matrix){
        int value = 0;
        for(int row = 0; row < matrix.length; row++){
            //if odd
            value = matrix[row][row];
            if ((row+1) %2 == 0){
                //for EVEN
                if (value % 2 != 0) return false;
            }else {
                //for ODD
                if (value %2 != 1) return false;
            }

        }
        return true;
    }
    //in ra tat ca so nguyen to co trong mang
    public static void printAllPrimInArray(int[] arr){
        for (int value: arr){
            if (BasicArray.isPrim(value)) System.out.println("So nguyen to trong mang: "+value);
        }
    }

    public static void main(String[] args) {
      int[][] matrix = createPascalTriangle(7);
      printMatrix(matrix);
      printMatrix(createPascalTriangle(createRandomRetangleMatrix(10)));

    }
}
