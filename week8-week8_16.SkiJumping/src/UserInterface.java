import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Participant> participants = new ArrayList<Participant>();

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Kumpula ski jumping week");
        System.out.println();

        addParticipants();
        jumpingPhase();
    }

    public void addParticipants() {
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        String name;
        do {
            System.out.print("Participant name: ");
            name = scanner.nextLine();

            if(!name.equals("")) {
                participants.add(new Participant(name));
            }
        }
        while(!name.equals(""));
    }

    public void jumpingPhase() {
        System.out.println("The tournament begins!");
        System.out.println();
        System.out.print("Write \"Jump\" to jump; otherwise you quit: ");

        String command = scanner.nextLine();
        if(command.equals("Jump")) {

            // Do Stuff
            for(Participant p : participants) {
                System.out.println(p);
            }
        }
    }
}
