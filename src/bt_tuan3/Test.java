package bt_tuan3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {
    public static void main(String[] args) {
        //bai 8: ma hoa
        String origin = "ToiLaSinhVienNongLam";
        char password1 = 'f';
        String password2 = "NLU";

        System.out.println(String.format("Encryption: %s -> %s", origin, SimpleEncrytion.encrytion1(origin, password1)));
        System.out.println(String.format("Encryption: %s -> %s", origin, SimpleEncrytion.encrytion2(origin, password2)));

        //bai 9: dinh dang so
        int numb = 1234567890;
        System.out.println(String.format("After format %d -> %s", numb, NumberFormatter.formatInteger(numb)));

        //bai 10: sap xep mang
        int[] array = {11,2,29,4,5,67,7,18,9};
        ArrayList<Integer> list = new ArrayList<>(List.of(11,2,29,4,5,67,7,18,9));

        ArraySorter.sortSimple(array);
        ArraySorter.sortByList(list);

    }
}
