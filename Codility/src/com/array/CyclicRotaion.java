package com.array;

public class CyclicRotaion {
	
	public static int[] solution(int[] A, int K) {
		
		int len = A.length;
		
		int[] B = new int[len];  
		
		for(int i = 0; i< len; i++) {
			B[(i+K)%len]=A[i];
		}
		
		return B;
		
		
	}
	public static void main(String[] args) {
		int[] A = {1,3,4,65,6};
		int [] B = solution(A,3);
		for(int i:A) System.out.print(i);
		System.out.println(("\n"));
		for(int i:B) System.out.print(i);
		
	}

}
