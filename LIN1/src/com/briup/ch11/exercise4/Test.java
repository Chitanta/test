package com.briup.ch11.exercise4;
import java.util.*;

public class Test {
    public static void main(String[] args){
        Set set = new LinkedHashSet();
        int num=0;
        String string = "asghdthadsjjdsrujdcfhshjrfyfmjgldegwa";
        char[] ch = string.toCharArray();
        for(int i = 0; i < ch.length; i++){
            set.add(ch[i]);
        }
       
        System.out.println(set);
        }

    }
