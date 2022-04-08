package com.company.Strings;

public class SkipCharUsingVarinArguments {
    public static void main(String[] args) {
        String s="baccad";
        StringBuilder answer=eliminate(s);
        System.out.println(answer);
    }

    static StringBuilder eliminate(String s){
        StringBuilder str=new StringBuilder();
        return (answer(str,s,0));
    }

    static StringBuilder answer(StringBuilder str,String s,int i){
        if(i==s.length()){
            return str;
        }
        if(s.charAt(i)!= 'A' && s.charAt(i)!='a'){
            str.append(s.charAt(i));
        }
        return answer(str,s,i+1);
    }
}