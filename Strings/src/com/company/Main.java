package com.company;

public class Main {

    public static void main(String[] args) {
	StringBuilder s=new StringBuilder("sohail");
        s.deleteCharAt(3);
        s.setCharAt(4,'v');

        System.out.println(s);

        change(s);
    }


    static void change(StringBuilder a){
        a.append('a');

    }
}
