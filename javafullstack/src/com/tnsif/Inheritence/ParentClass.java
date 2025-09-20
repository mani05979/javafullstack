package com.tnsif.Inheritence;

public class ParentClass {
	void greet() {
        System.out.println("Hello from Parent!");
    }
}

class Child extends ParentClass {
    void greet() {
        super.greet();
        System.out.println("Hello from Child!");
    }
}

public class Parent {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
    }

}
