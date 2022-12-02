package org.tnsindia.interfacedemo;

import java.util.Scanner;

public class Shape implements Area {

	private Scanner s;

	public void rectangle() {
		s = new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle");
		int length=s.nextInt();
		int breadth=s.nextInt();
		System.out.println("The area of Rectangle is: "+(length*breadth));
	}
	
	public void circle() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int radius=s.nextInt();
		System.out.println("The area of Circle is: "+(3.14*radius*radius));
		s.close();
	}
	
}
