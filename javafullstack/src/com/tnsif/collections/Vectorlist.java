package com.tnsif.collections;

import java.util.*;
public class Vectorlist {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Red");
		v.add("Blue");
		System.out.println(v);
		v.remove("Red");                   // Remove
		System.out.println(v.elementAt(0)); // Access by index
		System.out.println("Capacity: " + v.capacity()); // Capacity


	}

}
