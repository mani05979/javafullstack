package com.tnsif.Inheritence;

public class Hierarichal {
	public void vehicle() {
		System.out.println("Vehicle class");
	}
}
class car extends Hierarichal{
	public void car1() {
		System.out.println("Vehicle: Car");
	}
}
class bike extends Hierarichal{
	public void bike1() {
		System.out.println("Vehicle: Bike");
	}
}
class cycle extends Hierarichal{
	public void cycl() {
		System.out.println("Vehicle: Cycle");
	}

}
