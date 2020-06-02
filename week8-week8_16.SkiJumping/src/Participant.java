import java.util.ArrayList;

public class Participant implements Comparable<Participant> {
    private String name;
    private ArrayList<Integer> jumpLengths = new ArrayList<Integer>();
    private int points;

    public Participant(String name) {
        this.name = name;
        this.points = 0;
    }

    public String getName() {
        return this.name;
    }

    public void addLength(int length) {
        jumpLengths.add(length);
    }

    public ArrayList<Integer> getLengths() {
        return jumpLengths;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public String toString() {
        return this.name + " (" + this.points + ")";
    }

    @Override
    public int compareTo(Participant p) {
        if(this.points == p.getPoints()) {
            return 0;
        }
        else if(this.points < p.getPoints()) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
