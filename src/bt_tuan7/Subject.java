package bt_tuan7;

public class Subject {
    private String id;
    private String name;
    private double score;

    @Override
    public String toString() {
        return "Subject [id=%d, name=%d, score=%d]".formatted(id, name, score);
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
