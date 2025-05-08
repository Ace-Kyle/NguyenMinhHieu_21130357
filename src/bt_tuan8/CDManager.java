package bt_tuan8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CDManager {

    int size = 10;
    int pos = 0;
    //List<CD> list = new ArrayList<>(); //with List of CD
    CD[] list = new CD[size];                           //with Array of CD

    //with List
    /*public boolean addCD(CD cd) {
        Add: {
            if (pos > size) break Add;
            for (CD existingCD : list) {
                if (existingCD.isDuplicateID(cd.getId())) break Add;
            }
            list.add(pos++, cd);
            return true;
        }
        System.out.println("->Cannot add CD");
        return false;
    }*/

    //with Array
    public boolean addCD(CD cd) {
        Add: {
            //check available capacity
            Checking:{
                if (pos == 0) break Checking;   //add new CD
                if (pos >= size) break Add;     //don't add

                //check duplicate
                CD existingCD;
                for (int i=0; i < pos; i++ ) {
                    existingCD = list[i];
                    //TODO find out why foreach does not ignore null in array
                    //System.out.println("----DEBUG: existingCD: " + existingCD.getId());
                    if (existingCD.isDuplicateID(cd.getId())) {
                        System.out.println("Found duplicate CD when adding");
                        break Add;
                    }
                }
            }
            list[pos++] = cd;
            return true;
        }
        System.out.println("[ERROR] Cannot add CD with ID: "+cd.getId());
        return false;
    }

    public int computeNumberOfCD(){
        return pos == 0 ? 0 : pos++;
    }

    public double totalPrice(){
        double total = 0;
        for (CD cd : list){
            if (cd == null) continue;
            total += cd.getPrice();
        }
        return total;
    }

    public void printAll(){
        for (CD cd : list){
            if (cd == null) continue;
            System.out.println(cd);
        }
    }
    public void sortByPrice(){
        //Collections.sort(List.of(list), new SortByPriceCD()); //with List
        Arrays.sort(list, new SortByPriceCD()); //with Array
    }
    public void sortByTitle(){
        //Collections.sort(List.of(list), new SortByTitleCD()); //with List
        Arrays.sort(list, new SortByTitleCD()); //with Array
    }
}
