package bt_tuan7;

public class Subject {
    private String id;
    private String name;
    private double score;

    public Subject(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Subject getClone() {
        return new Subject(id, name, score);
    }

    @Override
    public String toString() {
        return String.format("Subject [id=%s, name=%s, score=%s]",id, name, score);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
