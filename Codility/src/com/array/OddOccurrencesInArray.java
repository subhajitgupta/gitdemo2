package com.array;

import java.util.HashMap;

public class OddOccurrencesInArray {
	
	public static int solution(int[] A) {
		
		HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<A.length; i++) {
			if(map.containsKey(A[i])) map.put(A[i], map.get(A[i])+1);
			else map.put(A[i], 1);
		}
		
		for( Integer i :map.keySet()) {
			if(map.get(i)%2!=0) return i;
		}
		
		
		return 0;
    }

	public static void main(String[] args) {


		
		int[] A = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(solution(A));
	}

}
