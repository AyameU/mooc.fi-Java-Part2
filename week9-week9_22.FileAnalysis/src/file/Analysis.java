package file;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Analysis {
    private ArrayList<String> lines;

    public Analysis(File file) throws Exception {
        Scanner reader = new Scanner(file);
        lines = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            line += "\n";
            lines.add(line);
        }
        reader.close();
    }

    public int lines() {
        int numLines = 0;
        for(int i = 0; i < lines.size(); i++) {
            numLines++;
        }
        return numLines;
    }

    public int characters() {
        int numChars = 0;
        for(String l : lines) {
            numChars += l.length();
        }

        return numChars;
    }
}
