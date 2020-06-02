import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private List<Participant> participants = new ArrayList<Participant>();
    private int round = 1;

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

        while(true) {
            System.out.print("Write \"Jump\" to jump; otherwise you quit: ");
            String command = scanner.nextLine();

            if(command.equals("Jump")) {
                jumpingRound();
            }
            else {
                break;
            }
        }
    }

    public void jumpingRound() {
        int count = 1;

        System.out.println();
        System.out.println("Round " + round);
        System.out.println();

        System.out.println("Jumping order:");
        Collections.sort(participants);
        for(Participant p : participants) {
            System.out.println(count + ". " + p);
            count++;
        }
        round++;
    }
}
