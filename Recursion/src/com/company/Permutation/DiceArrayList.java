package com.company.Permutation;

import java.util.ArrayList;

public class DiceArrayList {
    public static void main(String[] args) {
        int num=4;
        ArrayList<String> answer= diceRoll("",num);
        System.out.println(answer);
    }

    static ArrayList<String> diceRoll(String s,int n){
        if(n==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> answer=new ArrayList<>();
        for (int i = 1; i <=6 && i<=n; i++) {
            answer.addAll(diceRoll(s+i,n-i));
        }
        return answer;
    }
}
