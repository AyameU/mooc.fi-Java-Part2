package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    @Override
    public boolean isOn() {
        for(Sensor s : sensors) {
            if(s.isOn()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void on() {
        for(Sensor s : sensors) {
            s.on();
        }
    }

    @Override
    public void off() {
        for(Sensor s : sensors) {
            s.off();
        }
    }

    @Override
    public int measure() {
        if(!this.isOn()) {
            throw new IllegalStateException("The Average Sensor is not turned on.");
        }
        if(sensors.size() == 0) {
            throw new IllegalStateException("No sensors have been added to the Average Sensor.");
        }

        int average = 0;
        int totalMeasurements = 0;
        for(Sensor s : sensors) {
            totalMeasurements += s.measure();
        }
        average = totalMeasurements / sensors.size();
        this.readings.add(average);
        return average;
    }

    public void addSensor(Sensor additional) {
        sensors.add(additional);
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
