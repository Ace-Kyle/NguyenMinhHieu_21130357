package bt_atclass;

class Test {
    public static void main(String[] args) {

        //bai 1: tach mang
        int[] arr = {1,2,3,4,5,6,7,8,9,0,20};
        int[] arr2 = {3,15,26,34,32,52,58};
        int[] arr3 = {4,6,3,3,15,64,234,652};

        Week6.splitArrayIntoEventAndOdd(arr);
        Week6.splitArrayIntoEventAndOdd(arr2);
        Week6.splitArrayIntoEventAndOdd(arr3);

        //bai 2: tinh tong
        Week6.totalExpression(5, 10);

        Week6.totalExpression(0, 15);
        Week6.totalExpression(5, 0);

        Week6.totalExpression(1, 1);
        Week6.totalExpression(1, 10);

        //bai 3: kiem tra duong cheo chinh
        int[][] matrix = {
                {-1,2,3},
                {4,5,6},
                {7,8,-9}};
        int[][] matrix2 = {
                {-1,2,3,5},
                {4,5,6,-46},
                {7,8,9,34},
                {7,-8,9,-64}};
        int[][] matrix3 = {
                {1,2,3,0,0},
                {4,-5,6,3,23},
                {7,8,9,-34,23},
                {7,8,9,34,33}};

        System.out.println(String.format("Ket qua: %b", Week6.isSameSignOf2NumbersOnCross(matrix)));
        System.out.println(String.format("Ket qua: %b", Week6.isSameSignOf2NumbersOnCross(matrix2)));
        System.out.println(String.format("Ket qua: %b", Week6.isSameSignOf2NumbersOnCross(matrix3)));


    }
}
