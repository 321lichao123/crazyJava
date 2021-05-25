package com.chapter6;

public class OutputFactory {
    public OutputTest out() {
        return new PrinterTest();
    }

    public static void main(String[] args) {
        OutputFactory otf = new OutputFactory();
        Computer computer = new Computer(otf);
        
        computer.print();
    }
}
