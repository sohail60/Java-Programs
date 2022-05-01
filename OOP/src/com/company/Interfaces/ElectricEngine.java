package com.company.Interfaces;

public class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine stops");
    }

    @Override
    public void acc() {
        System.out.println("Electric Engine acc");
    }
}