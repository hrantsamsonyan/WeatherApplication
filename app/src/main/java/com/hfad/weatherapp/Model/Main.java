package com.hfad.weatherapp.Model;

/**
 * Created by Hrant on 2/6/2018.
 */

public class Main {
    private double temp;
    private double pressure;
    private int humidiity;
    private double temp_min;
    private double temp_max;

    public Main(double temp, double pressure, int humidiity, double temp_min, double temp_max) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidiity = humidiity;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidiity() {
        return humidiity;
    }

    public void setHumidiity(int humidiity) {
        this.humidiity = humidiity;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }
}
