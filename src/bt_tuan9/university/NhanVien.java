package bt_tuan9.university;

public class NhanVien extends Nguoi {
    protected double luong;
    protected Date ngayNhanViec;
    protected PhongBan phongBan;

    public NhanVien(String name, int birthYear, double luong, Date ngayNhanViec, PhongBan phongBan) {
        super(name, birthYear);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.phongBan = phongBan;

    }

    public NhanVien() {

    }

    @Override
    public String toString() {
        return super.toString() + String.format("luong: %.1f, ngayNhanViec: %s, phongBan: %s", luong, ngayNhanViec, phongBan);
    }

    public double tinhLuong() {
        return luong;
    }
}
