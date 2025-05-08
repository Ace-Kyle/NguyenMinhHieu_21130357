package bt_tuan9.dictionary;

public class Word<K, V>{
    //using generic
    private K english;
    private V viet;

    public Word(K english, V viet) {
        this.english = english;
        this.viet = viet;
    }

    public Word() {

    }

    public K getEnglish() {
        return english;
    }

    public void setEnglish(K english) {
        this.english = english;
    }

    public V getViet() {
        return viet;
    }

    public void setViet(V viet) {
        this.viet = viet;
    }

    public String toString(){ return String.format("::%s \t-> %s", english, viet);}
}
