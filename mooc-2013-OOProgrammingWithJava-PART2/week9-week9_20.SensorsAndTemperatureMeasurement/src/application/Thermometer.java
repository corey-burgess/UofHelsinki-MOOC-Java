package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private Random random = new Random();
    private boolean checkStatus;

    public Thermometer() {
        checkStatus = false;
    }

    @Override
    public int measure() {
        if(!this.isOn()){
            throw new IllegalStateException();
        }
        return random.nextInt(60) - 30;
    }

    @Override
    public boolean isOn() {
        return this.checkStatus;
    }

    @Override
    public void on() {
        this.checkStatus = true;
    }

    @Override
    public void off() {
        this.checkStatus = false;
    }
}
