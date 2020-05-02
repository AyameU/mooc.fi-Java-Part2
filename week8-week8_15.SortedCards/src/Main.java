
public class Main {

    public static void main(String[] args) {
        Card first = new Card(2, Card.DIAMONDS);
        Card second = new Card(14, Card.CLUBS);
        Card third = new Card(12, Card.HEARTS);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println(second.compareTo(first));
        System.out.println(third.compareTo(second));
        System.out.println(first.compareTo(third));
    }
}
