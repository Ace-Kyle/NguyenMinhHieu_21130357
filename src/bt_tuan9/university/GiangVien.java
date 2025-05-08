package bt_tuan9.university;

public class GiangVien extends NhanVienChatLuongCao{

    private double thulaoGD;

    public GiangVien(String name, int birthYear, double luong, Date ngayNhanViec, PhongBan phongBan,
                     String nganh, String noiDaoTao,
                     double thulaoGD) {
        super(name, birthYear, luong, ngayNhanViec, phongBan, nganh, noiDaoTao);
        this.thulaoGD = thulaoGD;
    }

    public GiangVien() {
        super();
    }

    public void print(){
        super.print();
        System.out.println(String.format("\t  GD: %f", thulaoGD));
    }
}
