package com.company.Inheritance;

class Box {
    int l;
    int b;
    int h;

    Box() {
        System.out.println("Box Class Constructor with no argument");
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(int side) {
        System.out.println("Box Class Constructor with 1 arguments");
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(int l, int b, int h) {
        System.out.println("Box Class Constructor with 3 arguments");
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box otherBox) {
        System.out.println("Box Class Constructor with Box Class arguments");
        this.l = otherBox.l;
        this.b = otherBox.b;
        this.h = otherBox.h;
    }
}
