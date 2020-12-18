package com.prefixSums;

public class MinAvgSlice {

	public static int solution(int[] A) {
		
		float min = Integer.MAX_VALUE; 
        int min_start_position =0; 
        
        
        for(int i=0; i< A.length -2; i++){  
        	
            float avg_2 = (float) (A[i]+A[i+1])/2;
            float avg_3 = (float) (A[i]+A[i+1]+A[i+2])/3; 


            float cur_min_avg = Math.min(avg_2, avg_3);
            
            if(cur_min_avg < min){
                min = cur_min_avg;
                min_start_position = i;//0
            }
        }
   
        int avg_2 = (A[A.length-2]+A[A.length-1]) / 2;
        if( avg_2 < min){
             min = avg_2;
             min_start_position = A.length-2;
        }
        
        return min_start_position;   
	        
	
		
	}
	public static void main(String[] args) {
		int[] A ={4,2,2,5,1,5,8};
		System.out.println(solution(A));
	}
	
	
}
