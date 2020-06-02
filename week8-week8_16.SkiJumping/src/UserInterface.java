import java.util.*;

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
        startTournament();
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

    public void startTournament() {
        System.out.println("The tournament begins!");

        while(true) {
            System.out.println();
            System.out.print("Write \"Jump\" to jump; otherwise you quit: ");
            String command = scanner.nextLine();

            if(command.equals("Jump")) {
                round();
            }
            else {
                break;
            }
        }
    }

    public void round() {
        int count = 1;

        System.out.println();
        System.out.println("Round " + round);
        System.out.println();

        // Sort and list jump order
        System.out.println("Jumping order:");
        Collections.sort(participants);
        for(Participant p : participants) {
            System.out.println(count + ". " + p);
            count++;
        }

        // prints results of current round
        results();

        // Increment round counter by 1; Round 2, Round 3, etc.
        round++;
    }

    public void results() {
        Random randomizer = new Random();

        System.out.println();
        System.out.println("Results of round " + round);

        for(Participant p : participants) {
            int length = randomizer.nextInt(121 - 60) + 60;
            int[] votes = new int[5];

            // get votes
            for(int i = 0; i < 5; i++) {
                votes[i] = randomizer.nextInt(21 - 10) + 10;
            }

            System.out.println(p.getName());
            System.out.println("  length: " + length);
            System.out.println("  judge votes: " + Arrays.toString(votes));
        }
    }
}
