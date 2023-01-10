package com.company;
import java.util.*;

public class ArrayListFramework {
    public static void main(String[] args) {
	    ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

//        One way of printing -> Using for each
//        for (Integer item : list){
//            System.out.println(item);
//        }

//        Other way of printing -> Using Iterator
//        Using while loop
//        Iterator<Integer> it=list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

//        Using for loop
        for(Iterator<Integer> it=list.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
