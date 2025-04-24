package bt_tuan8;

public class CD {
    private int id;
    private String name;
    private String singer;
    private int numberOfSong;
    private double price;

    public CD(int id, String name, String singer, int numberOfSong, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numberOfSong = numberOfSong;
        this.price = price;
    }

    public boolean isDuplicateID(int idToCheck){
        return this.id == idToCheck;
    }
    public String toString(){
        return String.format("CD [id=%s, name=%s, singer=%s, numberOfSong=%s, price=%s]",id, name, singer, numberOfSong, price);
    }
    //Getter, setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getNumberOfSong() {
        return numberOfSong;
    }

    public void setNumberOfSong(int numberOfSong) {
        this.numberOfSong = numberOfSong;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
