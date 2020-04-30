public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);

        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println( box );

        Box box2 = new Box(9);

        box2.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box2.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box2.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );

        System.out.println(box2);

        Box box3 = new Box(8);

        box2.add(new Book("Jane Austen", "Pride and Prejudice", 2.5));

        box3.add(box2);

        System.out.println(box3);
    }
}
