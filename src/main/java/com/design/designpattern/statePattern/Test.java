package com.design.designpattern.statePattern;

public class Test {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(10);

        machine.insertQuarter();
        machine.trunCrank();

        machine.insertQuarter();
        machine.trunCrank();

        machine.insertQuarter();
        machine.trunCrank();

        machine.insertQuarter();
        machine.trunCrank();
    }
}
