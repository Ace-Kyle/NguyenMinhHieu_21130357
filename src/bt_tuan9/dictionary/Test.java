package bt_tuan9.dictionary;

class Test {

    public static void main(String[] args) {
        Dictionary dict = new Dictionary();
        dict.addWord(new Word<>("Hello", "Xin chao"));
        dict.addWord(new Word<>("Database", "Co so du lieu"));
        dict.addWord(new Word<>("Variable", "Bien"));
        dict.addWord(new Word<>("Array", "Mang"));

        //search
        dict.search("Hello");
        dict.search("hello"); //lowercase

        dict.search("Database");
        dict.search("Array");

        dict.search("List");
        dict.search("SpringFramework");

    }
}
