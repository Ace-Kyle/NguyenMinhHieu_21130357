package bt_tuan8;

import java.util.Comparator;

public class SortByPriceCD implements Comparator<CD> {

    public SortByPriceCD() {
        super();
    }

    @Override
    public int compare(CD o1, CD o2) {
        if (o1 == null || o2 == null) return 0; // not compare
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
