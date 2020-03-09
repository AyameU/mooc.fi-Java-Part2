
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("\\:D/");
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String smiley = ":)";

        if(characterString.length() % 2 == 1) {
            printFirstLastLine(characterString);
            System.out.println(smiley + " " + characterString + "  " + smiley);
            printFirstLastLine(characterString);
        }
        else {
            printFirstLastLine(characterString);
            System.out.println(smiley + " " + characterString + " " + smiley);
            printFirstLastLine(characterString);
        }
    }

    private static void printFirstLastLine(String characterString) {
        String smiley = ":)";

        if(characterString.length() % 2 == 1) {
            for(int i = 0; i < (characterString.length() + 7)/2; i++) {
                System.out.print(smiley);
            }
            System.out.print("\n");
        }
        else {
            for(int i = 0; i < (characterString.length() + 6)/2; i++) {
                System.out.print(smiley);
            }
            System.out.print("\n");
        }
    }

}
