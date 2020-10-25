
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    private List<String> fileLines = new ArrayList<String>();

    public List<String> read(String file) throws FileNotFoundException {
        File f = new File(file);
        Scanner scan = new Scanner(f);
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            fileLines.add(line);
        }
        return fileLines;
    }

    public void save(String file, String text) throws IOException {
        FileWriter writer = new FileWriter(file);
        writer.write(text + "\n");
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);

        for(String text : texts) {
            writer.write(text + "\n");
        }
        writer.close();
    }
}
