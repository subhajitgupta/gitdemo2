package com.prefixSums;

public class PassingCars {
	
	public int solution(int[] A) {
		
		
		 int east = 0;
			int pass = 0;
			for(int i : A) {
				
				if(i == 0) east++;
				if(i == 1) pass+=east;

			}
			if(pass>= 1000000000 || pass<0 ) return -1;
			return pass;
		
		
		
	}

}
