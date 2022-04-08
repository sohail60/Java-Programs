package com.company.Strings;

public class SkipString {
    public static void main(String[] args) {
        String s="applesdfu";
        String target="apple";
        String answer=stringskip(s,target);
        System.out.println(answer);
    }

    static String stringskip(String s,String target){
        return helper(s,target,"");
    }

    static String helper(String initial,String target,String updated){
        if(initial.isEmpty()){
            return updated;
        }

        if(initial.startsWith(target)){
            return helper(initial.substring(target.length()),target,updated);
        }
        else{
            updated=updated+initial.charAt(0);
            return helper(initial.substring(1),target,updated);
        }
    }
}
