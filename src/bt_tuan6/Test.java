package bt_tuan6;

import helper.Helper;

import java.util.Arrays;

class Test {

    public static void main(String[] args) {
        //bai 17

        int[] arr = {3,54,23,2,7,34,23,75,8,1,9};
        //a:
        //MAX
        System.out.println("__________Bai 17");
        System.out.println(String.format("Find MAX: %d", Week6.findMax(arr)));
        //MIN
        System.out.println(String.format("Find MIN: %d",Week6.findMin(arr)));

        //b
        System.out.println(String.format("Find index of first max: %d",Week6.findFirstMaxIndex(arr)));

        //c: Sum maxes
        int n1 = 1;
        int n2 = 3;
        int n3 = 5;
        System.out.println(String.format("Sum of %d MAX: %d", n1, Week6.sumOfMaxes(arr, n1)));
        System.out.println(String.format("Sum of %d MAX: %d", n2, Week6.sumOfMaxes(arr, n2)));
        System.out.println(String.format("Sum of %d MAX: %d", n3, Week6.sumOfMaxes(arr, n3)));


        //bai 18: matrix
        int[][] a = {
                {1,2,3},
                {5,6,7},
                {8,9,10}
        };
        int[][] b = {
                {4,2,3},
                {5,2,2},
                {6,9,-6}
        };
        int[][] b44 = {
                {4,2,3,-1},
                {5,2,2,-2},
                {6,9,-6,-3},
                {1,2,3,-4}
        };
        int[][] b34 = {
                {4,2,3,5},
                {5,2,2,6},
                {6,9,-6,7}
        };
        System.out.println("__________Bai 18");
        //a: plus
        System.out.println("SQUARE - PLUS");
        Helper.printMatrixNew(Week6Maxtrix.plusMatrix(a, b));
        Helper.printMatrixNew(Week6Maxtrix.plusMatrix(a, b44));
        //b: multiply
        System.out.println("SQUARE - MULTIPLY");
        Helper.printMatrixNew(Week6Maxtrix.multiplyMatrix(a, b));
        Helper.printMatrixNew(Week6Maxtrix.multiplyMatrix(a, b44));
        Helper.printMatrixNew(Week6Maxtrix.multiplyMatrix(b44, b34));

        //TRIANGLE
        //a: plus
        int[][] t1 = {
                {1,},
                {5,6,},
                {8,9,10}
        };
        int[][] t2 = {
                {4,},
                {5,2,},
                {6,9,-6}
        };
        System.out.println("TRIANGLE - PLUS");
        Helper.printMatrixNew(Week6Maxtrix.plusMatrixTriangle(t1, t2));



    }
}
