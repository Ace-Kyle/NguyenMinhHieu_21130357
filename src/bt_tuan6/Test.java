package bt_tuan6;

class Test {

    public static void main(String[] args) {
        //bai 17

        int[] arr = {3,54,23,2,7,34,23,75,8,1,9};
        //a:
        //MAX
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


    }
}
