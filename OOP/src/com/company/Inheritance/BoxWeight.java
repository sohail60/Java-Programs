package com.company.Inheritance;

class BoxWeight extends Box {
    int weight;

    BoxWeight() {
        // automatically calling the Box default Constructor
        System.out.println("BoxWeight Class Constructor with no arguments");
        this.weight = -1;
    }

    BoxWeight(int side, int w) {
        // automatically calling the Box default Constructor if we don't call any parent class constructor
        super(side);
        System.out.println("BoxWeight Class Constructor with 2 arguments");
        this.weight = w;
    }

    BoxWeight(int l, int b, int h, int w) {
        // automatically calling the Box default Constructor if we don't call any parent class constructor
        super(l, b, h);
        System.out.println("BoxWeight Class Constructor with 4 arguments");
        this.weight = w;
    }

    BoxWeight(Box otherBox, int w) {
        // automatically calling the Box default Constructor if we don't call any parent class constructor
        super(otherBox);
        System.out.println("BoxWeight Class Constructor with Box and int arguments");
        this.weight = w;
    }
}
