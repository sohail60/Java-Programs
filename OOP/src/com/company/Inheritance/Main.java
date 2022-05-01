package com.company.Inheritance;

import com.company.Inheritance.Box;
import com.company.Inheritance.BoxWeight;

public class Main{
    public static void main(String[] args) {

        //Accessing the constructors of Box
//        Box box1=new Box();
//        System.out.println(box1.l);
//
//        Box box2=new Box(3);
//        System.out.println(box2.l);
//
//        Box box3=new Box(2,6,4);
//        System.out.println(box3.l);
//
//        Box box4=new Box(box1);
//        System.out.println(box4.l);


        //Accessing the constructors of BoxWeight
//        BoxWeight box5=new BoxWeight();
//        System.out.println(box5.weight);
//        System.out.println(box5.l);

//        BoxWeight box6=new BoxWeight(5,20);
//        System.out.println(box6.l);
//        System.out.println(box6.weight);

        BoxWeight box7=new BoxWeight(5,8,10,15);
        System.out.println(box7.l);
        System.out.println(box7.weight);

        BoxWeight box8=new BoxWeight(box7,20);
        System.out.println(box8.l);
        System.out.println(box8.weight);


        Box box9 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.w);
//        you are given access to variables that are in the ref type


//        BoxWeight box6 = new Box(2, 3, 4);
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
    }
}

