package com.tnsif.FinalKey;


	final class SecureData {
	    public void display() {
	        System.out.println("Secure data access.");
	    }
	}

	// Cannot extend SecureData
	// class Hacker extends SecureData { } // This would cause an error

	public class FinalClass {
		
	    public static void main(String[] args) {
	        SecureData sd = new SecureData();
	        sd.display();
	    }
	}


