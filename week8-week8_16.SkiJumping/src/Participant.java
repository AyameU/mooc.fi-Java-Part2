import java.util.ArrayList;

public class Participant implements Comparable<Participant> {
    private String name;
    private int length;
    private ArrayList<Integer> jumpLengths = new ArrayList<Integer>();
    private int points;

    public Participant(String name) {
        this.name = name;
        this.length = 0;
        this.points = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
        jumpLengths.add(length);
    }

    public ArrayList<Integer> getJumpLengths() {
        return jumpLengths;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String toString() {
        return this.name + " (" + this.points + ")";
    }

    @Override
    public int compareTo(Participant p) {
        if(this.length == p.getLength()) {
            return 0;
        }
        else if(this.length < p.getLength()) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
