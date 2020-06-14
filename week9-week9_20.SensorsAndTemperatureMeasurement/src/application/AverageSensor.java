package application;

import java.util.ArrayList;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private boolean status;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.status = false;
    }

    @Override
    public boolean isOn() {
        for(Sensor s : sensors) {
            if(s.isOn()) {
                return true;
            }
        }
        return this.status;
    }

    @Override
    public void on() {
        for(Sensor s : sensors) {
            s.on();
        }
        this.status = true;
    }

    @Override
    public void off() {
        for(Sensor s : sensors) {
            s.off();
        }
        this.status = false;
    }

    @Override
    public int measure() {
        if(this.status = false) {
            throw new IllegalStateException("The Average Sensor is not turned on.");
        }
        if(sensors.size() == 0) {
            throw new IllegalStateException("No sensors have been added to the Average Sensor.");
        }

        int totalMeasurements = 0;
        for(Sensor s : sensors) {
            totalMeasurements += s.measure();
        }
        return totalMeasurements / sensors.size();
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }
}
