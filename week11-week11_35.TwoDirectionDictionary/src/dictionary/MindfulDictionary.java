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
            return this.getKeyFromValue(word);
        }
        else {
            return null;
        }
    }

    public void remove(String word) {
        // Find and remove entry based on key
        if (words.containsKey(word)) {
            words.remove(word);
        }
        else if(words.containsValue(word)) {
            // Find and remove entry based on value.
            String wordToRemove = this.getKeyFromValue(word);
            words.remove(wordToRemove);
        }
    }

    public String getKeyFromValue(String word) {
        String translation = "";

        for(String w : words.keySet()) {
            if(words.get(w).equals(word)) {
                    translation = w;
            }
        }
        return translation;
    }
}
