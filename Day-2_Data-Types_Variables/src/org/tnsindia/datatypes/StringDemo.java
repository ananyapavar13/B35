package org.tnsindia.datatypes;
import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		String str1=s.next();
		System.out.println("The output is:"+str);
		System.out.println("The String is:"+str1);
		s.close();
		
	}

}
