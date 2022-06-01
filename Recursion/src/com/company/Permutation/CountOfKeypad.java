package com.company.Permutation;

public class CountOfKeypad {
    public static void main(String[] args) {
        String str="12";
        int answer=keypad("",str,0);
        System.out.println(answer);
    }
/*
    1          2         3
  a,b,c      d,e,f     g,h,i

    4          5         6
  j,k,l      m,n,o     p,q,r

    7          8         9
  s,t,u      v,w,x      y,z

  This type of keypad is considered for this question.
*/
    static int keypad(String updated,String initial,int count){
        if(initial.isEmpty()){
            count++;
            return count;
        }

        int digit=Character.getNumericValue(initial.charAt(0));

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            String str=Character.toString((char)(i+97));
            count=keypad(updated+str,initial.substring(1),count);
        }
        return count;
    }
}