package com.company;
import java.util.*;

public class SetFramework {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet<>();
//        Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> set=new TreeSet<>();

        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(10);

        System.out.println(set);

    }
}
