package com.crackify.prototypedesignpattern;

public class Main {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypeDP dp=new PrototypeDP(10, 20, 30);
		PrototypeDP dp1=dp.clone();
		dp1.size=100;
		PrototypeDP dp2=dp.clone();
		
		System.out.println(dp == dp1);
		System.out.println(dp1);
		System.out.println(dp2);
	}

}
