package com.crackify.prototypedesignpattern;

public class PrototypeDP implements Cloneable{
	
	int size;
	int length;
	int width;
	
	public PrototypeDP(int size,int length,int width) {
		System.out.println("Using of constructor");
		this.length=length;
		this.size=size;
		this.width=width;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Prototype is "+size+" "+length+" "+width;
	}
	
	@Override
	protected PrototypeDP clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (PrototypeDP)super.clone();
	}
}
