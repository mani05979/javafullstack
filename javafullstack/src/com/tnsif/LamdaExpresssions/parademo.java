package com.tnsif.LamdaExpresssions;

public class parademo {
	public static void main(String[] args) {
		withPara w = (a) ->
		{
			System.out.println("The value of a is :" +a);
			return a;	
		};
		
		w.hello(5);


	}

}
