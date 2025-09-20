package com.tnsif.Interface;

//Interface 1
public interface sample1 {
	int a = 23;
	void show();
}

//Interface 2 extends Interface 1
public interface sample2 extends sample1 {
	int b = 34;
	void show1();
}

//Class implementing interface
public class sample3 implements sample2 {

	@Override
	public void show() {
		System.out.println("Implementation of show() from sample1");
	}

	@Override
	public void show1() {
		System.out.println("Implementation of show1() from sample2");
	}

	public void show3() {
		System.out.println("This is a child class in the interface");
	}
}

//Main class
public class SampleMain {
	public static void main(String[] args) {
		sample1 s1 = new sample3();
		s1.show();

		sample2 s2 = new sample3();
		s2.show1();

		sample3 s3 = new sample3();
		s3.show3();
	}
}
