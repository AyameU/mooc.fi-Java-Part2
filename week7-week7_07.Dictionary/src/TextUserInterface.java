import java.util.Scanner;

public class TextUserInterface {
    private Scanner scanner;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        scanner = reader;
        this.dictionary = dictionary;
    }

    public void start() {

        String statement = "";

        System.out.println("Statement:");
        System.out.println("add - quits the text user interface");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");

        while(!(statement.toLowerCase().equals("quit"))) {

            System.out.print("Statement: ");
            statement = scanner.nextLine();

            if(statement.toLowerCase().equals("quit")) {
                System.out.println("Cheers!");
                System. exit(0);
            }
            else if(statement.toLowerCase().equals("add")) {
                System.out.print("In Finnish: ");
                String finnish = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                dictionary.add(finnish, translation);
            }
            else if(statement.toLowerCase().equals("translate")) {
                System.out.print("Give a word: ");
                String toTranslate = scanner.nextLine();
                System.out.println(dictionary.translate(toTranslate));
            }
            else {
                System.out.println("Unknown statement");
            }
        }
    }
}
