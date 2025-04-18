package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {14, 27, 39, 85, 42, 66, 64};

        int greatest = num[0];

        for (int i = 1;i<num.length; i++) {
            if (num[i] > greatest) {
                greatest = num[i];
            }
        }

        System.out.println("The greatest number in the array is: " + greatest);
    }

	}


