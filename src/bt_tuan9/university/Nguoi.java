package bt_tuan9.university;

public abstract class Nguoi {

    protected String name;
    protected int birthYear;

    public Nguoi(String name, int birthYear){

        this.name = name;
        this.birthYear = birthYear;
    }

    public Nguoi() {
    }

    public void print(){
        System.out.println(toString());
    }
    public String toString(){ return String.format("%s \t %d", name, birthYear);}
    public double inLuong(){ return 0;}
    public double tinhLuong(){ return 0;}


}
