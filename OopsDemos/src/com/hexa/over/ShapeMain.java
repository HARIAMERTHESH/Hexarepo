package com.hexa.over;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Shape shape = new Shape();
		        shape.area(4); 
		        double circle = shape.area(7.0); 
		        System.out.println("Circle: " + circle);
		        shape.area(5, 6);

		
		        double triangleArea = shape.area(8, 5.5f); 
		        System.out.println("Triangle: " + triangleArea);
		    }


	}


