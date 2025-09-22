package com.tnsif.ExceptionHandling;

public class MulCatch {
	public static void main(String[] args) {
		
		String s=null;
		try {
			 System.out.println(s.length());
			 
		} catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("This is orginal catch");
		}		
		catch(Exception e)
		{
			
			 System.out.println("This is catch");
		}
		
		
		

}
}

