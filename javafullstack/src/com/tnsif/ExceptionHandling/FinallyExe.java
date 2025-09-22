package com.tnsif.ExceptionHandling;

public class FinallyExe {
	public static void main(String[] args) {
		String s=null;
		try {
			 System.out.println(s.length());
		} catch(Exception e)
		{
			
			 System.out.println("This is catch");
		}
		finally {
			System.out.println("The string is null");
		}

}
}
