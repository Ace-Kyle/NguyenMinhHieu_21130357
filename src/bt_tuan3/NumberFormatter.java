package bt_tuan3;

public class NumberFormatter {

    //bai 9: Dinh dang so nguyen
    public static String formatInteger(int input) {
        String result = "";
        String number = Integer.toString(input);
        StringBuilder stringBuilder = new StringBuilder(number);

        // couple of 3 ditgit
        int oddDigits = number.length() % 3;
        int numberOfSeparate = number.length() /3 + (oddDigits >0? 0: 1);

        //insert separate
        for (int i = 1; i <= numberOfSeparate; i++) {
            stringBuilder.insert(number.length() - i*3, ",");
        }
        return stringBuilder.toString();
    }
}
