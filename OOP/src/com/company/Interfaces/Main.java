package com.company.Interfaces;

public class Main {
    public static void main(String[] args) {
        Engine car=new Car();
//        car.start();
//        car.stop();
//        car.acc();
//
//        Media car2=new Car();
//
//        car2.start();
//        car2.stop();

//        NiceCar car3=new NiceCar();
//        car3.start();
////        car3.stop();
//        car3.startMusic();

        NiceCar car4=new NiceCar(car);
        car4.stopMusic();
        car4.start();
    }
}