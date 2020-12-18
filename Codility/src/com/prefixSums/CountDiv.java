package com.prefixSums;

public class CountDiv {
	
	public static int solution(int A, int B, int K) {
		
		if(A == 0) return (B/K +1);	
		return (B/K) -((A-1)/K);
		
    }
	public static void main(String[] args) {
		System.out.println(solution(0,0,2));
	}

}
