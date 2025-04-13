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
        if (a.length != b.length ||
            a[0].length != b[0].length){
            System.out.println("2 matrixes are not the same level");
            return null;
        }

        int[][] result = new int[a.length][a[0].length];
        for (int byRowOfFirst=0; byRowOfFirst < a.length; byRowOfFirst++){

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
        if (a.length != b.length ||
                a[0].length != b[0].length){
            System.out.println("2 matrixes are not the same level");
            return null;
        }
        int[][] result = new int[a.length][];
        int vA = 0, vB = 0;
        for (int i=0; i < a.length; i++){

            int max = Math.max(a[i].length, b[i].length);
            for (int m=0; m< max; m++){

                //if one's length is shorter than another
                vA = m > (a[i].length -1)? 0: a[i][m];
                vB = m > (b[i].length -1)? 0: b[i][m];

                result[i] = new int[max]; //init row
                result[i][m] = vA + vB;
            }
        }
        return result;
    }




}
