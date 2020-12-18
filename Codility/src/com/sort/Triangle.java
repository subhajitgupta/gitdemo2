package com.sort;

import java.util.Arrays;

public class Triangle {

	public static int solution(int[] A) {
		
		Arrays.sort(A);
		
		for(int i =0;i<A.length-2;i++) {
			
			if((long)A[i]+(long)A[i+1]>(long)A[i+2]) {
				return 1;
			}
		}
		return 0;
    }
	public static void main(String[] args) {
		int[] A = {5, 3, 3};
		System.out.println(solution(A));
	}
}
