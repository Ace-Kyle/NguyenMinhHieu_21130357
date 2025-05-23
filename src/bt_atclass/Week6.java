package bt_atclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Week6 {

    //bai 1: tach manh chan le
    public static int[][] splitArrayIntoEventAndOdd(int[] arr){
        ArrayList<Integer> list1 = new ArrayList<>(); //even
        ArrayList<Integer> list2 = new ArrayList<>(); //odd

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                list1.add(arr[i]); }
            else {
                list2.add(arr[i]); }
        }
        /*return new Object[][]{
                list1.toArray(),
                list2.toArray()
        };*/
        int[] arr1 = new int[list1.size()];
        int[] arr2 = new int[list2.size()];
        for (int i=0;i<arr1.length;i++) arr1[i] = list1.get(i);
        for (int i=0;i<arr2.length;i++) arr2[i] = list2.get(i);

        return new int[][]{arr1, arr2};
    }

    //bai 2: tinh tong theo cong thuc
    public static double totalExpression(double x, int n){
        double s = 0;

        for (int i = 0; i <= n; i++) {
            //factorial of i
            long f = 1;
            for (int j = 1; j <= i; j++) {
                f*=j;
            }
            //exponent of x
            double e = 1;
            for (int k = 1; k <= i; k++) {
                if (i ==0) break;
                e*=x;
            }
            //cong thuc
            s+=e/f;

        }
        return s;
    }

    //bai 3: duong cheo chinh co 2 so lien tiep cung dau
    public static boolean isSameSignOf2NumbersOnCross(int[][] ma){
        for (int i = 0; i < ma.length -1; i++) {
            //gia su so 0 voi bat cu so nao la deu cung dau
            if (ma[i][i]*ma[i+1][i+1] >= 0) return false;
        }
        return true;
    }
}
