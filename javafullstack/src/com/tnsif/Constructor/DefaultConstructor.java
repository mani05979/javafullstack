package com.tnsif.Constructor;


class sample{
	int x=1,y=2,z=3;
	sample(){
		System.out.println("This is constructor");
	}
	public void show() {
		int value = x*y*z;
		System.out.println(value);
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		sample ob = new sample();
		ob.show();

	}

}
