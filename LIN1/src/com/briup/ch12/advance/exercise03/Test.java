package com.briup.ch12.advance.exercise03;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		String string="aadfsdfdsfdsafafsafsawerewolfasd";
		char[] arrays=string.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char c:arrays){
			if(map.containsKey(c)){
				Integer integer=map.get(c);
				integer+=1;
				map.put(c, integer);
			}else{
				map.put(c, 1);
			}
			
		}
		System.out.println(map);
	}

}
