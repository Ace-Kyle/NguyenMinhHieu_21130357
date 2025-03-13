package selfpractice;

public class NumberOperator {
    public static void main(String[] args) {
        int a = 1234567890;
        int b = 5;

        while (b <= 7){
            ++b;
            System.out.println(b);
            ++b; //7
            System.out.println(b);
            b+=5;
            System.out.println("continue="+b);
            ++b;
        }


    }
}
