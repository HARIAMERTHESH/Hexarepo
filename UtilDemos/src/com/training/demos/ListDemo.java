package com.training.demos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List <String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("green apple");
		fruits.add("pineapple");
		fruits.add("1");//integer object
		
		System.out.println(fruits);
		
		for(Object fruit : fruits) {
			String fr =(String)fruit;
			System.out.println(fr.toUpperCase());
			
		}

	}
    
}
