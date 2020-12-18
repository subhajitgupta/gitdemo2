package com.sort;

import java.util.HashSet;

public class Distinct {
	
	public int solution(int[] A) {
		
		HashSet<Integer> hs = new HashSet<>();
		for(int i:A) {
			hs.add(i);
		}
		return hs.size();
        // write your code in Java SE 8
        
        
    }

}
