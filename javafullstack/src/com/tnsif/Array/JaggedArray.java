package com.tnsif.Array;

public class JaggedArray {

	public static void main(String[] args) {
		int [][] demo  = new int [4][];
		
		
		 demo[0] = new int[] {1, 2, 3};
		 demo [1]=new int [] {3,4,5,6};
		 demo[2] = new int[] {7,8,10,4};
		 demo [3]=new int [] {3,9,5,2,1,6,};
		 System.out.println("Jagged Array Elements:");
	        for (int i = 0; i < demo.length; i++) {
	            for (int j = 0; j < demo[i].length; j++) {
	                System.out.print(demo[i][j] + " ");
	            }
	            System.out.println(); // New line after each row
	        }
	    }

	}


