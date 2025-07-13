package com.crackify.builderdesignpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.crackify.builderdesignpattern.BuilderDesignPattern.Builder;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		BuilderDesignPattern bd=new BuilderDesignPattern.Builder().setPhoneNumber("1212112121").build();
	System.out.println(bd.getPhoneNumber());	
	}
	
	

}
