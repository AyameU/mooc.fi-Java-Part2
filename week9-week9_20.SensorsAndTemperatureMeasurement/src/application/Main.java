package application;

public class Main {
    public static void main(String[] args) {
        ConstantSensor fifteen = new ConstantSensor(15);
        ConstantSensor minusTwo = new ConstantSensor(-2);

        System.out.println(fifteen.measure());
        System.out.println(minusTwo.measure());

        System.out.println(fifteen.isOn());
        fifteen.off();
        System.out.println(fifteen.isOn());
    }
}
