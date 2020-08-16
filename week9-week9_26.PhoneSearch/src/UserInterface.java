import java.util.Collection;
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
            String input;

            if(command.equals("1")) {
                System.out.print("whose number: ");
                input = scanner.nextLine();
                if(this.contactBook.contact.containsKey(input)) {
                    System.out.print("number: ");
                    String phoneNumber = scanner.nextLine();
                    contactBook.contact.get(input).addPhoneNumber(phoneNumber);
                }
                else {
                    System.out.println("not found");
                }
            }
            else if(command.equals("2")) {
                System.out.print("whose number: ");
                input = scanner.nextLine();
                if(contactBook.contact.containsKey(input)) {
                    for(String p : contactBook.contact.get(input).getPhoneNumber()) {
                        System.out.println(p);
                    }
                }
                else {
                    System.out.println("not found");
                }
            }
            else if(command.equals("3")) {
                System.out.print("number: ");
                input = scanner.nextLine();
                Collection<Person> contacts = contactBook.contact.values();
                for(Person p : contacts) {
                    for(String ph : p.getPhoneNumber()) {
                        if (ph.equals(input)) {
                            System.out.println(p.getName());
                        }
                    }
                }
            }
            else if(command.equals("4")) {
                System.out.print("whose address: ");
                input = scanner.nextLine();
                if(contactBook.contact.containsKey(input)) {
                        System.out.print("street: ");
                        String street = scanner.nextLine();
                        System.out.print("city: ");
                        String city = scanner.nextLine();
                        contactBook.contact.get(input).addAddress(street, city);
                }
                else {
                    System.out.println("not found");
                }
            }
            else if(command.equals("5")) {
                System.out.print("whose information: ");
                input = scanner.nextLine();
                if(contactBook.contact.containsKey(input)) {
                    contactBook.contact.get(input).getAddress();
                }
                else {
                    System.out.println("not found");
                }
            }
            else if(command.equals("6")) {
                System.out.print("whose information: ");
                input = scanner.nextLine();
                if(contactBook.contact.containsKey(input)) {
                    contactBook.contact.get(input).deleteInformation();
                }
            }
            else if(command.equals("7")) {
                System.out.println("1");
            }
        }
    }
}
