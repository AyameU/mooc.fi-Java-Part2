package application;

public class Main {
    public static void main(String[] args) {

        /*
        ConstantSensor fifteen = new ConstantSensor(15);
        ConstantSensor minusTwo = new ConstantSensor(-2);

        System.out.println(fifteen.measure());
        System.out.println(minusTwo.measure());

        System.out.println(fifteen.isOn());
        fifteen.off();
        System.out.println(fifteen.isOn());

        Thermometer thermometer = new Thermometer();
        System.out.print("Is the thermometer on? ");
        thermometer.on();
        System.out.println(thermometer.isOn());
        System.out.println(thermometer.measure());
        */

        Sensor kumpula = new Thermometer();
        kumpula.on();
        System.out.println("the temperature in Kumpula is "+kumpula.measure() + " degrees");

        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");

        ConstantSensor toronto = new ConstantSensor(10);
        helsinkiArea.addSensor(toronto);
        System.out.println("the temperature in Helsinki area is "+helsinkiArea.measure() + " degrees");
        System.out.println("The temp in the toronto area is " + toronto.measure() + " degrees");
    }
}
