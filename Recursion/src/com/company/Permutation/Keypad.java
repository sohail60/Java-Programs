package com.company.Permutation;

import java.util.ArrayList;

/*
    1          2         3
  a,b,c      d,e,f     g,h,i

    4          5         6
  j,k,l      m,n,o     p,q,r

    7          8         9
  s,t,u      v,w,x      y,z

  This type of keypad is considered for this question.
*/

public class Keypad {
    public static void main(String[] args) {
        String str="12";
        viaPrinting("",str);
        ArrayList<String> answer=viaArraylist("",str);
        System.out.println(answer);
    }

    static void viaPrinting(String updated,String initial){
        if(initial.isEmpty()){
            System.out.println(updated);
            return;
        }

        int digit=Character.getNumericValue(initial.charAt(0));

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            String str=Character.toString((char)(i+97));
            viaPrinting(updated+str,initial.substring(1));
        }
    }

    static ArrayList<String> viaArraylist(String updated, String initial){
        if(initial.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(updated);
            return list;
        }

        int digit=Character.getNumericValue(initial.charAt(0));
        ArrayList<String> answer=new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            String str=Character.toString((char)(i+97));
            answer.addAll(viaArraylist(updated+str,initial.substring(1)));
        }
        return answer;
    }
}
