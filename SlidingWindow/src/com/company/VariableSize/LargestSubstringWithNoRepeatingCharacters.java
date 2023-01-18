package com.company.VariableSize;

import java.util.HashMap;

public class LargestSubstringWithNoRepeatingCharacters {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(longestSubstring(str));
    }

    static int longestSubstring(String str){
        int n=str.length();
        int i=0,j=0,count=0,k=0,max=-1;
        HashMap<Character,Integer> map=new HashMap<>();

        if(n==0){
            return max;
        }

        while (j<n){
            map.put(str.charAt(j),map.getOrDefault(str.charAt(j),0)+1);
            if(map.get(str.charAt(j))>1){
                count++;
            }
            if(count<k){
                j++;
            } else if(count==k){
                max=Math.max(max,j-i+1);
                j++;
            } else if(count>k){
                while(count>k){
                    map.put(str.charAt(i),map.get(str.charAt(i))-1);
                    if(map.get(str.charAt(i))==1){
                        count--;
                    }
                    if(map.get(str.charAt(i))==0){
                        map.remove(str.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
