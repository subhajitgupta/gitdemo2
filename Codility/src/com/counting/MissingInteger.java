package com.counting;

import java.util.HashSet;

public class MissingInteger {
	
	public int solution(int[] A) {
		
	
		int max = Integer.MAX_VALUE;
		HashSet<Integer> hs = new HashSet<>(); 
		for(int i:A) hs.add(i);
		
		for(int i =1;i<=max;i++) {
			if(!hs.contains(i)) return i;
		}

		return 0;
    }

}
