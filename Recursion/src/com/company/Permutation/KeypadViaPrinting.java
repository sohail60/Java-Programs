package com.company.Permutation;

public class KeypadViaPrinting {
    public static void main(String[] args) {
        String str="12";
        keypad("",str);
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
    static void keypad(String updated,String initial){

        if(initial.isEmpty()){
            System.out.println(updated);
            return;
        }

        int digit=Character.getNumericValue(initial.charAt(0));

        for (int i = (digit-1)*3; i < digit*3 ; i++) {
            String str=Character.toString((char)(i+97));
            keypad(updated+str,initial.substring(1));
        }
    }
}
