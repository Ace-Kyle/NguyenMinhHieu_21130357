package bt_tuan5;

public class Week5 {

    //bai 15:
    //b
    public static float sumB(int n, float x) {
        float sum = 1f;
        for (int i=1;i<=n;i++){
            float P = 1f;
            for (int j=0;j<=i;j++){
                P*=x;
            }
            if (i%2==0){
                sum+=P;
            }else {
                sum-=P;
            }
        }
        return sum;
    }
    //b
    public static double sumC(int n, double x) {
        double sum = 1d;
        for (int i=1;i<=n;i++){
            double P = 1d;
            for (int j=1;j<=i;j++){
                P*=j;
            }
            sum+=P;
        }
        return sum;
    }

    //bai 16:
    public static boolean isAnArrayInAnotherArray(int[] check, int[] inThisArray) {
        if (check.length > inThisArray.length) return false;

        for (int i=0; i <=(inThisArray.length - check.length); i++) {

            //System.out.println(String.format("FOR1 - check check[%d] ? inThisArray[%d]",check[0], inThisArray[i] ));
            if (check[0] == inThisArray[i]){
                //continue checking from here
                for (int at=1; at < check.length; at++){
                    if (check[at] != inThisArray[at+i]) break;
                    if (at==check.length-1) return true;
                }
            }
        }

        return false;
    }
}
