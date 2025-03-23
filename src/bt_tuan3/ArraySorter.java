package bt_tuan3;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySorter {

    //bai 10: sap xep mang so nguyen
    public static void sortSimple(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {

                    //swap
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void sortByList(ArrayList<Integer> list) {
        //dont iterate the last number
        for (int i = 0; i < list.size() -1; i++) {

            for (int j = i + 1; j < list.size(); j++) {

                //swap
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);

    }
}
