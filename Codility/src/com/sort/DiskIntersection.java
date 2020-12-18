package com.sort;

public class DiskIntersection {

	
	public static int solution(int[] A) {
		int count=0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i+1; j < A.length; j++) {
				
				if((i+A[i])>(j-A[j]) || (i-A[i])<(j+A[j])) count++;
			}
		}

		return count;
    }
	
	public static void main(String[] args) {
		int[] A = {1, 5, 2, 1, 4, 0};
		System.out.println(solution(A));
	}
	
}
