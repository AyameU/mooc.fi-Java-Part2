
public class Main {

    public static void main(String[] args) {
        Card first = new Card(2, Card.DIAMONDS);
        Card second = new Card(14, Card.CLUBS);
        Card third = new Card(12, Card.HEARTS);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println();
        System.out.println("-- 8.15.1 --");

        System.out.println(second.compareTo(first));
        System.out.println(third.compareTo(second));
        System.out.println(first.compareTo(third));

        System.out.println();
        System.out.println("-- 8.15.2 --");

        Hand hand = new Hand();

        hand.add( new Card(2, Card.SPADES) );
        hand.add( new Card(14, Card.CLUBS) );
        hand.add( new Card(12, Card.HEARTS) );
        hand.add( new Card(2, Card.CLUBS) );

        hand.print();

        System.out.println();
        System.out.println("-- 8.15.3 --");

        Hand hand2 = new Hand();

        hand2.add( new Card(2, Card.SPADES) );
        hand2.add( new Card(14, Card.CLUBS) );
        hand2.add( new Card(12, Card.HEARTS) );
        hand2.add( new Card(2, Card.CLUBS) );

        hand2.sort();
        hand2.print();

        System.out.println();
        System.out.println("-- 8.15.4 --");

        Hand hand3 = new Hand();

        hand3.add( new Card(2, Card.SPADES) );
        hand3.add( new Card(14, Card.CLUBS) );
        hand3.add( new Card(12, Card.HEARTS) );
        hand3.add( new Card(2, Card.CLUBS) );

        Hand hand4 = new Hand();

        hand4.add( new Card(11, Card.DIAMONDS) );
        hand4.add( new Card(11, Card.CLUBS) );
        hand4.add( new Card(11, Card.HEARTS) );

        int comparison = hand3.compareTo(hand4);

        if ( comparison < 0 ) {
            System.out.println("the most valuable hand contains the cards");
            hand4.print();
        } else if ( comparison > 0 ){
            System.out.println("the most valuable hand contains the cards");
            hand3.print();
        } else {
            System.out.println("the hands are equally valuable");
        }
    }
}
