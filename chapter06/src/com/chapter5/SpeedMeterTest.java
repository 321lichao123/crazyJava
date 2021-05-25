package com.chapter5;

public abstract class SpeedMeterTest {
    private double turnRate;

    public SpeedMeterTest() {
    }

    public abstract double getTurnRate();

    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }

    public double getSpeed() {
        return Math.PI * getTurnRate() * turnRate;
    }
}
