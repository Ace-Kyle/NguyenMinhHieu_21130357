package bt_tuan9.university;

public class SinhVien extends Nguoi{

    private float d1;
    private float d2;
    private float d3;

    public SinhVien(String name, int birthYear, float d1, float d2, float d3) {
        super(name, birthYear);
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public SinhVien() {
        super();
    }

    public void print(){
        System.out.println(toString());
    }
    public String toString(){ return super.toString() + String.format("%.1f \t %.1f \t %.1f", d1, d2, d3);}
}
