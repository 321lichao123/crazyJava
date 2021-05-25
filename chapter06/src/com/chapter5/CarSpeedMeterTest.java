package com.chapter5;

public class CarSpeedMeterTest extends SpeedMeterTest {
    @Override
    public double getTurnRate() {
        return 0.8;
    }

    public static void main(String[] args) {
        CarSpeedMeterTest cpm = new CarSpeedMeterTest();
        cpm.setTurnRate(15);
        System.out.println(cpm.getSpeed());
    }
}
