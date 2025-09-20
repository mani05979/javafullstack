package com.tnsif.FinalKey;

public class Finalvariable {
	final int MAX_USERS = 100; // constant

    public void showLimit() {
        System.out.println("Max allowed users: " + MAX_USERS);
    }

    public static void main(String[] args) {
        Finalvariable obj = new Finalvariable();
        obj.showLimit();
        // obj.MAX_USERS = 200;This would cause a compile-time error
    }
}
