package bt_tuan9.dictionary;

import java.util.HashSet;
import java.util.Set;

public class Dictionary extends Word<String, String>{
    private Set<Word<String, String>> list;

    public Dictionary() {
        super();
        this.list = new HashSet<>();
    }

    public void addWord(Word<String, String> word){
        this.list.add(word);
    }

    public void search(String english){
        for (Word<String, String> word : list) {
            if (word.getEnglish().equals(english)){
                System.out.println(">>Result:\t" +word);
                return;
            }
        }
        System.out.println(String.format(">>Result:\t\"%s\" doesnt exist in dictionary", english));
    }
}
