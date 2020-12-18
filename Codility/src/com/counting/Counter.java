package com.counting;

import java.util.Arrays;

public class Counter {
	
	public int[] solution(int N, int[] A) {
		
		
         int[] B = new int[N];
		 int max =0;
		 int min =0;
		 Arrays.fill(B, 0);
		 
		 for(int i : A) {
			 if(i==N+1) {
				 min = max;
			 }
			 else {
				 if(B[i-1]<min) {
					 B[i-1] = min;
				 }
				 B[i-1]++;
				 
				 if(B[i-1]>max) {
					 max = B[i-1];
				 }
			 }
		 }
		 for(int i =0;i<B.length;i++) {
			 if(B[i]<min) B[i] = min; 
		 }
		 
		return B;
    }

}
