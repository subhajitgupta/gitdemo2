package com.prefixSums;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class GeomRangeQuery {
	
	
	public int[] solution(String S, int[] P, int[] Q) {
		
		int[] R  = new  int[P.length]; 
		
		LinkedHashMap<Character,Integer> hm= new LinkedHashMap<Character,Integer>();
		hm.put('A',1);
		hm.put('C', 2);
		hm.put('G', 3);
		hm.put('T', 4);
		
		
		for(int i = 0;i< P.length;i++) {
			
			int first = P[i];
			int last = Q[i]+1;
			
			String str = S.substring(first,last);
			
			
//			char[] ch = str.toCharArray();
//			int min =Integer.MAX_VALUE;
//			for(char c:ch) {
//				int temp = hm.get(c);
//				if(temp<min) min = temp;
//			}
//			R[i] = min;			

			for(char c:hm.keySet()) {
				if(str.indexOf(c) != -1) {
					R[i] = hm.get(c); 
					break;
				}
			}

			
		}
			
		return R;
		
	}

}

