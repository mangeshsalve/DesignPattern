package com.crackify.singletondesignpatterns;

public class SingletonDesignPattern {
	
	private static SingletonDesignPattern instnace;
	private static String name;
	
	private  SingletonDesignPattern() {
		
	}

	
	public static  SingletonDesignPattern getInstance() {
	
		if(instnace == null) {
			instnace= new SingletonDesignPattern();
		}
		return instnace;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
