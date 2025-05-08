package bt_tuan9.university;

public class NhanVienChatLuongCao extends NhanVien {

    protected String nganh;
    protected String noiDaoTao;

    public NhanVienChatLuongCao(
            String name, int birthYear, double luong, Date ngayNhanViec, PhongBan phongBan,
            String nganh, String noiDaoTao) {
        super(name, birthYear, luong, ngayNhanViec, phongBan);
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    public NhanVienChatLuongCao() {
        super();
    }
}
