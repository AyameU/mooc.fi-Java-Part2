import validation.Person;
import validation.Calculator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(null, 25);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    }
}
