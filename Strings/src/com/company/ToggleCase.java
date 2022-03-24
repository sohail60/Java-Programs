package com.company;
import java.util.*;

public class ToggleCase {
    public static void main(String[] args) {
        String s="Hi Sohail";
        System.out.println(toggle(s));
    }


    static String toggle(String str){
        StringBuilder s=new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                s.append(Character.toLowerCase(str.charAt(i)));
            }
            else if(str.charAt(i)>=97 && str.charAt(i)<=122){
                s.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                s.append(str.charAt(i));
            }

        }
        return s.toString();
    }
}
