import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
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

    public void sort() {
        Collections.sort(this.hands);
    }

    public int compareTo(Hand hand) {

        int sum1 = 0;
        int sum2 = 0;

        // add value of all cards in first hand
        for(Card card : this.hands) {
            sum1 += card.getValue();
        }

        // add value of all cards in second hand
        for(Card card : hand.hands) {
            sum2 += card.getValue();
        }

        if(sum1 < sum2) {
            return -1;
        }
        if(sum1 > sum2) {
            return 1;
        }
        return 0;
    }
}