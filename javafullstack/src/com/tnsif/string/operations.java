package com.tnsif.string;

public class operations {
	

	    public static void main(String[] args) {

	        // Declare strings
	        String str1 = "Hello";
	        String str2 = "World";
	        String str3 = "   Java Programming   ";

	        // 1. length()
	        System.out.println("Length of str1: " + str1.length());

	        // 2. charAt()
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. concat()
	        String str4 = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated string: " + str4);

	     
	        // 4. toUpperCase() and toLowerCase()
	        System.out.println("str1 in upper case: " + str1.toUpperCase());
	        System.out.println("str1 in lower case: " + str1.toLowerCase());

	        // 5. substring()
	        System.out.println("Substring of str4 from index 6: " + str4.substring(6));
	        System.out.println("Substring of str4 from index 0 to 5: " + str4.substring(0, 5));

	        // 6. contains()
	        System.out.println("Does str4 contain 'World'? " + str4.contains("World"));

	        // 7. replace()
	        System.out.println("Replace 'l' with 'x' in str1: " + str1.replace('l', 'x'));


	        // 8. trim()
	        System.out.println("Original with spaces: '" + str3 + "'");
	        System.out.println("After trim(): '" + str3.trim() + "'");

	        // 9. isEmpty()
	        String emptyStr = "";
	        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());

	        // 10. split()
	        String csv = "apple,banana,grape";
	        String[] fruits = csv.split(",");
	        System.out.println("Split string:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }


	        // 11. join()
	        String joined = String.join("-", "Java", "Python", "C++");
	        System.out.println("Joined string: " + joined);
	    }
	}



