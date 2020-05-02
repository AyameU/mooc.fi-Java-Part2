import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hands;

    public Hand() {
        this.hands = new ArrayList<Card>();
    }

    public void add(Card card) {
        hands.add(card);
    }

    public void print() {
        for(Card hand : hands) {
            System.out.println(hand);
        }
    }
}
