import validation.Person;
import validation.Calculator;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Angela", 25);
        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

        Calculator calculator = new Calculator();
        System.out.println(calculator.multiplication(0));
        System.out.println(calculator.binomialCoefficient(2, 1));
    }
}
