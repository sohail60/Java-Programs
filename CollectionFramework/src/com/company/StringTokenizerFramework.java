package com.company;
import java.util.*;

public class StringTokenizerFramework {
    public static void main(String[] args) {
        String str="Name=Sohail,Dept=CSE,State=Jharkhand,Country=India";

//        New line is by default considered as a delimiter
        StringTokenizer stk=new StringTokenizer(str,",=");

        while(stk.hasMoreTokens()){
            System.out.println(stk.nextToken());
        }
    }
}