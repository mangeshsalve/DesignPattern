package com.crackify.singletondesignpatterns;

public class Main {

	public static void main(String[] args) {
		SingletonDesignPattern designPattern=SingletonDesignPattern.getInstance();
		designPattern.setName("Mangesh");
		SingletonDesignPattern designPattern1=SingletonDesignPattern.getInstance();
		designPattern1.setName("Swapnil");
		System.out.println(designPattern.equals(designPattern1));
		System.out.println(designPattern1.getName());
		
	}
}
