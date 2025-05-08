package bt_tuan9.university;

class Test {

    public static void main(String[] args) {
        TruongDaiHoc uni = new TruongDaiHoc();

        //sinh vien
        uni.addNguoi(new SinhVien("Nguyen Van A", 2000, 7, 10, 7));
        uni.addNguoi(new SinhVien("Nguyen Van B", 2001, 7, 10, 8));
        uni.addNguoi(new SinhVien("Nguyen Van C", 2002, 9, 10, 9));
        uni.addNguoi(new SinhVien("Nguyen Van D", 2003, 9, 10, 10));

        //phong ban
        PhongBan taiChinh = new PhongBan("Tai chinh", "TC01");
        PhongBan noiVu = new PhongBan("Noi vu", "NV01");

        //giang vien
        uni.addNguoi(new GiangVien("Tinh", 1950, 10_000, new Date(01, 05, 2005),
                taiChinh, "CNTT", "DH Nong Lam", 5_000));
        uni.addNguoi(new GiangVien("Tram", 1980, 9_000, new Date(01, 05, 2005),
                taiChinh, "CNTT", "DH Nong Lam", 5_000));
        uni.addNguoi(new GiangVien("Du", 1980, 9_000, new Date(01, 05, 2005),
                taiChinh, "CNTT", "DH Nong Lam", 5_000));

        //kiem tra sinh vien
        System.out.println("La sinh vien: "+ uni.isSinhVien(new SinhVien()));
        System.out.println("La sinh vien: "+ uni.isSinhVien(new GiangVien()));

        //in danh sach
        System.out.println("========= Danh sach nhan vien");
        uni.printNhanVien();

        System.out.println("========= Danh sach sinh vien");
        uni.printSinhVien();

        //tim nhan vien luong cao nhat
        System.out.println("========= Tim nhan vien luong cao nhat");
        System.out.println(uni.timNhanVienLuongCaoNhat());
    }
}
