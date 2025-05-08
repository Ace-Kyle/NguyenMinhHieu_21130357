package bt_tuan9.university;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(){}

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return String.format("Ngay %d thang %d name %d", day, month, year);
    }
}
