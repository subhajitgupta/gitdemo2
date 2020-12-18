package com.counting;

import java.util.Arrays;

public class PermCheck {
	
	public int solution(int[] A) {
		
		Arrays.sort(A);
		
		for(int i=0;i<A.length;i++) {
			if (A[i] != i+1) break;
			if(i == A.length-1) return 1;
		}
		
		
		return 0;
        // write your code in Java SE 8
    }

}
