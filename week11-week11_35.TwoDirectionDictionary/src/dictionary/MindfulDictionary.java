package dictionary;

import java.util.Map;
import java.util.HashMap;

public class MindfulDictionary {

    private Map<String, String> words;

    public MindfulDictionary() {
        words = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        if(!words.containsKey(word)) {
            words.put(word, translation);
        }
    }

    public String translate(String word) {
        if (words.containsKey(word)) {
            return words.get(word);
        }
        else if(words.containsValue(word)) {
            String translation = "";

            for(String w : words.keySet()) {
                if(words.get(w).equals(word)) {
                   translation = w;
                }
            }
            return translation;
        }
        else {
            return null;
        }
    }
}
