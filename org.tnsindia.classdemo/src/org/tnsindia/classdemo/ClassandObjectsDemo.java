package org.tnsindia.classdemo;

import java.util.Scanner;

//driver class
public class ClassandObjectsDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the speed oof the car:");
		int speed=s.nextInt();
	
		//creation of object
		car obj=new car();
		
	//compile time input
		//obj.speed=45;
		obj.speed(speed);
		s.close();
		}

}
