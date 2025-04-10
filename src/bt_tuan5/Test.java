package bt_tuan5;

class Test {
    public static void main(String[] args) {
        //bai 15
        //b
        System.out.println(Week5.sumB(4, 2));
        System.out.println(Week5.sumB(0, 4));
        System.out.println(Week5.sumB(4, 0));
        //c
        System.out.println(Week5.sumC(4, 2));
        System.out.println(Week5.sumC(0, 4));
        System.out.println(Week5.sumC(4, 0));

        //bai 16:
        int[] base = {1,2,3,4,5,6,7,8,9};
        int[] check1 = {7,8,9};
        int[] check2 = {5,6,0,8};
        System.out.println("Check 1:"+Week5.isAnArrayInAnotherArray(check1, base));
        System.out.println("Check 2:"+Week5.isAnArrayInAnotherArray(check2, base));
    }
}
