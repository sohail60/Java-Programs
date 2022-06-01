package com.company.Permutation;

import java.util.ArrayList;

public class DiceArrayList {
    public static void main(String[] args) {
        int num=4,face=6;
        ArrayList<String> answer= diceRoll("",num,face);
        System.out.println(answer);
    }

    static ArrayList<String> diceRoll(String s,int n,int face){
        if(n==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> answer=new ArrayList<>();
        for (int i = 1; i <=face && i<=n; i++) {
            answer.addAll(diceRoll(s+i,n-i,face));
        }
        return answer;
    }
}