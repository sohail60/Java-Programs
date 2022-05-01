package com.company.Interfaces;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("I am Brake");
    }

    @Override
    public void start() {
        System.out.println("I am Start");
    }

    @Override
    public void stop() {
        System.out.println("I am Stop");
    }

    @Override
    public void acc() {
        System.out.println("Engine acc");
    }
}
