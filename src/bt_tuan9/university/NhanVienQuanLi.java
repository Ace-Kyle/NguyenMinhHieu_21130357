package bt_tuan9.university;

public class NhanVienQuanLi extends NhanVienChatLuongCao{

    private double phuCapChucVu;

    public NhanVienQuanLi(String name, int birthYear, double luong, Date ngayNhanViec, PhongBan phongBan,
                          String nganh, String noiDaoTao,
                          double phuCapChucVu) {
        super(name, birthYear, luong, ngayNhanViec, phongBan, nganh, noiDaoTao);
        this.phuCapChucVu = phuCapChucVu;
    }

    public String toString(){ return super.toString() + String.format("Phu cap chuc vu: %f", phuCapChucVu);}
    public double tinhLuong(){ return super.tinhLuong()+ phuCapChucVu;}
    //or - the same result
    //public double tinhLuong(){ return super.luong+ phuCapChucVu;}

}
