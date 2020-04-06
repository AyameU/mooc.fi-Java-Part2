import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translation = new HashMap<String, String>();

    public String translate(String word) {
        return this.translation.get(word);
    }

    public void add(String word, String translation) {
        this.translation.put(word, translation);
    }

    public int amountOfWords() {
        return this.translation.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translationList = new ArrayList<String>();
        for(String key : translation.keySet()) {
           translationList.add(key + " = " + this.translation.get(key));
        }
        return translationList;
    }
}
