import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ContactBook contactBook;

    public UserInterface(Scanner scanner, ContactBook contactBook) {
        this.scanner = scanner;
        this.contactBook = contactBook;
    }

    public void start() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println("1 add a number");
        System.out.println("2 search for a number");
        System.out.println("3 search for a person by phone number");
        System.out.println("4 add an address");
        System.out.println("5 search for personal information");
        System.out.println("6 delete personal information");
        System.out.println("7 filtered listing");
        System.out.println("x quit");

        String command = "";

        while(!command.equals("x")) {
            System.out.print("command: ");
            command = this.scanner.nextLine();

            switch(command) {
                case "1":
                    System.out.print("whose number: ");
                    String name = scanner.nextLine();
                    if(this.contactBook.contactBook.containsKey(name)) {
                        System.out.print("number: ");
                        String phoneNumber = scanner.nextLine();
                        contactBook.contactBook.get(name).addPhoneNumber(phoneNumber);
                    }
                    else {
                        System.out.println("not found");
                    };
                    break;
                case "2":
                    System.out.print("whose number: ");
                    name = scanner.nextLine();
                    if(contactBook.contactBook.containsKey(name)) {
                        contactBook.contactBook.get(name).getPhoneNumber();
                    }
                    else {
                        System.out.println("not found");
                    };
                    break;
                case "3": System.out.println("1");
                    break;
                case "4": System.out.println("1");
                    break;
                case "5": System.out.println("1");
                    break;
                case "6": System.out.println("1");
                    break;
                case "7": System.out.println("1");
                    break;
                case "8": System.out.println("1");
                    break;
            }
        }
    }
}
