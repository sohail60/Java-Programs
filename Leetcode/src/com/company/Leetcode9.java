package com.company;

public class Leetcode9 {
    public boolean isPalindrome(int n) {
        int a = 0, rev=0,org=n;
        while (n > 0) {
            a = n % 10;
            rev = rev * 10 + a;
            n=n/10;
        }
        return (org==rev);
    }
}
