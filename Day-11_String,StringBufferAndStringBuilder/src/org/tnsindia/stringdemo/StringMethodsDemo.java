package org.tnsindia.stringdemo;

import java.util.Scanner;

public class StringMethodsDemo {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();
		//to combine two strings
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));
		
		//to find length of the string
		System.out.println("The length of the Str1 is:"+str1.length());
		System.out.println("The index of the Str1 is: "+str1.indexOf('n'));
		System.out.println("The char at the 3rd index of Str1 is: "+str1.charAt(3));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		
	}

}
