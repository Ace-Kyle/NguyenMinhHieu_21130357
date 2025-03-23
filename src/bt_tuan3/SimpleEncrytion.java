package bt_tuan3;

public class SimpleEncrytion {

    //Bai 8: ma hoa chuoi voi XOR
    public static String encrytion1(String input, char password) {
        //password is a byte
        char[] inputArr = input.toCharArray();
        String result = "";

        for (int i = 0; i < inputArr.length; i++) {
            result += (char) (inputArr[i]^password);
        }
        return result;
    }
    public static String encrytion2(String input, String password) {
        //password is a string
        char[] inputArr = input.toCharArray();
        char[] passwordArr = password.toCharArray();
        String result = "";

        for (int i = 0; i < inputArr.length; i++) {
            result += (char) (inputArr[i ]^passwordArr[i % passwordArr.length]);
        }
        return result;
    }
}
