import java.util.Scanner;

public class Reader {
    private Scanner scanner = new Scanner(System.in);

    public String readString() {
        String word = scanner.nextLine();
        return word;
    }

    public int readInteger() {
        int number = Integer.parseInt(scanner.nextLine());
        return number;
    }
}
