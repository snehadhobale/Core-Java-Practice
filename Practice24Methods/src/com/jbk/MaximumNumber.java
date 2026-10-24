package com.jbk;

public class MaximumNumber {
	
	public int findMax(int p,int q,int r) {
		if(p >= q && p >= r) {
			return p;
		}else if(q >= p && q >= r) {
			return q;
		}else {
			return r;
		}
	}

}
