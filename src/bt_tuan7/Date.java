package bt_tuan7;

public class Date {
    int day;
    int month;
    int year;

    @Override
    public String toString() {
        return "[Day=%d, Month=%d, Year=%d]".formatted(day, month, year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
