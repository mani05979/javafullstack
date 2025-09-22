package com.tnsif.ExceptionHandling;

public class NestedTry {
	public static void main(String[] args) {
		try {
				try {
					int a=10,b=0;
					int c=a/b;
					
				}finally {
					 System.out.println("This is not executaible");
					 
				}
		}finally {
			 System.out.println("0 cannot be divided with one");
			 
		}
		
}
}
