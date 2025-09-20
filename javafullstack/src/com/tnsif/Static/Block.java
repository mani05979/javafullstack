package com.tnsif.Static;

public class Block {
	 static {
	        System.out.println("Static block runs before main!");
	    }

	    public static void main(String[] args) {
	        System.out.println("Main method running...");
	    }
}
