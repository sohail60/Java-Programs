package com.company.VariableSize;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String str="timetopractice",ptr = "toc";
        System.out.println(mimimumWindowSubstring(str,ptr));
    }

    static String mimimumWindowSubstring(String str, String ptr){
        int n=str.length();
        int l=ptr.length();
        int i=0,j=0,count=0,min=0;
        String result="";
        HashMap<Character,Integer> map=new HashMap<>();

        for (int m = 0; m < l; m++) {
            map.put(ptr.charAt(m),map.getOrDefault(ptr.charAt(m),0)+1);
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

            if(size<0){
                j++;
            } else if(size==0){
                if(j-i+1<min){
                min=j-i+1;
                result=str.substring(i,j+1);
                }
                j++;
            } else if(size>0){
                while (size>0){
                    if(map.containsKey(str.charAt(i))){
                        map.put(str.charAt(i),map.get(str.charAt(i))+1);
                        if(map.get(str.charAt(i))==1){
                            size++;
                        }
                    }
                    i++;
                }
                j++;
            }
        }
        return result;
    }
}
