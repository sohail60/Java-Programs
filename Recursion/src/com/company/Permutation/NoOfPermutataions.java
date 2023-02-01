package com.company.Permutation;

public class NoOfPermutataions {
    public static void main(String[] args) {
        String s="abc";
        int answer1=asBodyVariable("",s);
        System.out.println(answer1);
        int answer2=asArgument("",s,0);
        System.out.println(answer2);
    }

    static int asBodyVariable(String updated, String initial){
        if(initial.isEmpty()){
            return 1;
        }

        char ch=initial.charAt(0);
        int count=0;

        for (int i = 0; i < updated.length()+1; i++) {
            String first=updated.substring(0,i);
            String second=updated.substring(i,updated.length());
            count=count+asBodyVariable(first+ch+second,initial.substring(1));
        }
        return count;
    }

    static int asArgument(String updated, String initial,int count){
        if(initial.isEmpty()){
            count++;
            return count;
        }

        char ch=initial.charAt(0);

        for (int i = 0; i < updated.length()+1; i++) {
            String first=updated.substring(0,i);
            String second=updated.substring(i,updated.length());
            count=asArgument(first+ch+second,initial.substring(1),count);
        }
        return count;
    }
}
