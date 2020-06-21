package wordinspection;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

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
}
