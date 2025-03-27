package bt_tuan4;

class Test {

    public static void main(String[] args) {
        //bai 11:
        int[] a = {1, 2, 3, 4, 5,6, 7, 8, 9, 10};
        Week4.getRandomFromArray(a, 3);
        Week4.getRandomFromArray(a, 5);
        Week4.getRandomFromArray(a, 10);

        //bai 12:
        String date = "27/03/2025";
        String date2 = "30/04/2025";
        String date3 = "01/05/2025";
        System.out.println(Week4.convertDateNumberToDateString(date));
        System.out.println(Week4.convertDateNumberToDateString(date2));
        System.out.println(Week4.convertDateNumberToDateString(date3));

        //bai 13: Tokenizer
        String testString = "Toi la sinh vien khoa cong nghe thong tin";
        String testString2 = "Lap trinh nang cao";
        Week4.printInfoAboutString(testString);

        //bai 14: encryption by column
        String encrytionString = Week4.encryptionByColumn(testString, 5);
        String decryptionString = Week4.decryptionByColumn(encrytionString, 5);

        System.out.println("Encrypted String: " + encrytionString);
        System.out.println("Decrypted String: " + decryptionString);

    }
}
