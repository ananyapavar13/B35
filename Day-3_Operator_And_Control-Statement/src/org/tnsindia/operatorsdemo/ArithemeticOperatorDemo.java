package org.tnsindia.operatorsdemo;

import java.util.Scanner;


public class ArithemeticOperatorDemo {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
System.out.println("The Addition is: "+(a+b));
System.out.println("The Subtraction is: "+(a-b));
System.out.println("The Multiplication is: "+(a*b));
System.out.println("The Division is: "+(a/b));
System.out.println("The Average is: "+(a%b));
s.close();

	}

}
