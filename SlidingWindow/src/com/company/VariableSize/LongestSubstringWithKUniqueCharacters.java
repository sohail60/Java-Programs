package com.company.VariableSize;

import java.util.HashMap;

public class LongestSubstringWithKUniqueCharacters {
    public static void main(String[] args) {
        String str="aabacbebebe";
        int k=3;
        System.out.println(longestSubstring(str,k));
    }

    static int longestSubstring(String str,int k){
        int n=str.length();
        int i=0,j=0,count=0,max=-1;
        HashMap<Character,Integer> map=new HashMap<>();
        while (j<n){
            map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)+1);
            count=map.size();
            if(count<k){
                j++;
            } else if(count==k){
                max=Math.max(max,j-i+1);
                j++;
            } else if(count>k){
                while(count>k){
                    map.put(str.charAt(i),map.get(str.charAt(i))-1);
                    if(map.get(str.charAt(i))==0){
                        map.remove(str.charAt(i));
                    }
                    count=map.size();
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
