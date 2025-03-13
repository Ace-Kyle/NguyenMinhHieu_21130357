package bt_tuan2;

import java.util.Arrays;

public class BasicArray {

    //bai 4. Cong 2 mang so nguyen
    public static int[] concat2Arrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }
    // 2nd method
    public static int[] concat2Arrays2(int[] arr1, int[] arr2) {
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

    public static int[] arrayPlus(int[] arr1, int[] arr2) {
        int higherLength = Math.max(arr1.length, arr2.length);
        int lowerLength = Math.min(arr1.length, arr2.length);
        int[] result = new int[higherLength];

        for (int i = 0; i < higherLength; i++) {
            if (i < lowerLength) {
                result[i] = arr1[i] + arr2[i];
            }else {

            }
        }
        return result;
    }
    public static void printFirstFractionalGreaterThan(int a, int b){
        //a: conditional
        //b: print numbers
        int[] result = new int[b];
        int found = 0;

        for (int i=a; found < b; i++) {

            //isPrim?
            if (isPrim(i)){
                result[found] = i;
                found++;
            }
        }
        //print
        System.out.println(Arrays.toString(result));
    }
    public static boolean isPrim(int numb){
        //isPrim?
        int foundModule = 0;
        for (int m = 1; m <= numb; m++) {
            if (numb % m == 0) foundModule++;
            //stop if found is greater than 2 (no need to iterate the rest)
            if (foundModule > 2) break;
        }
        return foundModule == 2;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7};
        //System.out.println(Arrays.toString(concat2Arrays(a, b)));
        printFirstFractionalGreaterThan(15,5 );
    }
}
