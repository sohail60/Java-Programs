package com.company;

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 4;
        int ans = pascalstri(n);
        System.out.println(ans);
    }

    static int pascalstri(int n){
        return 1<<(n-1);
    }
}