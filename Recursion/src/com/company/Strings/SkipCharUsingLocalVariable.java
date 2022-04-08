package com.company.Strings;

public class SkipCharUsingLocalVariable {
    public static void main(String[] args) {
        String s="baccad";
        StringBuilder answer=eliminate(s);
        System.out.println(answer);
    }

    static StringBuilder eliminate(String s){
        return answer(s,0);
    }

    static StringBuilder answer(String s, int i){
        StringBuilder str=new StringBuilder();
        if(i==s.length()){
            return str;
        }
        if(s.charAt(i)!= 'A' && s.charAt(i)!='a'){
            str.append(s.charAt(i));
        }
        StringBuilder downFunctions=answer(s,i+1);

        str.append(downFunctions);
        return str;
    }
}
