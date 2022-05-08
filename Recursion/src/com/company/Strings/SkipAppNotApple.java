package com.company.Strings;

public class SkipAppNotApple {
    public static void main(String[] args) {
        String s="saappe";
        String answer=stringSkip(s);
        System.out.println(answer);
    }
    static String stringSkip(String s){
        return helper(s,"");
    }

    static String helper(String initial,String updated){
        if(initial.isEmpty()){
            return updated;
        }

        if(initial.startsWith("app") && !initial.startsWith("apple")){
            return helper(initial.substring(3),updated);
        }
        else{
            updated=updated+initial.charAt(0);
            return helper(initial.substring(1),updated);
        }
    }
}