package com.tnsif.Static;

public class variables {
	 static int count = 0; // shared across all objects

	    public variables() {
	        count++;
	        System.out.println("Object created. Count: " + count);
	    }

	    public static void main(String[] args) {
	        new variables();
	        new variables();
	        new variables();
	        new variables();
	    }
	}


