package com.timeComplexity;

public class TapeEqb {
	
	public static int solution(int[] A) {			
		int sum = 0;
		int minDif =Integer.MAX_VALUE;
	    for (int num : A) sum += num;
	    int X = sum;
	    
	    for(int p=1;p<A.length;p++) {
	    	int temp;
			if(p==0) temp = 0;
	    	else temp = 2 * A[p-1];
			 X = X -temp;
			minDif = Math.min(minDif, Math.abs(X));
	    }
    
   
     return minDif;
		
	
    }
	
	public static void main(String[] args) {
		int[] A = {5,-5};
		System.out.println("\n"+solution(A));
	}

}
