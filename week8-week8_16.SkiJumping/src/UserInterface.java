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
                tournamentResults();
                break;
            }
        }
    }

    public void round() {
        System.out.println();
        System.out.println("Round " + round);
        System.out.println();

        // Sort and list jump order

        int i = 1; // counter for Numbered list

        System.out.println("Jumping order:");
        Collections.sort(participants);
        for(Participant p : participants) {
            System.out.println(i + ". " + p);
            i++;
        }

        // prints results of current round
        results();

        // Increment round counter by 1; Round 2, Round 3, etc.
        round++;
    }

    public void results() {
        System.out.println();
        System.out.println("Results of round " + round);

        Random randomizer = new Random();

        for(Participant p : participants) {
            // get length
            int length = randomizer.nextInt(121 - 60) + 60;
            p.addLength(length); // add length to ArrayList in Participant Object, will be called at end of program

            // get votes
            int[] votes = new int[5];
            for(int i = 0; i < 5; i++) {
                votes[i] = randomizer.nextInt(21 - 10) + 10;
            }

            // calculate points
            int points = length;
            Arrays.sort(votes);
            int[] middleThreeVotes= Arrays.copyOfRange(votes, 1, 4);
            for(int v : middleThreeVotes) {
                points += v;
            }
            p.setPoints(points);

            // print results
            System.out.println(p.getName());
            System.out.println("  length: " + length);
            System.out.println("  judge votes: " + Arrays.toString(votes));
        }
    }

    public void tournamentResults() {
        System.out.println();
        System.out.println("Thanks!");
        System.out.println();
        System.out.println("Tournament results:");
        System.out.println("Position    Name");

        int i = 1; // Numbered list counter

        for(Participant p : participants) {
            System.out.println(i + "           " + p);
            System.out.print("            jump lengths: ");
            for(int j = 0; j < p.getLengths().size(); j++) {
                System.out.print(p.getLengths().get(j) + " m");
                if(j != p.getLengths().size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            i++;
        }
    }
}
