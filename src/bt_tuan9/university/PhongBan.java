package bt_tuan9.university;

public class PhongBan {
    private String maPB;
    private String tenPB;

    public PhongBan(String maPB, String tenPB) {
        this.maPB = maPB;
        this.tenPB = tenPB;
    }

    public String toString(){ return String.format("Ma PB: %s, Ten: %s", maPB, tenPB);}

}
