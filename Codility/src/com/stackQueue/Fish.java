package com.stackQueue;

import java.util.Stack;

public class Fish {
	
	public static int solution(int[] A, int[] B) {
		//int numAlive = A.length;
//		if(A.length == 0)
//            return 0;
//		Stack<Integer> up = new Stack<Integer>();
//		Stack<Integer> down = new Stack<Integer>();
//		
//		for(int i=0;i<A.length;i++) {
//			
//			if( B[i] == 0) up.push(A[i]);
//			else down.push(A[i]);
//			
//		}
//		
//		while(!(up.isEmpty() || down.isEmpty())) {
//			
//			if(up.peek()>down.peek()) down.pop();
//			else up.pop();
//		}
//		return up.size()+down.size();
		
		
		int numAlive = A.length;
		if(A.length == 0)
            return 0;
		Stack<Integer> s = new Stack<Integer>();
		
		for(int i=0;i<A.length;i++) {
			
			if( B[i] == 1) s.push(A[i]);
			else {
				while( !s.isEmpty() ){
                    
					if( s.peek() > A[i] ){
                        numAlive--;
                        break;   
                    }
                    else{
                        numAlive--;
                        s.pop();  
                    }
                }
			}
			
		}
		
		return numAlive;
		
	}
	
	public static void main(String[] args) {
		int[] A = {4, 3, 2, 1, 5}; 
		int[] B = {0, 1, 0, 0, 0}; 
		System.out.println(solution(A,B));
	}

}
