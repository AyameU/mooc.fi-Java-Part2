package boxes;

public class Main {

    public static void main(String[] args) {

        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));

        BlackHoleBox box2 = new BlackHoleBox();
        box2.add(new Thing("Saludo", 5));
        box2.add(new Thing("Pirkka", 5));

        System.out.println(box2.isInTheBox(new Thing("Saludo")));
        System.out.println(box2.isInTheBox(new Thing("Pirkka")));
    }
}
