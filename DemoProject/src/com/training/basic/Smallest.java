package com.training.basic;

public class Smallest {
	public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int[] num = {14, 27, 39, 85, 42, 66, 64};

		        int smallest = num[0];

		        for (int i = 1;i<num.length; i++) {
		            if (num[i] < smallest) {
		                smallest = num[i]; // Update if current is greater
		            }
		        }

		        System.out.println("The smallest number in the array is: " + smallest);
		    }

	



	}


