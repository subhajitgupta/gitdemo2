package com.counting;

import java.util.LinkedHashSet;

public class Frog_river {
	
	    public static int solution(int X, int[] A) {
	    	
	    	LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();	    	
	    	for(int i = 0; i< A.length;i++) hs.add(A[i]);	    	
	    	
	    	int p = 0;	
	    	for (int i : hs) p =i;
	   
		    if(hs.size() == X) {
		    	for(int i = 0; i< A.length;i++)	{
		    		if (A[i] == p) return i;
		    	}
		    }
		    return -1;
	    	
	    
	   
	    }
	    
	    public static void main(String[] args) {
	    	int[] A = {1,3,1,4,2,3,5,4};
	    	System.out.println(solution(5,A));
	}


}
