package bt_tuan1;

import java.util.Arrays;
import java.util.Scanner;

public class BasicNumber {
    //bai 1. Lam tron
    public static int roundNumber(double numb){
        int integerPart = (int) numb;
        int floatingPart = (int) ((numb - integerPart)*10);
        return integerPart + (floatingPart>=5?1: 0);
    }
    //bai 2. So CHAN LE
    public static String isEvent(int numb){
        return numb%2==0?"So chan": "So le";
    }
    //bai 2. So NGUYEN TO
    public static String isFractional(int numb){
        int found = 0;
        for(int i=1; i<=numb; i++){
            if (numb%i==0) found++;
        }
        return found==2? "So nguyen to": "Khong phai so nguyen to";
    }
    //bai 2. So HOAN HAO
    public static String isPerfectNumber(int numb){
        int totalFound = 0;
        for(int i=1; i<=numb; i++){
            if (numb%i==0) totalFound+=totalFound;
        }
        return totalFound==numb? "So HOAN HAO": "Khong phai so HOAN HAO";
    }
    //bai 3. Dem so chu so
    public static int countDigits(int numb){
        if (numb==0) return 1;
        int counter = 0;
        while (true){
            if ((numb/=10) == 0) return counter;
            counter++;
        }
    }
    //EXTRA EXCERCISE
    //Dem CHAN LE
    public static void countOddEven(int numb){
        int oddCounter = 0;
        int evenCounter = 0;
        for (int i=1; i<=numb; i++){
            if (numb%2 ==0) evenCounter++;
            else oddCounter++;
        }
        System.out.println("Tong so CHAN cua "+ numb+ " la "+evenCounter);
        System.out.println("Tong so LE cua "+ numb+ " la "+oddCounter);
    }
    //Dem so NGUYEN TO
    public static int countFractional(int numb){
        int found = 0;
        for (int i=1; i<=numb; i++) {

            //isPrim?
            int foundModule = 0;
            for (int m = 1; m <= i; m++) {
                if (i % m == 0) foundModule++;
                //stop if found is greater than 2 (no need to iterate the rest)
                if (foundModule > 2) break;
            }
            if (foundModule == 2) found++;
        }
        return found;
    }

    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        //double numb = sc.nextDouble();
        //System.out.println(roundNumber(numb));

        System.out.println(countFractional(50));
    }
}
