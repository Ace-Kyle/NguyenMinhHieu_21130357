package helper;

import java.util.Arrays;

public class Helper {

    public static void printMatrix(int[][] arr){
        for (int i=0; i < arr.length; i++){
            for (int m=0; m < arr[0].length; m++){
                System.out.printf("%d, ", arr[i][m]);
            }
            System.out.println();
        }
    }
    public static void printMatrixNew(int[][] arr){
        System.out.println(Arrays.deepToString(arr));
    }
}
