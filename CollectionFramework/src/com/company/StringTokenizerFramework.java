package com.company;
import java.util.*;

public class StringTokenizer {
    public static void main(String[] args) {
        String str="Name=Sohail,Dept=CSE,State=Jharkhand,Country=India";

        StringTokenizer stk=new StringTokenizer(str,",=");

        while(stk.hasMoreTokens())

    }
}