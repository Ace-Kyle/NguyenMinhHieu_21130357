package bt_atclass;

import java.util.ArrayList;
import java.util.Arrays;

public class Week6 {

    //bai 1: tach manh chan le
    public static void splitArrayIntoEventAndOdd(int[] arr){
        ArrayList<Integer> arr1 = new ArrayList<>(); //chan
        ArrayList<Integer> arr2 = new ArrayList<>(); //le

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){ arr1.add(arr[i]); }
            else { arr2.add(arr[i]); }
        }
        System.out.println("-------Ket qua tach mang-------");
        System.out.println(String.format("Mang so CHAN: %s", Arrays.toString(arr1.toArray())));
        System.out.println(String.format("Mang so LE: %s", Arrays.toString(arr2.toArray())));
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
