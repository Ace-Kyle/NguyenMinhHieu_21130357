package bt_tuan6;

import java.util.ArrayList;

public class Week6 {

    //bai 17
    //a
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int at=1; at < arr.length; at++){
            if (arr[at] > max){ max = arr[at]; }
        }
        return max;
    }


    public static int findMin(int[] arr){
        int min = arr[0];
        for (int at=1; at < arr.length; at++){
            if (arr[at] < min){ min = arr[at]; }
        }
        return min;
    }

    //find first max index
    public static int findFirstMaxIndex(int[] arr){
        int max = arr[0];
        int index = 0;
        for (int at=1; at < arr.length; at++){
            if (arr[at] > max){
                max = arr[at];
                index = at;
            }
        }
        return index;
    }

    //c - MYSELF
    public static int sumOfMaxes(int[] arr, int n){
        int sum = 0;

        //sort max->min
        for (int at=0; at < arr.length; at++){
            for (int at2= (at+1); at2 < arr.length; at2++){
                if (arr[at] < arr[at2]){
                    //swap
                    int temp = arr[at];
                    arr[at] = arr[at2];
                    arr[at2] = temp;
                }
            }
        }
        //sum n elements
        for (int at=0; at < n; at++){
            sum += arr[at];
        }
        return sum;
    }

    //FOLLOW Idea of teacher at lab room
    public static int sumOfMaxes2(int[] arr, int n){
        ArrayList<Integer> listOfFoundMax = new ArrayList<>();
        int sum = 0;
        int max = arr[0];
        int index = 0;

        for (int time=0; time < n; time++) {
            for (int at=1; at < arr.length; at++){
                if (arr[at] > max && !listOfFoundMax.contains(at)){
                    max = arr[at];
                    index = at;
                }
            }
            listOfFoundMax.add(index);
            sum += arr[index];
        }

        return sum;
    }

}
