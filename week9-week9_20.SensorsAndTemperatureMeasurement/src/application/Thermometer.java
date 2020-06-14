package application;

public class Thermometer implements Sensor{
    private boolean status;

    public Thermometer() {
        this.status = false;
    }

    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public int measure() {
        if(!this.isOn()) {
            throw new IllegalStateException("The thermometer is off.");
        }
        return (int) ((Math.random() * (30 - -30)) + -30);
    }
}
