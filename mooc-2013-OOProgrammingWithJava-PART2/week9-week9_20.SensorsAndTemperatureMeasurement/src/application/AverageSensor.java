package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        sensors = new ArrayList<Sensor>();
        readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor additional){
        sensors.add(additional);
    }

    public List<Integer> readings(){
        return readings;
    }

    @Override
    public int measure() {
        if(!this.isOn() || sensors.size() == 0){
            throw new IllegalStateException();
        }
        int sum = 0;
        for(Sensor sensor : sensors){
            sum += sensor.measure();
        }
        readings.add(sum/sensors.size());
        return sum/sensors.size();

    }

    @Override
    public boolean isOn() {
        for(Sensor sensor : sensors){
            if (!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor : sensors){
            sensor.on();
        }
    }

    @Override
    public void off() {
        for(Sensor sensor : sensors){
            sensor.off();
        }
    }
}
