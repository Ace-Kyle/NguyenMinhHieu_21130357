package bt_tuan2;

import java.util.Arrays;

public class BasicArray {

    //bai 4. Cong 2 mang so nguyen
    public static int[] arrayPlus(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
    // 2nd method
    public static int[] arrayPlus2(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        //add first array
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        //add second array
        for (int i = 0; i< arr2.length; i++) {
            result[i+arr1.length] = arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7};
        System.out.println(Arrays.toString(arrayPlus(a, b)));
        //
    }
}
