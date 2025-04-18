package com.training.basic;

public class Second_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int[] arr = {7, 3, 5, 1, 9, 1};

		        if (arr.length < 2) {
		            System.out.println("Smallest element in tha aray.");
		            return;
		        }

		        int first = Integer.MAX_VALUE;   
		        int second = Integer.MAX_VALUE;

		        for (int num : arr) {           
		            if (num < first) {
		                second = first;
		                first = num;
		            } else if (num > first && num < second) {
		                second = num;
		            }
		        }

		        if (second == Integer.MAX_VALUE) {
		            System.out.println("No second smallest element found.");
		        } else {
		            System.out.println("Second smallest number is: " + second);
		        }
		    }
		}
