package bt_tuan6;

public class Week6Maxtrix {

    //bai 18: maxtrix

    //a: plus 2 matrix
    public static int[][] plusMatrix(int[][] a, int[][] b) {
        if (a.length != b.length &&
        a[0].length != b[0].length){
            System.out.println("2 matrixes are not the same level");
            return null;
        }

        int[][] result = new int[a.length][a[0].length];
        for (int i=0; i < a.length; i++){
            for (int m=0; m< a[0].length; m++){
                result[i][m] = a[i][m] + b[i][m];
            }
        }
        return result;
    }
    //b: muliply 2 matrix
    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        if (a.length != b.length &&
            a[0].length != b[0].length){
            System.out.println("2 matrixes are not the same level");
            return null;
        }

        int[][] result = new int[a.length][a[0].length];
        for (int byRowOfFirst=0; byRowOfFirst < a.length; byRowOfFirst++){

            //FIXME - err index out of bound
            //Self-practice: extend for 2 matrix doesnot the same level
            if (a.length != b[byRowOfFirst].length){
                System.out.println("2 matrixes can NOT be multiply");
                return null;
            }

            for (int atSpecificRow=0; atSpecificRow < a[byRowOfFirst].length; atSpecificRow++){
                for (int i=0; i < b.length; i++){
                    result[byRowOfFirst][atSpecificRow] += a[atSpecificRow][i] * b[i][atSpecificRow];
                }
            }
        }
        return result;
    }
    //Triangle matrix
    public static int[][] plusMatrixTriangle(int[][]a, int[][] b){

        return null;
    }




}
