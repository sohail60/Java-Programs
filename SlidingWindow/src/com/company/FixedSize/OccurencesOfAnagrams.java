package com.company.FixedSize;

import java.util.HashMap;

public class OccurencesOfAnagrams {
    public static void main(String[] args) {
        String str="forxxorfxdofr",pat="for";
        System.out.println(countAnagrams(str,pat));
    }

    static int countAnagrams(String str,String pattern){
        int n=str.length();
        int l=pattern.length();
        int i=0,j=0,count=0;
        HashMap<Character,Integer> map=new HashMap<>();

        for (int m = 0; m < l; m++) {
            map.put(pattern.charAt(m),map.getOrDefault(pattern.charAt(m),0)+1);
        }

        int size=map.size();
        while(j<n){
            char ch=str.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    size--;
                }
            }

            if(j-i+1<l){
                j++;
            } else if (j-i+1==l){
                if(size==0){
                    count++;
                }

                if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
                    if(map.get(str.charAt(i))==1){
                        size++;
                    }
                }
                i++;
                j++;
            }
        }
        return count;
    }
}
