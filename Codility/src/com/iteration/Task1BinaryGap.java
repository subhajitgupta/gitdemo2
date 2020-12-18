package com.iteration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1BinaryGap {
	
	    public static int solution(int N) {
	    	int count = 0;
	    	ArrayList<Integer> arr = new ArrayList<>();
	        String bin = Integer.toBinaryString(N);
	        
	        for (int i =0;i<bin.length();i++) {
	        	
	        	if (bin.charAt(i) == '0') {
	        		count++;
	        	}
	        	
	        	else {
	        		arr.add(count);
	        		count = 0;
	        	}
				
			}
	        return Collections.max(arr);
	    }
	    
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
	    	int flag =1;
	    	do{
	    		
				System.out.println("Enter a number");
				int n = sc.nextInt();
				System.out.println("Required ans : " + solution(n));
				m.put(solution(n),n);
				System.out.println("press 1 to continue");
				flag = sc.nextInt();
			}while(flag == 1);
	    	System.out.println("Enter the binary Gap");
	    	int n = sc.nextInt();
	    	System.out.println("The number is : "+ m.get(n) );
	    	
	    	
	    	sc.close();
	    	
		}

}
