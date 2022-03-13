package com.company;

public class MagicNo {
    public static void main(String[] args) {
        int n=4;
        int ans=magic(n);
        System.out.println(ans);
    }

    static int magic(int n){
        int answer=0,i=1;
        while (n>0){
            int last=n&1;
            answer=answer+last*(int)Math.pow(5,i);
            n=n>>1;
            i++;
        }
        return answer;
    }
}