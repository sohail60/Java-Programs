package com.company.Permutation;

public class NoOfPermutationsAsArgument {
    public static void main(String[] args) {
        String s="abc";
        int answer=permutation("",s,0);
        System.out.println(answer);
    }

    static int permutation(String updated, String initial,int count){
        if(initial.isEmpty()){
            count++;
            return count;
        }

        char ch=initial.charAt(0);

        for (int i = 0; i < updated.length()+1; i++) {
            String first=updated.substring(0,i);
            String second=updated.substring(i,updated.length());
            count=permutation(first+ch+second,initial.substring(1),count);
        }
        return count;
    }
}