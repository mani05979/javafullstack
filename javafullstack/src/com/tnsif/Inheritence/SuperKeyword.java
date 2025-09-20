package com.tnsif.Inheritence;

public class SuperKeyword {
	int a=10;
}
class Derieved extends SuperKeyword{
	int a=20;
	public void Hello() {
		System.out.println(a);
		System.out.println(super.a);	
	}	
}
public class Demo{
	public static void main(String[] args) {
		Derieved d =new derieved();
		d.Hello();
		
	}
}



