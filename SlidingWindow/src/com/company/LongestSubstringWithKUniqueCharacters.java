package com.company;

public class LongestSubstringWithKUniqueCharacters {
    public static void main(String[] args) {

    }

    static int longestSubstring(String str,int k){
        int n=str.length();
        int i=0,j=0,count=0,max=-1;
        int[] letters=new int[26];
        while (j<n){
            if(letters[(str.charAt(j))-97]==0){
                count++;
            }
            letters[str.charAt(j)]++;
            if(count<k){
                j++;
            } else if(count==k){
                max=Math.max(max,j-i+1);
                j++;
            } else if(count>k){
                while(count>k){
                    letters[str.charAt(j)]--;
                    if(letters[(str.charAt(j))-97]==0){
                        k--;
                    }
                    i++;
                }
                j++;
            }
        }
        return max;
    }
}
