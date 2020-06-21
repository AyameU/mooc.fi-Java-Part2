package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordInspection {
    private ArrayList<String> words;

    public WordInspection(File file) throws Exception{
        Scanner reader = new Scanner(file, "UTF-8");
        words = new ArrayList<String>();

        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            words.add(line);
        }
        reader.close();
    }

    public int wordCount() {
        return words.size();
    }

    public List<String> wordsContainingZ() {
        List<String> containsZ = new ArrayList<String>();

        for(String l : words){
            if(l.contains("z")) {
                containsZ.add(l);
            }
        }
        return containsZ;
    }

    public List<String> wordsEndingInL() {
        List<String> endsWithL = new ArrayList<String>();

        for(String l : words){
            if(l.endsWith("l")) {
                endsWithL.add(l);
            }
        }
        return endsWithL;
    }
}
