package com.briup.ch12.advance.exercise02;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(2);
        set.add(10);
        List<Object> data = new ArrayList<Object>();
        Collections.addAll(data, set.toArray());
        Collections.sort(data, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                int i1 = Integer.parseInt(o1.toString());
                int i2 = Integer.parseInt(o2.toString());
                // 偶数
                if (i1 % 2 == 0) {
                    return i2 - i1;
                }
                return i1 - i2;
            }
        });
        System.out.println(data);
    }
} 
