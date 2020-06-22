package dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dictionary = new HashMap<String, Set<String>>();

    @Override
    public void add(String word, String entry) {
        // adds a new entry to a word, maintaining the old ones
        if(!dictionary.containsKey(word)) {
            dictionary.put(word, new HashSet<String>());
            dictionary.get(word).add(entry);
        }
        else {
            dictionary.get(word).add(entry);
        }
    }

    @Override
    public Set<String> translate(String word) {
        // returns a Set object, with all the entries of the word,
        // or a null reference, if the word is not in the dictionary
        if(dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        return null;
    }

    @Override
    public void remove(String word) {
        // removes a word and all its entries from the dictionary
            dictionary.remove(word);
    }
}
