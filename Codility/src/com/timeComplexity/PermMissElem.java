package com.timeComplexity;

public class PermMissElem {
	public int solution(int[] A) {
		
		
		if (A.length == 0) return 1;
		
		int sum = 0;
	    for (int num : A) sum += num;
		
        long l = A.length;
        long tot = ((l+2)*(l+1))/2;
        return (int) (tot - sum);
	    
	    
        
    }
}
