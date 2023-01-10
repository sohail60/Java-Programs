package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFramework {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
//        Map<String,Integer> map=new HashMap<>();

        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        System.out.println(map);
    }
}