package com.timeComplexity;

public class FrogJump {
	
	public int solution(int X, int Y, int D) {
		int f = (Y-X)/D;
        int r = (Y-X)%D;
        if (r == 0)return f;
        return f+1;
    }

}
