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
}
