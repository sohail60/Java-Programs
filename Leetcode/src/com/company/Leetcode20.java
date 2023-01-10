package com.company;

import java.util.Stack;

public class Leetcode20 {
    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(paranthesis(s));
    }

    static boolean paranthesis(String s){
        Stack<Character> stack=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
            stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char ch=stack.pop();
                if(!((ch=='(' && s.charAt(i)==')') || (ch=='{' && s.charAt(i)=='}') || (ch=='[' && s.charAt(i)==']'))){
                    return false;
                }
            }
        }

        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    }
