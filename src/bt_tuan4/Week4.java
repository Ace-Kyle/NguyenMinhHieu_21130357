package bt_tuan4;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Week4 {

    //bai 11:
    public static void getRandomFromArray(int[] arr, int t){
        int[] re = new int[t];
        for(int i = 0; i < re.length; i++){
            re[i] = arr[(int)(Math.random()*arr.length)];
        }
        System.out.printf("Random %d element(s) from array: %s%n", t, Arrays.toString(re));
    }

    //bai 12:
    public static String convertDateNumberToDateString(String date){
        String seperator = "/";
        //get date split
        StringTokenizer tokenizer = new StringTokenizer(date, seperator);
        if (tokenizer.countTokens() !=3) return "";

        String day   = tokenizer.hasMoreTokens()?   tokenizer.nextToken():"";
        String month = tokenizer.hasMoreTokens()?   tokenizer.nextToken():"";
        String year  = tokenizer.hasMoreTokens()?   tokenizer.nextToken():"";
        //convert month from number to characters
        int monthInNumber = Integer.parseInt(month);
        month = switch (monthInNumber){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        return String.format("%s %s %s", day, month, year);
    }

    //bai 13: using Tokenizer
    public static void printInfoAboutString(String input){
        StringTokenizer tokenizer = new StringTokenizer(input);
        System.out.printf("Number of words in input: %d%n", tokenizer.countTokens());
        while (tokenizer.hasMoreElements()){
            System.out.println("->" + tokenizer.nextToken());
        }
    }

    //bai 14: encryption
    public static String encryptionByColumn(String string, int column){
        int row = string.length()%column >0? string.length()/column +1: string.length()/column;
        char[][] encryptionTable = new char[row][column];

        for (int rowIndex = 0; rowIndex < row; rowIndex++){
            for (int columnIndex = 0; columnIndex < column; columnIndex++){

                //instead using counter for characters having been added
                int indexInString = rowIndex*column+columnIndex;
                encryptionTable[rowIndex][columnIndex] = indexInString >= string.length() || Character.isWhitespace(string.charAt(indexInString))?
                        '-':
                        string.charAt(indexInString); //encrytion before add to table
            }
        }

        //concat encryptionTable - select by COLUMN
        String encryptedString = "";
        for (int columnIndex = 0; columnIndex < column; columnIndex++){
            for (int rowIndex = 0; rowIndex < row; rowIndex++){
                encryptedString += cipherHelper(encryptionTable[rowIndex][columnIndex], column);
            }
        }
        return encryptedString;
    }

    public static String decryptionByColumn(String string, int column){
        int row = string.length()/column;
        char[][] decryptionTable = new char[row][column];

        int currentIndex = 0;
        for (int col=0; col < column; col++){
            for (int rowIndex = 0; rowIndex < row; rowIndex++){
                decryptionTable[rowIndex][col] = string.charAt(currentIndex++);
            }
        }

        //concat decryptionTable - select by ROW
        String decryptedString = "";
        for (int rowIndex = 0; rowIndex < row; rowIndex++){
            for (int col=0; col < column; col++){
                char decryptedChar += cipherHelper(decryptionTable[rowIndex][col], column);
decryptedString += (decryptedChar == '-')?' ': decryptedChar;
            }
        }
        return decryptedString;
    }
    public static char cipherHelper(char character, int key){
        //encryption or decryption
        return (char) (character^key);
    }
}
