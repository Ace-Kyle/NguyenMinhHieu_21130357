package bt_tuan9.university;

import java.util.ArrayList;
import java.util.List;

public class TruongDaiHoc {

    List<Nguoi> listNguoi;

    public TruongDaiHoc() {
        this.listNguoi = new ArrayList<>();
    }

    public void addNguoi(Nguoi nguoi){ this.listNguoi.add(nguoi);}
    public void printNhanVien(){
        if (listNguoi.isEmpty()) return;

        for (Nguoi nguoi : listNguoi) {
            if (nguoi instanceof NhanVien) nguoi.print();
        }
    }

    public void printSinhVien(){
        if (listNguoi.isEmpty()) return;

        for (Nguoi nguoi : listNguoi) {
            if (nguoi instanceof SinhVien) nguoi.print();
        }
    }

    public Nguoi timNhanVienLuongCaoNhat(){
        if (listNguoi.isEmpty()) return null;
        Nguoi max = null;
        for (Nguoi nguoi : listNguoi) {
            if (nguoi instanceof NhanVien &&
            nguoi.tinhLuong() > (max == null ? 0 : max.tinhLuong())) {
                max = nguoi;
            }
        }
        return max;
    }

    public boolean isSinhVien(Nguoi nguoi){ return nguoi instanceof SinhVien;}
}
