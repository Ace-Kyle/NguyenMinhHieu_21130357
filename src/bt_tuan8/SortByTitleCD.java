package bt_tuan8;

import java.util.Comparator;

public class SortByTitleCD implements Comparator<CD> {

    public SortByTitleCD() {
        super();
    }

    @Override
    public int compare(CD o1, CD o2) {
        if (o1 == null || o2 == null) return 0; // not compare
        return o1.getName().compareTo(o2.getName());
    }
}
