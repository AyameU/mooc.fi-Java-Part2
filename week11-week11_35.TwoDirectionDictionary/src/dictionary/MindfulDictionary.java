package dictionary;

import java.util.Map;
import java.util.HashMap;
import java.io.*;
import java.util.Scanner;

public class MindfulDictionary {

    private Map<String, String> words = new HashMap<String, String>();
    private String file;

    public MindfulDictionary() {}

    public MindfulDictionary(String file) {
        this.file = file;
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

    public boolean load() {
        try {
            File file = new File(this.file);
            Scanner scan = new Scanner(file);

            // Loop through lines in file, split line into two parts and add to dictionary.
            while(scan.hasNext()) {
                String line = scan.nextLine();
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch(Exception e) {
            return false;
        }
    }
}
