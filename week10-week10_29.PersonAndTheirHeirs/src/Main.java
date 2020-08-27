import people.*;

public class Main {

    public static void main(String[] args) {
        Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 031100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);

        System.out.println("\n------\nPart 2\n------\n");

        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());

        System.out.println("\n------\nPart 3\n------\n");

        Student becca = new Student("Becca", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println( becca );
        becca.study();
        System.out.println( becca );

        System.out.println("\n------\nPart 4\n------\n");

        Teacher Pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher ekko = new Teacher("Ekko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println( Pekka );
        System.out.println( ekko );

        Student olly = new Student("Olly", "Ida Albergintie 1 Street 00400 Helsinki");
        for ( int i=0; i < 25; i++ ) {
            olly.study();
        }
        System.out.println( olly );
    }
}
